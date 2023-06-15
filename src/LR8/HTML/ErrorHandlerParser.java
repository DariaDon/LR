package LR8.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ErrorHandlerParser {
    public static void main(String[] args) {
        String url = "https://en.wikipedia.org/wiki/Pacific_Ocea1n";
        int flag = 0;
        while (flag != 1) {
            try {
                Document doc = Jsoup.connect(url).get();
                flag = 1;
                Element title = doc.select("title1").first();
                System.out.println("Название вкладки страницы: " + title.html());
                Element titleMain = doc.select(".mw-page-title-main").first();
                System.out.println("Заголовок страницы: " + titleMain.html());
                System.out.println("Содержание страницы:");
                Elements elements = doc.select(".mw-headline");
                for (int i = 0; i < elements.size(); i++) {
                    System.out.println("№" + (i + 1) + ": " + elements.get(i).html());
                }
            } catch (IOException e) {
                System.err.println("Ошибка при подключении к URL " + url + ".\n" + e.getMessage() + "\nПопытка переподключения...");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
            }
            catch (Exception e) {
                System.out.println("Произошла ошибка в ходе выполнения программы: " + e.getMessage());
                e.printStackTrace();
            }
        }

    }
}
