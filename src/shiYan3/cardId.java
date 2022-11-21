package shiYan3;

import java.lang.*;
import java.time.*;
import java.util.Scanner;

class CardId{
    private String cardNum;
    CardId(String cn){
        this.cardNum = cn;
    }
    public void setCardNum(String cardNum){
        this. cardNum= cardNum;
    }
    public boolean lengthVerify(){
        if(this.cardNum.length()!=18) {
            //System.out.println("长度有错！");
            return false;
        }
        else
            return true;
    }
    public boolean charVerify(){
        int i=0;
        for(i=0;i<17;i++){
            if('0'<=this.cardNum.charAt(i)&&this.cardNum.charAt(i)<='9')
                continue;
            else {
                System.out.println("输入非数字字符！！");
                return false;
            }
        }
        if((i==17)&&((this.cardNum.charAt(17)=='X')||(this.cardNum.charAt(17)=='x')
                ||('0'<=this.cardNum.charAt(17)&&this.cardNum.charAt(17)<='9')))
            return true;
        else
            System.out.println("输入非数字字符！！");
            return false;
    }
    public boolean checkcodeVerify(){
        int aiArr[]=new int[18];
        int wiArr[]=new int[18];
        double j=18;
        int sum=0;
        char aiCh[]=new char[18];//身份证的字符数组
        char jy[]={'1','0','X','9','8','7','6','5','4','3','2'};
        aiCh=this.cardNum.toCharArray();
        for(int i=0;i<17;i++){
            aiArr[i]=aiCh[i]-48;
        }
        aiArr[17]=0;
        for(int i=0;i<18;i++,j--){
            wiArr[i]=((int)Math.pow((double) 2,j-1))%11;
        }
        for(int i=0;i<18;i++){
            sum=sum+aiArr[i]*wiArr[i];
        }
        sum=sum%11;
        if(jy[sum]==aiCh[17])
            return true;
        else

            System.out.println("最后一位校验码错误！\n正确的校验码为：" + jy[sum]);
            return false;
    }
    public boolean placeVerify(){
        String cs = this.cardNum.substring(2,4),
                qx = this.cardNum.substring(4,6);//510525200205188433
        int csNum = Integer.parseInt(cs);
        int qxNum = Integer.parseInt(qx);
        if (csNum >= 1 && csNum <= 50){
            if (qxNum >= 1 && qxNum <= 50){
                return true;
            }
            else {
                System.out.println("区县编码错误!");
                return false;
            }
        }
        else {
            if (qxNum >= 1 && qxNum <= 50){
                System.out.println("城市编码错误!");
            }
            else {
                System.out.println("区县编码和城市编码都错误!");
            }
        }
        return false;
    }
    public void output(){
        LocalDateTime today=LocalDateTime.now();
        int nowYear=today.getYear(),
                nowMonth=today.getMonthValue(),
                nowDay=today.getDayOfMonth(),
                nowdiday=today.getDayOfYear();
        String byear=this.cardNum.substring(6,10),
                bmonth=this.cardNum.substring(10,12),
                bday=this.cardNum.substring(12,14);
        char sex=this.cardNum.charAt(16);
        int byea=Integer.parseInt(byear),
                bmon=Integer.parseInt(bmonth),
                bdy=Integer.parseInt(bday);
        LocalDateTime birrhday=LocalDateTime.of(byea,bmon,bdy,0,0);
        int birthdiday=birrhday.getDayOfYear(),sx=sex-48,older=nowYear-byea;
        if(nowMonth<=bmon){
            if(nowMonth<bmon)
                older-=1;
            else{
                if(nowDay<bdy)
                    older-=1;
            }
        }
        System.out.println("生日："+byea+"年"+bmon+"月"+bdy+"号");
        System.out.println("当前日期："+today.getYear()+"年"+today.getMonthValue()+"月"+today.getDayOfMonth()+"号");
        if( (bmon==nowMonth) && (bdy==nowDay) ){
            System.out.println("生日快乐！");
        }
        if(birthdiday<nowdiday){
            System.out.println("年龄："+older);
        }
        else if(birthdiday>nowdiday){
            System.out.println("年龄："+older);
        }
        else
            System.out.println("年龄：");
        System.out.println("性别："+((sx%2==0)?"女":"男"));
    }
}
