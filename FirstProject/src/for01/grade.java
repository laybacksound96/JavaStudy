package for01;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = 0;
        while (grade != -1) {
            if (grade >= 0 && grade <= 100) {
                System.out.println("학점을 입력해주세요.");
                grade = sc.nextInt();
                if (grade >= 80 && grade <= 100) {
                    System.out.println("A");
                }else if(grade >= 60 && grade <= 79){
                    System.out.println("B");
                } else if (grade >= 40 && grade <= 59) {
                    System.out.println("C");
                } else if (grade==-1) {
                    break;
                }else{
                    System.out.println("F");
                }
            } else {
                System.out.println("유효하지 않은 숫자입니다.");
                grade = 0;
            }
        }
        sc.close();
    }
    


}
