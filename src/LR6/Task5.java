package LR6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static List<String> filterStrings(List<String> strings, String substring) {
        return strings.stream().filter(s -> s.contains(substring)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world", "Привет", "мир");
        System.out.println("Список строк до обработки: ");
        for (String e : strings) {
            System.out.println(e);
        }

        String interest = "o";
        System.out.println("Заданная подстрока: " + interest);

        List<String> filteredStrings = filterStrings(strings, interest);
        System.out.println("Список строк после обработки: ");
        for (String e : filteredStrings) {
            System.out.println(e);
        }
    }
}
