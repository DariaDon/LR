package LR1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input year of birth:");
        int age = 2023 - in.nextInt();

        System.out.println("Your age: " + age);
        in.close();
    }
}
