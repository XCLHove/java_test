package shiyan1;

import java.util.*;

public class shiYan1_1 {
    public static void main(String[] args) {
        int max = 0, min = 0, maxCount = 0, minCount = 0, scoreCount = 0;
        float sum = 0;
        System.out.println("输入分数，以end结束");
        Scanner score = new Scanner(System.in);
        while (score.hasNextInt()) {
            int sc = score.nextInt();
            sum = sum + sc;
            scoreCount++;
            if ((max == 0) && (min == 0)) {
                max = sc;
                min = sc;
            }
            if (sc == max) {
                maxCount++;
            } else if (sc > max) {
                maxCount = 1;
                max = sc;
            } else {
                min = sc;
            }
        }

            System.out.print("最高分:" + max + ",最低分:" + min);
            System.out.printf(",平均分:%.2f", (sum / scoreCount));
            if (maxCount > 1) System.out.print(",同时存在" + maxCount + "个最高分");
    }
}