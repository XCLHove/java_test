package card;

import java.time.LocalDateTime;

public class cardID {
    private String cardNum;
    cardID(String cn){
        this.cardNum = cn;
    }
    public void setCardNum(String cardNum){//换一个号码
        this.cardNum = cardNum;
    }
    public boolean lengthVerify(){
        if (this.cardNum.length() != 18){
            System.out.println("长度有错！");
            return false;
        }
        return true;
    }
    public boolean charVerify(){
        int i;
        for(i = 0; i < 17; i++){
            if ((this.cardNum.charAt(i) < '0') || (this.cardNum.charAt(i) > '9')){
                System.out.println("输入非数字字符！");
                return false;
            }
        }
        if ((this.cardNum.charAt(17) != 'x') && (this.cardNum.charAt(i) != 'X') && (this.cardNum.charAt(i) < '0') && (this.cardNum.charAt(i) > '9')) {
            System.out.println("最后一位错误！");
            return false;
        }
        return true;
    }
    public boolean checkcodeVerify(){
        int ai[]=new int[18];
        double wi[]=new double[18];
        char id[] = this.cardNum.toCharArray();
        char jym[]={'1','0','X','9','8','7','6','5','4','3','2'};
        for(int i = 0; i < 17; i++){
            ai[i] = id[i] - '0';
        }
        ai[17] = 0;
        for(int i = 0; i < 18; i++){
            wi[i] = Math.pow(2,18 - i);
        }
        int sum = 0;
        for(int i = 0; i < 18; i++){
            sum += ai[i] * wi[i];
        }
        System.out.println("sum=" + sum);
        if (id[17] != jym[sum % 11]){
            System.out.println("最后一位校验码错误！\n正确的校验码为：" + jym[sum % 11]);
            return false;
        }
        return false;
    }
    public void output(){
        LocalDateTime today = LocalDateTime.now();
        System.out.println("当前日期："+today.getYear()+"年"+today.getMonthValue()+"月"+today.getDayOfMonth()+"号");
        int nowYear = today.getYear(),
                nowMonth = today.getMonthValue(),
                nowDayOfMonth = today.getDayOfMonth(),
                nowDayOfYear = today.getDayOfYear();
        String birthYear= this.cardNum.substring(6,10),
                birthMonth = this.cardNum.substring(10,12),
                birthDay = this.cardNum.substring(12,14);
        char sex = this.cardNum.charAt(16);
        int bY = Integer.parseInt(birthYear),
                bM = Integer.parseInt(birthMonth),
                bD = Integer.parseInt(birthDay);
        System.out.println("生日："+bY+"年"+bM+"月"+bD+"号");
        LocalDateTime bHD=LocalDateTime.of(bY,bM,bD,0,0);
        int birthDayOfYear = bHD.getDayOfYear(),
                Sex = sex-48,
                age = nowYear-bY;
        //System.out.println("age="+ age);
        if( (bM==nowMonth) && (bD==nowDayOfMonth) ){
            System.out.println("生日快乐！");
        }
        if (nowMonth < bM){
            age--;
        }
        else {
            if(nowDayOfMonth < bD && nowMonth == bM){
                age--;
            }
        }
        System.out.println("年龄:" + age + "\n性别:" + ((Sex%2==0)?"女":"男"));
    }
}
