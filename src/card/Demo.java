package card;

import java.util.Scanner;

class Demo{
    public static void main(String []args){
//用死循环反复测试输入、验证、输出
//注意第一步验证失败不能进入第二步，第二步失败不能进入第三步，所有验
//证通过才能进行输出。
        while(true){
            Scanner sc=new Scanner(System.in);
            String cardNum=sc.nextLine();
            cardID s1=new cardID(cardNum);
            s1.output();
            if(s1.lengthVerify()&&s1.charVerify()&&s1.checkcodeVerify())
                s1.output();
        }
    }
}
