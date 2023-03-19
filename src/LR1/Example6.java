package LR1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input last name:");
        String last_name = in.nextLine();

        System.out.println("Input first name:");
        String first_name = in.nextLine();

        System.out.println("Input patronymic:");
        String patronymic = in.nextLine();

        System.out.printf("Hello %s %s %s", last_name, first_name, patronymic);
        in.close();
    }
}
