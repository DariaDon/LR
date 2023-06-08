package LR7.Task4;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Task4 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите путь до входного текстового файла:");
        String inputFilePath = checkPath();
        System.out.println("Введите путь до выходного текстового файла:");
        String outputFilePath = checkPath();
        in.close();

        try (var reader = new BufferedReader(new FileReader(inputFilePath));
             var writer = new BufferedWriter(new FileWriter(outputFilePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Файл успешно скопирован");
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
