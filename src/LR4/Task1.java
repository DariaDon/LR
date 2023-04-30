package LR4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            double counter = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");


            try {
                int len = scanner.nextInt();
                int[] array = new int[len];


                for (int i = 0; i < len; i++) {
                    System.out.println("Введите элемент массива: ");
                    array[i] = scanner.nextInt();
                }

                int sum = 0;
                for (int i : array) {
                    if (i > 0) {
                        sum += i;
                        counter += 1;
                    }
                }

                try {
                    System.out.print("Среднее значение положительных элементов одномерного массива: " + sum / counter);
                } catch (ArithmeticException e) {
                    System.out.println("Положительные элементы отсутствуют");
                }
            } catch (NegativeArraySizeException e) {
                System.out.println("Введено отрицательное количество элементов");
                // Не входило в задание, но тоже может возникать ошибка, если ввести отрицательное число
            }

        } catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа");
        } catch (NumberFormatException e) {
            System.out.println("Несоответствие числового типа данных");
        }
    }
}
