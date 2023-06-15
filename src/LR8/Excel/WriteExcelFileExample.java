package LR8.Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class WriteExcelFileExample {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String filePath = checkFilePath();

        XSSFWorkbook workbook = new XSSFWorkbook();

        System.out.println("Введите название листа, который необходимо создать:");
        String sheetName = in.nextLine();
        XSSFSheet sheet = workbook.createSheet(sheetName);

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        dataRow1.createCell(2).setCellValue(500.0);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 16 GB");
        dataRow2.createCell(2).setCellValue(25000.0);

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        in.close();

        System.out.println("Данные записаны в файл: " + filePath);
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
