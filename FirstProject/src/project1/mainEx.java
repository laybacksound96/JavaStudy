package project1;

import java.util.Scanner;

public class mainEx {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int selectMenu;
		int inputParamA;
		int inputParamB;
		while(true) {
			System.out.println("1) 약수 2) 최소공배수 3) 최대공약수 **그 외의 키 입력시 종료");
			System.out.println(selectMenu = inputScanner.nextInt());
			
			if(selectMenu==1) {
				System.out.println("구할 약수를 입력");
				System.out.println(inputParamA = inputScanner.nextInt());
				System.out.println(inputParamA+"의 약수는: "+calc.divisor(inputParamA));
			}else if(selectMenu==2) {
				System.out.println("구할 최소공배수의 첫 번째 정수를 입력");
				System.out.println(inputParamA = inputScanner.nextInt());
				System.out.println("구할 최소공배수의 두 번째 정수를 입력");
				System.out.println(inputParamB = inputScanner.nextInt());
				System.out.println(inputParamA+"과"+inputParamB+"의 최소공배수는: "+calc.CalcleastCommonMultiple(inputParamA, inputParamB));
			}else if(selectMenu==3) {
				System.out.println("구할 최대공약수의 첫 번째 정수를 입력");
				System.out.println(inputParamA = inputScanner.nextInt());
				System.out.println("구할 최대공약수의 두 번째 정수를 입력");
				System.out.println(inputParamB = inputScanner.nextInt());
				System.out.println(inputParamA+"과"+inputParamB+"의 최대공약수는: "+calc.CalcGreatestCommonDivisor(inputParamA, inputParamB));
			}else {
				System.out.println("종료됨");
				inputScanner.close();
				return;
			}
		}
		
		
	}
}
