package data_types;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = 0;
        String biggestKeg = "";

        while (n-- > 0) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                biggestKeg = model;
            }

        }

        System.out.println(biggestKeg);

    }
}