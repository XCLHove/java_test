package shiyan1;

import java.lang.*;

public class shiYan1_2 {
    public static void main(String[] args) {
        int count=2;
        for (int i=5;i < 1000000;i += 2) {
            for (int j = 3; j <= (Math.sqrt(i) + 2);j += 2) {
                if (i % j == 0) break;
                if (j > Math.sqrt(i)){
                    count++;
                }
            }
        }
        System.out.println("1,000,000之内的素数有"+count+"个");
    }
}