package LR8.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFileExample {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String filePath = checkFilePath();
        getListContent(filePath);
        in.close();
    }

    public static void getListContent(String filePath) {
        System.out.println("Введите название листа, содержимое которого необходимо просмотреть:");
        String sheetName = in.nextLine();
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

            switch (workbook.getSheetIndex(sheetName)) {
                case -1:
                    throw new Exception("Ошибка. Листа с именем \"" + sheetName + "\" не существует в заданном Excel-файле.\nПроверьте, правильно ли задано название листа");
                default:
                    System.out.println("Содержимое листа \"" + sheetName + "\":");
                    XSSFSheet sheet = workbook.getSheet(sheetName);
                    for (Row row : sheet) {
                        for (Cell cell : row) {
                            System.out.print(cell.toString() + "\t");
                        }
                        System.out.println();
                    }
                    break;
            }
            workbook.close();
            inputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String checkFilePath() {
        System.out.println("Введите путь до Excel-файла:");
        while(true) {
            String filePath = in.nextLine();
            if (new File(filePath).exists()) {
                System.out.println("Файл по указанному пути найден.");
                int check = checkFormat(filePath);
                if (check == 1) return filePath;
            }
            else {
                System.out.println("Файл по указанному пути не найден\nПопробуйте снова:");
            }
        }
    }

    public static int checkFormat(String filePath) {
        var extension = filePath.substring(filePath.lastIndexOf(".") + 1).toLowerCase();
        while (true) {
            if (extension.equals("xlsx")) {
                System.out.println("Открытие Excel-файла...");
                return 1;
            }
            else {
                System.out.println("Неизвестный формат Excel-файла: " + extension + "\nВыберите другой файл:");
                return -1;
            }
        }
    }

}
