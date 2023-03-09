package example.exception01;

import java.util.Scanner;

public class _04_NumberFormatException {
    public static void main(String[] args) {
        System.out.println("1번 문제. 대한민국의 수도는?");
        
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine());

        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.println("2번 문제. 대한민국의 수도는?");
    }
}
