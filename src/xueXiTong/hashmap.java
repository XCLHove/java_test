package xuexitong;

import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;

public class hashmap {
    public static void main(String[] args) {
        while(true){
            HashMap<Integer, Integer> num = new HashMap<>();
            System.out.println("input:");
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()){
                int sci = sc.nextInt();
                if (num.get(sci) == null){
                    num.put(sci,1);
                }
                else {
                    num.put(sci,num.get(sci) + 1);
                }
            }
            System.out.println("output:");
            for (Integer key : num.keySet()) {
                if (num.get(key) == 2)
                    System.out.println(key + " : " + num.get(key));
            }
        }
    }
}
