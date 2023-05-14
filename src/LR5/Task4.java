package LR5;

public class Task4 {
    static class JThread extends Thread {

        JThread(String name) {
            super(name);
        }

        public void run() {
            System.out.printf("%s \n", Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++)
            new JThread("Thread №" + i).start();
    }
}
