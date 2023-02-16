package day07;

public class asd3 {

    public static int substract(int b, int v) {
        int result;
        if (b < v) {
            return -999;

        } else {
            result = b - v;
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(substract(10, 20));
        System.out.println(substract(20,10));
    }
}
