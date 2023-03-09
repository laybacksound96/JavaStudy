package example.interfaceTest.aa;

import java.util.Calendar;

public class jav {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
        System.out.println(today.get(Calendar.MONTH) + 1 + "월 " + today.get(Calendar.DATE) + "일");
        System.out.println("오후 " + today.get(Calendar.HOUR) + "시 " + today.get(Calendar.MINUTE) + "분");

        String[] str = {"","일","월","화","수","목","금","토"};		
		System.out.println(str[today.get(Calendar.DAY_OF_WEEK)] + "요일");
	}

}

