package for01;

import java.util.Scanner;

public class Random08 {
    public static void main(String[] args) {
        // Random() 메소드는 난수를 생성한다.
        // 0.0 ~ 0.999999999 사이의 난수를 생성함.

        
        
        
        int randomNumber = (int) (Math.random() * 6 + 1);

        
        Scanner sc = new Scanner(System.in);
        
        
        for (int i = 2; i >= 0; i--) {
            System.out.println("Input number 1~6" + "and::" + randomNumber);
            int inputNumber = sc.nextInt();

            if (randomNumber == inputNumber) {
                System.out.println("Correct");
                break;
            } else {
                System.out.println("Wrong number, Remained Chance is :"+i);
                continue;
            }
        }
        sc.close();

        
    }
}
