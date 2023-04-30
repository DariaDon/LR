package LR4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");
            int number = scanner.nextInt();
            byte[] array = new byte[number];


            int sum = 0;
            for (int i = 0; i < number; i++) {
                System.out.println("Введите элемент массива: ");
                array[i] = scanner.nextByte();
            }

            for (int i : array) {
                sum += i;
            }

            System.out.println("Сумма элементов: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа");
        } catch (NumberFormatException e) {
            System.out.println("Ввод или вычисление значения за границами диапазона типа");
        }
    }
}
