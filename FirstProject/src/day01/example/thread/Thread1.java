package day01.example.thread;

import java.util.Scanner;

public class Thread1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.test2();
    }

    private void test2() {
        Scanner scanner = new Scanner(System.in);
        Thread calcThread1 = new MultipleCalculator(2,1);
        Thread calcThread2 = new MultipleCalculator(3, 2);
        
        calcThread1.start();
        calcThread2.start();
        
        while (true) {
            String line = scanner.nextLine();
            if (line == "") {
                calcThread1.interrupt();
                calcThread2.interrupt();
                System.out.println("실행종료됨");
                break;
            }
        }
        scanner.close();
        return;
    }


    class MultipleCalculator extends Thread {
        int multipleArg;
        int secToWait;

        MultipleCalculator(int multipleArg, int secToWait) {
            this.multipleArg = multipleArg;
            this.secToWait = secToWait;
        }
        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            try {
                multiplier(multipleArg,secToWait);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


    public void multiplier(int param, int waitSec) throws InterruptedException {
        try {
            for (int i = 1;; i++) {
                int result = i * param;
                System.out.println(waitSec+"초마다 실행됨("+param+"의 배수"+")"+result);
                Thread.sleep(waitSec *1000);
            }
        } catch (InterruptedException  e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
        }
        
    }
    
}
