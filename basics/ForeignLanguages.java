package basics;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        String language;

        switch (country) {

            case "USA":
                language = "English";
                break;

            case "England":
                language = "English";
                break;

            case "Spain":
                language = "Spanish";
                break;

            case "Argentina":
                language = "Spanish";
                break;

            case "Mexico":
                language = "Spanish";
                break;

            default:
                language = "unknown";
                break;
        }

        System.out.println(language);

    }
}
