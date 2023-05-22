package LR6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task10 {
    public static List<Integer> filterSmallNumbers(List<Integer> numbers, int threshold) {
        return numbers.stream().filter(n -> n < threshold).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2, 43, 24, 5, 16, 7, 28);
        System.out.println("Список чисел: " + numbers);

        int filter = 9;
        List<Integer> filteredNumbers = filterSmallNumbers(numbers, 7);
        System.out.println("Числа из списка меньше " + filter + ": " + filteredNumbers);
    }
}
