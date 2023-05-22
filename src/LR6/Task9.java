package LR6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static List<String> filterAlphabeticStrings(List<String> strings) {
        return strings.stream().filter(s -> s.matches("[a-zA-Z]+")).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "world1", "0");
        System.out.println("Список строк: ");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> filteredStrings = filterAlphabeticStrings(strings);
        System.out.println("Строки, состоящие только из букв: ");
        for (String e : filteredStrings) {
            System.out.println(e);
        }
    }
}
