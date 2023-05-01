package timus;

import java.util.Scanner;

public class task_1639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = (n * m) % 2;
        System.out.println((result != 0) ? ("[second]=:]") : ("[:=[first]"));
    }
}
