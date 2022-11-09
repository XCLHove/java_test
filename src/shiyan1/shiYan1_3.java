package shiyan1;

import java.util.*;
import java.lang.*;

public class shiYan1_3 {
    public static void main(String[] args) {
        int line=1;
        System.out.println("输入层数:");
        Scanner lc = new Scanner(System.in);
        int lineCount = lc.nextInt();
        for(int i=lineCount;i>0;i--){
            for( int j = ( ( (lineCount * 2 - 1 ) - ( line * 2 - 1) ) / 2 );j>0;j--){
                System.out.print(" ");
            }
            if (line % 2 == 1) {
                for (int j = line;j > 0;j--) {
                    System.out.print("1 ");
                }
            }
            else{
                for (int j = line;j > 0;j--) {
                    System.out.print("2 ");
                }
            }
            for( int j = ( ( (lineCount * 2 - 1) - (line * 2 - 1) ) / 2 ) - 1 ; j > 0 ; j--){
                    System.out.print(" ");
            }
            line++;
            if (i>1) System.out.print("\n");
        }
    }
}