package LR5;

import java.util.stream.IntStream;

public class Task6 {
    static int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    static class JThread extends Thread {
        public JThread(String name) {
            super(name);
        }

        @Override
        public synchronized void run() {
            int sum = IntStream.of(array).sum();
            System.out.println(sum);
            this.interrupt();
        }
    }

    public static void main(String[] args) {
        for(int i=1; i < 5; i++)
            new JThread("Thread " + i).start();
    }
}
