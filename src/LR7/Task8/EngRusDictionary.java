package LR7.Task8;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class EngRusDictionary implements Serializable {
    public EngRusDictionary() {
        //Начальное заполнение словаря
        engRus.put("Sky", "Небо");
        engRus.put("Twilight", "Сумерки");
        engRus.put("Inorganic", "Неорганичный");
    }

    private String engWord;
    public void setEngWord(String word) {
        engWord = word;
    }
    private String rusTranslate;
    public void setRusTranslate(String word) {
        rusTranslate = word;
    }

    private Map<String, String> engRus = new LinkedHashMap<String, String>();
    public void getEngRusMap() {
        System.out.println(engRus.entrySet());

    }
    public void setEngRusMap() {
        engRus.put(engWord, rusTranslate);
    }
}
