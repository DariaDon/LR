package LR2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.print("Введите текст для шифрования:");
        String text = id.nextLine();

        System.out.print("Введите ключ для шифрования:");
        int key = id.nextInt();

        String encryptStr = CaeserCipher.encrypt(text, key);

        System.out.print("Текст после преобразования:" + encryptStr);
        System.out.print("\nВыполнить обратное преобразование? (y/n)");

        boolean answer = false;

        while (!answer) {
            String reply = id.next();

            if (reply.equals("y")) {
                String decryptStr = CaeserCipher.decrypt(encryptStr, key);
                System.out.println(decryptStr);
                answer = true;
            }
            else if (reply.equals("n")) {
                System.out.println("До свидания!");
                answer = true;
            }
            else {
                System.out.println("Введите корректный ответ");
                answer = false;
            }
        }
    }
    private static class CaeserCipher{
        static String encryptText;
        private static String encrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];

            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }

        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];

            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
    }
}
