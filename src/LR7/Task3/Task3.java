package LR7.Task3;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Task3 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите путь до текстового файла:");
        String filePath = checkPath();
        in.close();
        int lines = 0;

        try (var reader = new BufferedReader(new FileReader(filePath))) {
            while (reader.readLine() != null) {
                lines++;
            }
            System.out.println("Количество строк: " + lines);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
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
