package LR7.Task7;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Task7 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите путь до текстового файла:");
        String filePath = checkPath();
        System.out.println("Введите текст для записи в файл:");
        String text = in.nextLine();
        in.close();

        try (var writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
            System.out.println("Данные записаны в файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        System.out.println("Количество записанных символов: " + text.length());
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
