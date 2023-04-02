package LR2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int l = 0;
        Scanner id = new Scanner(System.in);

        System.out.print("Введите количество строк:");
        int m = id.nextInt();

        System.out.print("Введите количество столбцов:");
        int n = id.nextInt();

        int[][] snake = new int[m][n];
        for (int i = 0; i < m ; i++) {
            if(i%2==0) {
                for (int j = 0; j < n; j++) {
                    snake[i][j] = l;
                    l++;
                }
            }
            else {
                for (int k = m-1; k > -1; k--) {
                    snake[i][k] = l;
                    l++;
                }
            }
        }
        for (int i = 0; i < snake.length; i++){
            for (int j = 0; j < snake[i].length; j++){
                System.out.print(snake[i][j]+" ");
            }
            System.out.println();
        }
    }
}
