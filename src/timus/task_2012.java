package timus;

import java.util.Scanner;

public class task_2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сколько задач хочет решить Гриша за первый час: ");
        int f = scanner.nextInt();

        int time = (12 - f) * 45;

        if (time <= 240) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
