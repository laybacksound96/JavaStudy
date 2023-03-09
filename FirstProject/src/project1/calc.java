package project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class calc {
	
	//약수 구하기
	static List<Integer> divisor(int divisor) {
		List<Integer> result = new ArrayList<>();
		for(int i = 1; i<divisor+1; i++) {
			if(divisor%i==0) {
				result.add(i);
			}
		}
		return result; 
	}
	
	//최대공약수 구하기
	static int CalcGreatestCommonDivisor(int divisorA, int divisorB) {
		List<Integer> submultipleA = divisor(divisorA);
		List<Integer> submultipleB = divisor(divisorB);
		
		List<Integer> CommonDivisor = CalcCommonDivisor(submultipleA,submultipleB);
		return Collections.max(CommonDivisor);
	}
	
	//공약수 찾는 함수
	static List<Integer> CalcCommonDivisor(List<Integer> divisorA , List<Integer> divisorB){
		List<Integer> result = new ArrayList<>();
		for(int i : divisorA) {
			for(int j : divisorB) {
				if(i == j) {
					result.add(i);
				}
			}
		}
		return result;
		
	}
	
	//최소공배수는 유클리드 알고리즘에 의해 두 인수의 곱을 두 인수의 최대공약수로 나눈다.
	static int CalcleastCommonMultiple(int divisorA, int divisorB) {
		int result = (divisorA*divisorB)/CalcGreatestCommonDivisor(divisorA,divisorB);
		return result;
	}
	
}
