package basics;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        String totalPrice = "Total price: ";
        double sum = 0;
        double price;

        switch (type) {

            case "Students":
                if (day.equals("Friday")) {
                    price = 8.45;
                    sum = group * price;
                    if (group >= 30) {
                        sum -= sum * 0.15;
                    }
                } else if (day.equals("Saturday")) {
                    price = 9.80;
                    sum = group * price;
                    if (group >= 30) {
                        sum -= sum * 0.15;
                    }
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                    sum = group * price;
                    if (group >= 30) {
                        sum -= sum * 0.15;
                    }
                }
                break;

            case "Business":
                if (day.equals("Friday")) {
                    price = 10.90;
                    if (group >= 100) {
                        group -= 10;
                    }
                    sum = group * price;
                } else if (day.equals("Saturday")) {
                    price = 15.60;
                    if (group >= 100) {
                        group -= 10;
                    }
                    sum = group * price;
                } else if (day.equals("Sunday")) {
                    price = 16.00;
                    if (group >= 100) {
                        group -= 10;
                    }
                    sum = group * price;
                }
                break;

            case "Regular":
                if (day.equals("Friday")) {
                    price = 15;
                    sum = group * price;
                    if (group >= 10 && group <= 20) {
                        sum -= sum * 0.05;
                    }
                } else if (day.equals("Saturday")) {
                    price = 20;
                    sum = group * price;
                    if (group >= 10 && group <= 20) {
                        sum -= sum * 0.05;
                    }
                } else if (day.equals("Sunday")) {
                    price = 22.50;
                    sum = group * price;
                    if (group >= 10 && group <= 20) {
                        sum -= sum * 0.05;
                    }
                }
                break;
        }

        System.out.println(String.format(totalPrice + "%.2f", sum));

    }
}
