package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(?<=\\s)([a-z]*|\\d*)(\\d+|\\w+|\\.+|-+)([a-z]+|\\d+)@[a-z]+-?[a-z]+\\.[a-z]+(\\.[a-z]+)?";

        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        Matcher matcher = pattern.matcher(input);

        List<String> emails = new ArrayList<>();

        while (matcher.find()) {
            emails.add(matcher.group());
        }

        for (String email : emails) {
            System.out.println(email);
        }

    }
}