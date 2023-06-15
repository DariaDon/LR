package LR8.XML;

import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class XML_Search {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while(true) {
            System.out.println("Для поиска введите '+', для выхода 'й':");
            char key = in.next().charAt(0);
            if (key == '+') {
                System.out.println("Введите фильтр для поиска (\"name\" или \"surname\"):");
                String filter = "";
                String tagName = "";
                while (true) {
                    tagName = in.next();
                    if (!tagName.equals("name") && !tagName.equals("surname")) System.out.println("Введите \"name\" или \"surname\"!");
                    else if (tagName.equals("name")) {
                        filter = "имя";
                        break;
                    }
                    else if (tagName.equals("surname")) {
                        filter = "фамилию";
                        break;
                    }
                }

                System.out.println("Введите " + filter + ":");
                String temp = in.next();
                System.out.println();

                try {
                    File inputFile = new File("src/LR8/XML/XMLtask.xml");
                    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                    Document doc = dBuilder.parse(inputFile);
                    doc.getDocumentElement().normalize();
                    NodeList nodeList = doc.getElementsByTagName("birthday");

                    int countElements = 0;
                    for (int i = 0; i < nodeList.getLength(); i++) {
                        Node node = nodeList.item(i);
                        if (node.getNodeType() == Node.ELEMENT_NODE) {
                            Element element = (Element) node;
                            if (element.getElementsByTagName(tagName).item(0).getTextContent().equals(temp)) {
                                countElements++;
                                System.out.println("№ элемента в XML: " + (i + 1));
                                System.out.println("Имя: " + element.getElementsByTagName("name").item(0).getTextContent());
                                System.out.println("Фамилия: " + element.getElementsByTagName("surname").item(0).getTextContent());
                                System.out.println("Дата рождения: " + element.getElementsByTagName("birthdate").item(0).getTextContent());
                                System.out.println();
                            }
                        }
                    }
                    if (countElements == 0) System.out.println("Элементы по заданному фильтру не найдены.\n");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (key == 'й') break;
        }
    }
}
