package timus;

import java.util.Scanner;

public class task_1785 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество монстров: ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 4) {
            System.out.println("few");
        } else if (n <= 9) {
            System.out.println("several");
        } else if (n <= 19) {
            System.out.println("pack");
        } else if (n <= 49) {
            System.out.println("lots");
        } else if (n <= 99) {
            System.out.println("horde");
        } else if (n <= 249) {
            System.out.println("throng");
        } else if (n <= 499) {
            System.out.println("swarm");
        } else if (n <= 999) {
            System.out.println("zounds");
        } else if (n >= 1000) {
            System.out.println("legion");
        }
    }
}
