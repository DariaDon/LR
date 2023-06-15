package LR8.HTML;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveParser {
    public static void main(String[] args) {
        String url = "https://en.wikipedia.org/wiki/Pacific_Ocean";
        try (var writer = new BufferedWriter(new FileWriter("src/LR8/HTML/ParserResult.txt"))) {
            Document doc = Jsoup.connect(url).get();
            Element title = doc.select("title").first();
            writer.write("Название вкладки страницы: " + title.html() + "\n");
            Element titleMain = doc.select(".mw-page-title-main").first();
            writer.write("Заголовок страницы: " + titleMain.html() + "\n");
            writer.write("Содержание страницы:\n");
            Elements elements = doc.select(".mw-headline");
            for (int i = 0; i < elements.size(); i++) {
                writer.write("№" + (i + 1) + ": " + elements.get(i).html() + "\n");
            }
            System.out.println("Данные с сайта успешно записаны в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
