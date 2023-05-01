package timus;

import java.util.Scanner;

public class task_1820 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (k >= n) {
            System.out.print(2);
        } else if (n * 2 % k == 0) {
                System.out.print(n * 2 / k);
        } else {
                System.out.print(n * 2 / k + 1);
        }
    }
}
