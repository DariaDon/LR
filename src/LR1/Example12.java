package LR1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age:");
        int year_of_birth = 2023 - in.nextInt();

        System.out.println(year_of_birth);
        in.close();
    }
}
