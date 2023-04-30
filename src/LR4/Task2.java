package LR4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите количество строк: ");
            int m = scanner.nextInt();

            System.out.println("Введите количество столбцов: ");
            int n = scanner.nextInt();

            int[][] matrix = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Введите элемент: ");
                    int element = scanner.nextInt();
                    matrix[i][j] = element;
                }
            }

            System.out.println("Введите номер столбца: "); //подразумевается ввод числа, отсчитывая столбцы с 1
            int num = scanner.nextInt();

            for (int i = 0; i < m; i++) {
                System.out.println(matrix[i][num-1]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Нет столбца с таким номером");
        }
    }
}
