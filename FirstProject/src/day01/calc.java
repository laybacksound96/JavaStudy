package day01;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String operator;
        int num1;
        int num2;

        System.out.println("input num1?");
        num1 = sc.nextInt();
        System.out.println("input operator?");
        operator = sc.next();
        System.out.println("input num2?");
        num2 = sc.nextInt();

        switch(operator){
            case "+":
                System.out.println(num1+num2);            
                break;
            case "-":
                System.out.println(num1-num2);            
                break;
            default:
                System.out.println("invalid error");
                break;
        }
        sc.close();
    }
}
