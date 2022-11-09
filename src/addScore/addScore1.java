package addScore;

import java.util.Scanner;

public class addScore1 {
    public static void main(String[] args) {
        while (true) {
            int count = 0;
            Scanner input = new Scanner(System.in);
            int in = input.nextInt();
            for (int i = 2; i <= Math.sqrt(in); i++) {
                if(in%i==0){
                    count+=2;
                }
                if(i*i==in){
                    count--;
                }
            }
            if (count == 0) {
                System.out.println("Error");
            } else {
                System.out.println("count=" + count);
            }
        }
    }
}