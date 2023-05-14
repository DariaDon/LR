package LR5;

import java.util.Arrays;
import java.util.OptionalInt;

public class Task5 {
    static int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int MaxElem = 0;

    static class JThread extends Thread {
        public JThread(String name) {
            super(name);
        }

        @Override
        public synchronized void run() {
            OptionalInt max = Arrays.stream(array).max();
            MaxElem = max.getAsInt();
            System.out.println(MaxElem);
            this.interrupt();
        }
    }

    public static void main(String[] args) {
        for(int i=1; i < 5; i++)
            new JThread("Thread " + i).start();
    }
}
