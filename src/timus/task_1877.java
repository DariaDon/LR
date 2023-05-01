package timus;

import java.util.Scanner;

public class task_1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите код, установленный на первом замке: ");
        int code1 = scanner.nextInt();

        System.out.println("Введите код, установленный на втором замке: ");
        int code2 = scanner.nextInt();

        if (code1 % 2 == 0 || code2 % 2 != 0) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
