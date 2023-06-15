package LR8.JSON;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSON_Add {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Для добавления данных введите '+', для выхода 'й', чтобы просмотреть файл 'с':");
            char key = in.next().charAt(0);
            if (key == '+') {
                System.out.println("Введите имя:");
                String write_name = in.next();
                System.out.println("Введите фамилию:");
                String write_surname = in.next();
                System.out.println("Введите дату рождения человека (в формате dd.mm.yyyy):");
                String write_birthdate = in.next();

                try {
                    JSONParser parser = new JSONParser();
                    Object obj = parser.parse(new FileReader("src/LR8/JSON/JSONtask.json"));
                    JSONObject jsonObject = (JSONObject) obj;
                    JSONArray jsonArray = (JSONArray) jsonObject.get("birthday");
                    JSONObject newBirthday = new JSONObject();
                    newBirthday.put("name", write_name);
                    newBirthday.put("surname", write_surname);
                    newBirthday.put("birthdate", write_birthdate);
                    jsonArray.add(newBirthday);


                    try (FileWriter file = new FileWriter("src/LR8/JSON/JSONtask.json")) {
                        file.write(jsonObject.toJSONString());
                        System.out.println("\nJson файл успешно обновлен!\n");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (key == 'й') break;
            if (key == 'с') ViewJSON();
        }
    }

    public static void ViewJSON() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/LR8/JSON/JSONtask.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray jsonArray = (JSONArray) jsonObject.get("birthday");
            System.out.println();

            for (Object o : jsonArray) {
                JSONObject book = (JSONObject) o;
                System.out.println("Текущий элемент: birthday");
                System.out.println("Имя: " + book.get("name"));
                System.out.println("Фамилия: " + book.get("surname"));
                System.out.println("Дата рождения: " + book.get("birthdate"));
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
