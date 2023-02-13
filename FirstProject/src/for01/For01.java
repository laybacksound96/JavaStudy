package for01;

import java.util.Scanner;

public class For01 {
 

    int calc(int operand1, int operand2, String operator) {
        int result=0;
        switch(operator){
            case"+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        For01 calc = new For01();

        System.out.println("Start Calculating. Write a first operand:");
        int operand1 = sc.nextInt();
        System.out.println("Next step. Write a operator:");
        String operator = sc.next();
        System.out.println("Final step. Write a second operand11:");
        int operand2 = sc.nextInt();

        for (int i = 0; i <= 2; i++) {
            System.out.println(i + "st result : " + calc.calc(operand1, operand2, operator));
        }
        sc.close();
    }

}
