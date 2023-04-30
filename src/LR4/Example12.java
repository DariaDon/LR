package LR4;

public class Example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            try {
                throw new IllegalArgumentException("Строка введена неверно");
            } catch (IllegalArgumentException e) {
            }
        }
        if (chislo > 0.001) {
            try {
                throw new IllegalArgumentException("Неверное число");
            } catch (IllegalArgumentException e) {
            }
        }
    }

    public static void main(String[] args) {
        Example12.m(null, 0.000001);
    }
}
