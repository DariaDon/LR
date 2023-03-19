package LR1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number:");
        int first_number = in.nextInt();

        System.out.println("Input second number:");
        int second_number = in.nextInt();

        System.out.printf("sum: %d, difference: %d", first_number + second_number, first_number - second_number);
        in.close();
    }
}
