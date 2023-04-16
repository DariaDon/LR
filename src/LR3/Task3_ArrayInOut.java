package LR3;

import java.util.Scanner;

public class Task3_ArrayInOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        input(array, 0, scanner);
        System.out.print("Вы ввели массив: ");
        output(array, 0);
    }

    private static void input(int[] array, int i, Scanner scanner) {
        if (i == array.length) {
            return;
        }
        System.out.print("Введите элемент: ");
        array[i] = scanner.nextInt();
        input(array, i + 1, scanner);
    }

    private static void output(int[] array, int i) {
        if (i == array.length) {
            return;
        }
        System.out.print(array[i] + " ");
        output(array, i + 1);
    }
}