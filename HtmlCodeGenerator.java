
/**************************************************************************/
// This Java program generates an Html code with user inputs (name, email)
// Created by:      Vanda Toth
// Date:            27.06.2023.
// Last modified:   -
/**************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlCodeGenerator {
    private List<String> elementsToRemove;

    public HtmlCodeGenerator() {
        elementsToRemove = new ArrayList<>();
    }

    public void addElementToRemove(String element) {
        elementsToRemove.add(element);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        do {
            System.out.print("Enter name: ");
            name = scanner.nextLine(); // Name
            if (!isValidName(name)) {
                System.out.println("Invalid name. Please do not use any special characters.");
            }
        } while (!isValidName(name));

        String email;
        do {
            System.out.print("Enter email: ");
            email = scanner.nextLine(); // Email
            if (!isValidEmail(email)) {
                System.out.println("Invalid email format. Please try again.");
            }
        } while (!isValidEmail(email));

        String repositoryUrl = "https://example.com"; // Repository URL

        HtmlCodeGenerator codeGenerator = new HtmlCodeGenerator();

        // Prompt user for elements to remove
        System.out.println(
                "Enter the HTML elements to remove - one element per line, leave empty to finish (h1,p,a,table,tr,td)):");
        String element;
        do {
            element = scanner.nextLine().trim();
            if (!element.isEmpty()) {
                codeGenerator.addElementToRemove(element);
            }
        } while (!element.isEmpty());

        String htmlCode = codeGenerator.generateHtmlCode(name, email, repositoryUrl);
        System.out.println(htmlCode);

        scanner.close();
    }

    public String generateHtmlCode(String name, String email, String repositoryUrl) {
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n");
        html.append("<html>\n");
        html.append("<head>\n");
        html.append("<title>").append(name).append(" - Teszt Feladat</title>\n");
        html.append("</head>\n");
        html.append("<body>\n");
        html.append("<h1>Teszt Feladat</h1>\n");
        html.append("<p><a href=\"").append(repositoryUrl).append("\">Megoldás</a></p>\n");
        html.append("<p>A feladat elkészítőjének adatai</p>\n");
        html.append("<table border=\"1px solid black\">\n");
        html.append("<tr>\n");
        html.append("<td>Név</td>\n");
        html.append("<td>").append(name).append("</td>\n");
        html.append("</tr>\n");
        html.append("<tr>\n");
        html.append("<td>Elérhetőség</td>\n");
        html.append("<td>").append(email).append("</td>\n");
        html.append("</tr>\n");
        html.append("</table>\n");
        html.append("<a href=\"http://lpsolutions.hu\">L&P Solutions</a>\n");
        html.append("</body>\n");
        html.append("</html>");

        // Remove unvanted elements
        for (String element : elementsToRemove) {
            String openingTag = "<" + element;
            String closingTag = "</" + element + ">";
            int startIndex = html.indexOf(openingTag);
            int endIndex = html.indexOf(closingTag, startIndex);
            while (startIndex != -1 && endIndex != -1) {
                html.replace(startIndex, endIndex + closingTag.length(), "");
                startIndex = html.indexOf(openingTag);
                endIndex = html.indexOf(closingTag, startIndex);
            }
        }

        return html.toString();
    }

    // User input checkin' just to be sure:)
    private static boolean isValidName(String name) {
        String nameRegex = "^[a-zA-Z0-9 ]+$";
        Pattern pattern = Pattern.compile(nameRegex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
