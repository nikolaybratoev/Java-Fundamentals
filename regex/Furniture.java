package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<product>[A-Za-z]+)<<(?<price>[\\d]?[.\\d]+)!(?<quantity>[\\d]+)\\b";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();

        System.out.println("Bought furniture:");

        double totalSum = 0;

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {

                String product = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                System.out.println(product);

                totalSum += price * quantity;

            }

            input = scanner.nextLine();

        }

        System.out.printf("Total money spend: %.2f", totalSum);

    }
}
