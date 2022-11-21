package shiYan3;

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
//用死循环反复测试输入、验证、输出
//注意第一步验证失败不能进入第二步，第二步失败不能进入第三步，所有验
//证通过才能进行输出。
        while (true) {
            Scanner sc = new Scanner(System.in);
            String cardNum = sc.nextLine();
            CardId s1 = new CardId(cardNum);
            if (!s1.lengthVerify()) {
                System.out.println("长度有错！");
                continue;
            }
            if (!s1.placeVerify()) {
                if (s1.charVerify()) {
                    System.out.println("字符正确！");
                }
                continue;
            }
            else {
                if(!s1.charVerify()){
                    continue;
                }
            }
            if(s1.checkcodeVerify()){
                s1.output();
            }
        }
    }
}