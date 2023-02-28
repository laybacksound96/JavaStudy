package example.exception01;

public class _04_NumberFormatException {
    public static void main(String[] args) {
        String[] strNum = { "23", "17", "3.141592" };
        int i = 0;
        try{    
            for (i = 0; i < strNum.length; i++) {
                int x = Integer.parseInt(strNum[i]);
                System.out.println(x);
            }
        } catch (NumberFormatException e) {
            System.out.println(strNum[i]+"에서 문제가 발생함 : 실수를 정수로 변환하지 못하여 오류가 발생하였음" );
        }
    }
}
