package LR7.Task8;

import java.io.*;
import java.util.Scanner;

public class Task8 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        EngRusDictionary engRus = new EngRusDictionary();
        System.out.println("Текущий словарь:");
        engRus.getEngRusMap();

        System.out.println("Продолжение заполнения словаря:");
        FillDictionary(engRus);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/LR7/Task8/dictionary.json"))) {
            oos.writeObject(engRus);
            System.out.println("Сериализация прошла успешно. Данные сохранены.");
        } catch (Exception e) {
            System.out.println("Ошибка во время сериализации: " + e.getMessage());
        }

        System.out.println("Продолжение заполнения словаря после сериализации, но до десериализации:");
        FillDictionary(engRus);

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/LR7/Task8/dictionary.json"))) {
            EngRusDictionary deserializedEngRus = (EngRusDictionary) ois.readObject();
            System.out.println("Десериализация прошла успешно");
            System.out.println("Продолжение с момента сохранения:");
            FillDictionary(deserializedEngRus);
        } catch (Exception e) {
            System.out.println("Ошибка во время десериализации: " + e.getMessage());
        }
    }

    public static void FillDictionary(EngRusDictionary dictionary) {
        while (true) {
            System.out.println("Для добавления нового слова введите +, для просмотра словаря введите g, для выхода введите q");
            char key = in.next().charAt(0);
            if (key == '+') {
                System.out.println("Введите английское слово для внесения в словарь:");
                dictionary.setEngWord(in.next());
                System.out.println("Введите русский перевод:");
                dictionary.setRusTranslate(in.next());
                dictionary.setEngRusMap();
            }
            else if (key == 'g') {
                dictionary.getEngRusMap();
            }
            else if (key == 'q') return;
        }
    }
}

