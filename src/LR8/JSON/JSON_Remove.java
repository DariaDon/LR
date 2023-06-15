package LR8.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JSON_Remove {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("Для удаления введите '+', для выхода 'й':");
            char key = in.next().charAt(0);
            if (key == '+') {
                System.out.println("Введите фильтр, по которому будет удалено значение из XML-файла (\"name\" или \"surname\"):");
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
                    Iterator iterator = jsonArray.iterator();
                    while (iterator.hasNext()) {
                        JSONObject birthday = (JSONObject) iterator.next();
                        if (temp.equals(birthday.get(tagName))) {
                            countElements++;
                            System.out.println("Найденный элемент для удаления №" + countElements);
                            System.out.println("Имя: " + birthday.get("name"));
                            System.out.println("Фамилия: " + birthday.get("surname"));
                            System.out.println("Дата рождения: " + birthday.get("birthdate"));
                            System.out.println();
                            iterator.remove();
                        }
                    }
                    if (countElements == 0) System.out.println("Элементы по заданному фильтру не найдены.\n");
                    else {
                        try (FileWriter file = new FileWriter("src/LR8/JSON/JSONtask.json")) {
                            file.write(jsonObject.toJSONString());
                            System.out.println("Json файл успешно обновлен!\n");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (key == 'й') break;
        }
    }
}
