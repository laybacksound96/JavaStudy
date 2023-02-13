package for01;

import java.util.Scanner;

public class For04 {
    public static void main(String[] args) {
        /*
         * 
         */
        // for (int i = 2; i <= 9; i++) {
        //     System.out.println(i + "단 -------------");
        //     for (int j = 1; j <= 9; j++) {
        //         System.out.println(i + "*" + j + "=" + i * j);
        //     }
        // }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number what kind of you want: ");
        int inputedInt = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 9; i++) {
            System.out.println(inputedInt+"*"+i+"="+inputedInt*i);
        }

        

        
    }
}
