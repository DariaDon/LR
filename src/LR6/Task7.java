package LR6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static List<String> filterLongStrings(List<String> strings, int length) {
        return strings.stream().filter(s -> s.length() > length).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world", "!");
        System.out.println("Список строк: ");
        for (String e : strings) {
            System.out.println(e);
        }

        int len = 3;
        List<String> filteredStrings = filterLongStrings(strings, len);
        System.out.println("Строки, в которых больше " + len + " символов: ");
        for (String e : filteredStrings) {
            System.out.println(e);
        }
    }
}