package regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            int key = findKey(input);

            String decrypted = findDecrypted(input, key);

            String regex = "([^@:!\\->]*)@(?<planetname>[A-Za-z]+)([^@:!\\->]*):(?<population>[\\d]+)([^@:!\\->]*)!(?<attacktype>[AD])!([^@:!\\->]*)->(?<soldiers>[\\d]+)([^@:!\\->]*)";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decrypted);

            while (matcher.find()) {

                String planetName = matcher.group("planetname");
                String attackType = matcher.group("attacktype");

                if (attackType.equals("A")) {

                    if (!attacked.contains(planetName)) {
                        attacked.add(planetName);
                    }
                } else {

                    if (!destroyed.contains(planetName)) {
                        destroyed.add(planetName);
                    }
                }
            }
        }

        System.out.printf("Attacked planets: %d%n", attacked.size());

        sortPrint(attacked);

        System.out.printf("Destroyed planets: %d%n", destroyed.size());

        sortPrint(destroyed);

    }

    private static void sortPrint(List<String> type) {
        Collections.sort(type);

        if (type.size() != 0) {

            for (int i = 0; i < type.size(); i++) {
                System.out.printf("-> %s%n", type.get(i));
            }
        }
    }

    private static String findDecrypted(String input, int key) {
        String decrypted = "";

        for (int i = 0; i < input.length(); i++) {
            decrypted += (char) (input.charAt(i) - key);
        }

        return decrypted;
    }

    private static int findKey(String input) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.toLowerCase().charAt(i);

            if (ch == 's' || ch == 't' || ch == 'a' || ch == 'r') {
                count++;
            }
        }

        return count;
    }
}
