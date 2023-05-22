package timus;

import java.util.Scanner;

public class task_1581 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = in.nextInt();
        int b = 1;

        for(int i=1; i<n; i++) {
            int val = in.nextInt();
            if(val == a) b++;
            else {
                System.out.print(b+" "+a+" ");
                a = val;
                b = 1;
            }
        }
        System.out.print(b+" "+a);
        System.out.println();
    }
}
