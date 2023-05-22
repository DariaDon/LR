package timus;

import java.util.Scanner;

public class task_1319 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input N:");
        int n = in.nextInt();

        int[][] grid = new int[n][n];
        int c=1;

        for(int diag=n; diag>=-n; diag--) {
            for(int x=0; x<n; x++) {
                if(0<=x+diag && x+diag<n)
                    grid[x][x+diag] = c++;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++)
                System.out.print(grid[i][j]+(j==n-1?"":" "));
            System.out.println();
        }
    }
}
