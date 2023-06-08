package LR7.Task6;

import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Task6 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите путь до текстового файла:");
        String filePath = checkPath();
        System.out.println("Введите слово для поиска в файле:");
        String word = in.nextLine();
        in.close();

        try (var reader = new BufferedReader(new FileReader(filePath));
            var printWriter = new PrintWriter(System.out)) {
            int lineNumber = 0, wordsCount = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(word)) {
                    wordsCount++;
                   printWriter.println("Строка №" + lineNumber + ": " + line);
                }
            }
            if (wordsCount == 0) {
                printWriter.println("В файле " + (filePath = filePath.substring(filePath.lastIndexOf('/')+1)) + " слово \"" + word + "\" не встречается");
            }
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
