package LR1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name:");
        String name = in.nextLine();

        System.out.println("Input year of birth:");
        int age = 2023 - in.nextInt();

        System.out.printf("name: %s, age: %d", name, age);
        in.close();
    }
}
