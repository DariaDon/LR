package LR3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task6_LinkedList {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        LinkedList list = new LinkedList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("Input N: ");
        int N = in.nextInt();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        System.out.println(list);
        Iterator iterator = list.iterator();
        int i = 0;

        while (list.size() > 1) {
            if (iterator.hasNext()) {
                i++;
                iterator.next();
                {
                    if (i == 2) {
                        iterator.remove();
                        i = 0;
                        System.out.println(list);
                    }
                }
            }
            else {
                iterator = list.iterator();
            }
        }
        System.out.println((System.currentTimeMillis() - start));
    }
}