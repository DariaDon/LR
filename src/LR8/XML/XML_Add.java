package LR8.XML;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML_Add {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("Для добавления данных введите '+', для выхода 'й'");
            char key = in.next().charAt(0);
            if (key == '+') {
                System.out.println("Введите имя:");
                String write_name = in.next();
                System.out.println("Введите фамилию:");
                String write_surname = in.next();
                System.out.println("Введите дату рождения человека (в формате dd.mm.yyyy):");
                String write_birthdate = in.next();
                System.out.println();

                try {
                    File inputFile = new File("src/LR8/XML/XMLtask.xml");
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    Document doc = dBuilder.parse(inputFile);
                    doc.getDocumentElement().normalize();

                    Element root = doc.getDocumentElement();

                    Element birthday = doc.createElement("birthday");

                    Element name = doc.createElement("name");
                    name.appendChild(doc.createTextNode(write_name));
                    birthday.appendChild(name);

                    Element surname = doc.createElement("surname");
                    surname.appendChild(doc.createTextNode(write_surname));
                    birthday.appendChild(surname);

                    Element birthdate = doc.createElement("birthdate");
                    birthdate.appendChild(doc.createTextNode(write_birthdate));
                    birthday.appendChild(birthdate);

                    root.appendChild(birthday);

                    doc.normalizeDocument();
                    saveXML(doc);
                    System.out.println();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (key == 'й') break;
        }
    }

    public static void saveXML(Document doc) {
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult("src/LR8/XML/XMLtask.xml");
            transformer.transform(source, result);
            System.out.println("В XML успешно добавлены новые данные.");
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
