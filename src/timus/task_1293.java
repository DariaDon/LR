package timus;

import java.util.Scanner;
public class task_1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input N:");
        int N = in.nextInt();

        System.out.println("Input A:");
        int A = in.nextInt();

        System.out.println("Input B:");
        int B = in.nextInt();

        System.out.println(N * A * B * 2);
        in.close();
    }
}
