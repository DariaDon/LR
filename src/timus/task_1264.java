package timus;

import java.util.Scanner;

public class task_1264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = n * (m + 1);

        System.out.println(result);
    }
}