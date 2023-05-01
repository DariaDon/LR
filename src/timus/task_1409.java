package timus;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество банок, простреленных Гарри: ");
        int n = scanner.nextInt();

        System.out.println("Введите количество банок, простреленных Ларри: ");
        int m = scanner.nextInt();

        int harry = m - 1;
        int larry = n - 1;

        System.out.println(harry + " " + larry);
    }
}
