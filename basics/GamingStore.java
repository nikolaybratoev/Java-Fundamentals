package basics;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        String output;
        double price;
        double sum = 0.0;

        while (!command.equals("Game Time")) {

            switch (command) {

                case "OutFall 4":
                    price = 39.99;

                    if (budget < price) {
                        output = "Too Expensive";
                        System.out.println(output);
                        command = scanner.nextLine();
                        continue;
                    }

                    if (budget >= price) {
                        output = "Bought OutFall 4";
                        System.out.println(output);
                        budget -= price;
                        sum += price;
                    }

                    if (budget == 0) {
                        output = "Out of money!";
                        System.out.println(output);
                        return;
                    }
                    break;

                case "CS: OG":
                    price = 15.99;

                    if (budget < price) {
                        output = "Too Expensive";
                        System.out.println(output);
                        command = scanner.nextLine();
                        continue;
                    }

                    if (budget >= price) {
                        output = "Bought CS: OG";
                        System.out.println(output);
                        budget -= price;
                        sum += price;
                    }

                    if (budget == 0) {
                        output = "Out of money!";
                        System.out.println(output);
                        return;
                    }
                    break;

                case "Zplinter Zell":
                    price = 19.99;

                    if (budget < price) {
                        output = "Too Expensive";
                        System.out.println(output);
                        command = scanner.nextLine();
                        continue;
                    }

                    if (budget >= price) {
                        output = "Bought Zplinter Zell";
                        System.out.println(output);
                        budget -= price;
                        sum += price;
                    }

                    if (budget == 0) {
                        output = "Out of money!";
                        System.out.println(output);
                        return;
                    }
                    break;

                case "Honored 2":
                    price = 59.99;

                    if (budget < price) {
                        output = "Too Expensive";
                        System.out.println(output);
                        command = scanner.nextLine();
                        continue;
                    }

                    if (budget >= price) {
                        output = "Bought Honored 2";
                        System.out.println(output);
                        budget -= price;
                        sum += price;
                    }

                    if (budget == 0) {
                        output = "Out of money!";
                        System.out.println(output);
                        return;
                    }
                    break;

                case "RoverWatch":
                    price = 29.99;

                    if (budget < price) {
                        output = "Too Expensive";
                        System.out.println(output);
                        command = scanner.nextLine();
                        continue;
                    }

                    if (budget >= price) {
                        output = "Bought RoverWatch";
                        System.out.println(output);
                        budget -= price;
                        sum += price;
                    }

                    if (budget == 0) {
                        output = "Out of money!";
                        System.out.println(output);
                        return;
                    }
                    break;

                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (budget < price) {
                        output = "Too Expensive";
                        System.out.println(output);
                        command = scanner.nextLine();
                        continue;
                    }

                    if (budget >= price) {
                        output = "Bought RoverWatch Origins Edition";
                        System.out.println(output);
                        budget -= price;
                        sum += price;
                    }

                    if (budget == 0) {
                        output = "Out of money!";
                        System.out.println(output);
                        return;
                    }
                    break;

                default:
                    output = "Not Found";
                    System.out.println(output);
                    break;
            }

            command = scanner.nextLine();
        }

        if (budget > 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, budget);
        }

    }
}
