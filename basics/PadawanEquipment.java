package basics;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double sabrePrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double additionalSabres = Math.ceil(0.10 * students);
        double totalSabres = (students + additionalSabres) * sabrePrice;
        double totalRobes = students * robesPrice;
        double freeBelts = Math.floor(students / 6);
        double totalBelts = beltsPrice * (students - freeBelts);

        double moneyNeeded = totalBelts + totalRobes + totalSabres;

        if (budget >= moneyNeeded) {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeeded - budget);
        }

    }
}
