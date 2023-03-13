package day01.example.thread;

public class Thread1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.test3();
    }

    private void test2() {
        Thread th1 = new MyThread1();
        Thread th2 = new MyThread2();
        th1.start();
        th2.start();
    }

    private void test3() {

        String[] arr = { "A", "B", "C", "D", "E", "F", "G" };
        for (String element : arr) {
            new Thread(new Foo(element)).start();
        }
    }

    class MyThread1 extends Thread {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            a("a");
        }
    }

    class Foo implements Runnable {
        private String str;

        public Foo(String str) {
            this.str = str;
        }

        public void run() {
            for (int i = 0; i < 300; i++) {
                System.out.print(str);
            }
        }
    }


    class MyThread2 extends Thread {
        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            b("b");
        }
    }

    private void test1() {
        a("a");
        b("b");
    }
    
    public void a(String str) {
        for (int i = 0; i < 300; i++) {
            System.out.println(str);
        }
    }

    public void b(String str) {
        for (int i = 0; i < 300; i++) {
            System.out.println(str);
        }
    }
}
