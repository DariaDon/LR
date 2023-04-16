package LR3;

import java.util.Scanner;

public class Task2_NumToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter natural number: ");
        int num = in.nextInt();
        if (num == 0) {
            System.out.print(0);
        } else {
            NumToBin(num);
        }
    }

    public static void NumToBin(int num) {
         if (num > 0) {
            NumToBin(num / 2);
            System.out.print(num % 2);
        }
    }
}
