package timus;

import java.util.Scanner;

public class task_2001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();

        int berries1 = b3 - b1;
        int berries2 = b1 - b2;

        System.out.println(berries1 + " " + berries2);
    }
}
