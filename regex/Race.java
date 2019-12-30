package regex;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Map<String, Integer> players = new TreeMap<>();

        for (String name : input) {

            if (!players.containsKey(name)) {
                players.put(name, 0);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end of race")) {
            String name = findName(command);

            if (players.containsKey(name)) {
                int distance = findDistance(command);
                players.put(name, players.get(name) + distance);
            }

            command = scanner.nextLine();

        }

        List<String> winners = players.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n2nd place: %s%n3rd place: %s%n",
                winners.get(0),
                winners.get(1),
                winners.get(2));

    }

    private static int findDistance(String command) {
        String regex = "[0-9]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(command);

        int distance = 0;
        while (matcher.find()) {
            distance += Integer.parseInt(matcher.group());
        }

        return distance;
    }

    private static String findName(String command) {
        String regex = "[A-Za-z]";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(command);

        String name = "";
        while (matcher.find()) {
            name += matcher.group();
        }

        return name;
    }
}
