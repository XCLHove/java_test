package shiyan2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class shiYan2_Demo {
    public static void main(String []args){
        Complex []cArr={new Complex(3,2),new Complex(3,-2),new Complex(4,1),new Complex(4,-1),
                new Complex(1,0),new Complex(0,0),new Complex(0,-2),new Complex(0,1),new Complex(0,-1)};
        for(Complex c:cArr)
            System.out.print("  " + c + "\n");
        Complex c1 = new Complex(3,2),c2 = new Complex(3,-2);
        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c1+c2=" + c1.complexAdd(c2));
        System.out.println("c1-c2=" + c1.complexSub(c2));
        System.out.println("c1*c2=" + c1.complexMulti(c2));
        System.out.println("c1/c2=" + c1.complexDiv(c2));
        /*while(true){
            System.out.print("输入复数cp1:");
            Scanner sc = new Scanner(System.in);
            Complex cp1 = new Complex(sc.nextDouble(),sc.nextDouble());
            System.out.println("cp1: " + cp1 + "\n输入复数cp2:");
            Scanner sc2 = new Scanner(System.in);
            Complex cp2 = new Complex(sc2.nextDouble(),sc2.nextDouble());
            System.out.println("cp2: " + cp2);
            System.out.println("cm=" + cp1.minPoint(cp2));
            System.out.println("cm.arg=" + new DecimalFormat("#.###").format(cp1.minPoint(cp2).getArg()));
            System.out.println("cm*4=" + cp1.minPoint(cp2).multiReal(4));
            System.out.println("add " + cp1.complexAdd(cp2));
            System.out.println("sub " + cp1.complexSub(cp2));
            System.out.println("mu " + cp1.complexMulti(cp2));
            System.out.println("div " + cp1.complexDiv(cp2));
        }*/
    }
}
