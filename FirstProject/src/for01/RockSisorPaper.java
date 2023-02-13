package for01;

import java.util.Scanner;

public class RockSisorPaper {
    public int inputToInt(String input) {
        int result = 0;
        switch (input) {
            case "가위":
                result = 1;
                break;
            case "바위":
                result = 2;
                break;
            case "보":
                result = 3;
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 3) + 1;
        RockSisorPaper a = new RockSisorPaper();
        
        

        System.out.println("컴퓨터는 뭘 낼지 결정했습니다.\n가위, 바위, 보 중 하나를 입력해보세요.");
        
        int result = a.inputToInt(sc.next());
        switch (result - num) {
            case 1: case -2:
                System.out.println("당신의 승리입니다");
                break;
            case -1: case 2:
                System.out.println("당신의 패배입니다.");
                break;
            case 0:
                System.err.println("무승부입니다");
        }     
        sc.close();
    }
}
