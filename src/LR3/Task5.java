package LR3;

import java.util.HashMap;

public class Task5 {
    public static void main(String[] args) {
        HashMap<Integer, String> HM = new HashMap<Integer, String>();

        for (int i = 0; i < 10; i++) {
            HM.put(i, "string" + i);
        }

        int prod = 1;
        String key_0 = "";
        String key_more_5 = "";

        for (int i : HM.keySet()) {
            if (i > 5) {
                key_more_5 += HM.get(i) + ", ";
            } else if (i == 0) {
                key_0 += HM.get(i) + ", ";
            }
            if (HM.get(i).length() > 5) {
                prod *= i;
            }
        }
        System.out.println("Ключ > 5: " + key_more_5.substring(0, key_more_5.length() - 2));
        System.out.println("Ключ = 0: " + key_0.substring(0, key_0.length() - 2));
        System.out.println("Произведение ключей, где длина строки > 5: " + prod);
    }
}
