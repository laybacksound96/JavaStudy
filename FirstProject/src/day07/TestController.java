/*
1번째 주민번호 입력 : 901231-2190087688

잘못된 주민번호 형식입니다. 다시입력하세요.

1번째 주민번호 입력 : 901231-2190087

2번째 주민번호 입력 : 880103-1231981

3번째 주민번호 입력 : 980821-2908874

4번째 주민번호 입력 : 020430-6553812

잘못된 주민번호 형식입니다. 다시입력하세요.

4번째 주민번호 입력 : 020430-4553812

5번째 주민번호 입력 : 930723-1273317

--- 주민번호 정보 등록 완료 ---

[901231-2******, 880103-1******, 980821-2******, 020430-4******, 930723-1******]

코드

[ TestController.java ]
*/
// package com.kh.exam.controller;
package day07;
import java.util.Arrays;
import java.util.Scanner;
public class TestController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] personArr = new String[5];
        
        int j = 0;
        while (j < personArr.length) {
            
            System.out.print((j+1) + "번째 주민번호 입력 : ");
            String personId = sc.nextLine();
            if (personId.length() == 14) {
                char gender = personId.charAt(8);
                System.out.println(gender);
                System.out.println(personId.length());
                if (gender == '1' || gender == '2' || gender == '3' || gender == '4') {
                    personArr[j] = personId.substring(0, 8) + "******";
                    j++;
                } else {
                    System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
                }
            } else {
                System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
            }
        }
    System.out.println("--- 주민번호 정보 등록 완료 ---");
    System.out.println(Arrays.toString(personArr));
    }
}