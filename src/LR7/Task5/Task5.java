package LR7.Task5;

import java.io.*;
import java.util.Scanner;

public class Task5 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите путь до текстового файла:");
        String filePath = checkPath();
        in.close();

        File file = new File(filePath);
        System.out.println("Размер файла в байтах: " + file.length());
    }
    public static String checkPath() {
        while(true) {
            String temp = in.nextLine();
            if (new File(temp).exists()) {
                return temp;
            }
            else {
                System.out.println("Файл по указанному пути не найден\nПопробуйте снова:");
            }
        }
    }
}
