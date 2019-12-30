package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b(?<name>[A-Z][a-z?]+) (?<lastname>[A-Z][a-z]+)\\b";

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {

            String firstName = matcher.group("name");
            String lastName = matcher.group("lastname");

            System.out.print(String.format("%s %s ",
                    firstName,
                    lastName));

        }
    }
}
