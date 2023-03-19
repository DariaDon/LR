package LR1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number:");
        int num1 = in.nextInt();
        int num2 = num1 - 1;
        int num3 = num1 + 1;
        int num4 = (num1 + num2 + num3) * (num1 + num2 + num3);
        System.out.println(num2 + " " + num1 + " " + num3 + " " + num4);
        in.close();
    }
}
