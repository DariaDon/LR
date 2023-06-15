package LR8.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class JSON_Search {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("Для поиска введите '+', для выхода 'й':");
            char key = in.next().charAt(0);
            if (key == '+') {
                System.out.println("\"Введите фильтр для поиска (\"name\" или \"surname\"):");
                String filter = "";
                String tagName = "";
                while (true) {
                    tagName = in.next();
                    if (!tagName.equals("name") && !tagName.equals("surname")) System.out.println("Введите \"name\" или \"surname\"!");
                    else if (tagName.equals("name")) {
                        filter = "имя";
                        break;
                    }
                    else if (tagName.equals("surname")) {
                        filter = "фамилию";
                        break;
                    }
                }

                System.out.println("Введите " + filter + ":");
                String temp = in.next();
                System.out.println();

                try {
                    JSONParser parser = new JSONParser();
                    Object obj = parser.parse(new FileReader("src/LR8/JSON/JSONtask.json"));
                    JSONObject jsonObject = (JSONObject) obj;

                    JSONArray jsonArray = (JSONArray) jsonObject.get("birthday");
                    int countElements = 0;
                    for (Object o : jsonArray) {
                        JSONObject birthday = (JSONObject) o;
                        if (birthday.get(tagName).equals(temp)) {
                            countElements++;
                            System.out.println("Найденный элемент №" + countElements);
                            System.out.println("Имя: " + birthday.get("name"));
                            System.out.println("Фамилия: " + birthday.get("surname"));
                            System.out.println("Дата рождения: " + birthday.get("birthdate"));
                            System.out.println();
                        }
                    }
                    if (countElements == 0) System.out.println("Элементы по заданному фильтру не найдены.\n");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (key == 'й') break;
        }
    }
}
