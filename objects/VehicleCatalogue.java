package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> catalog = new ArrayList<>();

        while (!input.equals("End")) {

            String[] line = input.split("\\s+");
            String type = line[0].toLowerCase();
            String model = line[1];
            String color = line[2];
            int horsePower = Integer.parseInt(line[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            catalog.add(vehicle);

            input = scanner.nextLine();

        }

        String command = scanner.nextLine();

        while (!command.equals("Close the Catalogue")) {

            for (Vehicle vehicle : catalog) {

                if (command.equals(vehicle.getModel())) {
                    System.out.printf("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n",
                            vehicle.getType(), vehicle.getModel(), vehicle.getColor(), vehicle.getHorsePower());
                    break;
                }
            }

            command = scanner.nextLine();

        }

        double avgCar = calculateAVG(catalog, "Car");
        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCar);
        double avgTrucks = calculateAVG(catalog, "Truck");
        System.out.printf("Trucks have average horsepower of: %.2f.", avgTrucks);

    }

    private static double calculateAVG(List<Vehicle> catalog, String type) {
        int sum = 0;
        int counter = 0;

        for (Vehicle vehicle : catalog) {

            if (vehicle.getType().equalsIgnoreCase(type)) {
                sum += vehicle.getHorsePower();
                counter++;
            }
        }

        double avg = 0;

        if (counter != 0) {
            avg = sum / (counter * 1.00);
        }

        return avg;
    }

    private static class Vehicle {
        String type;
        String model;
        String color;
        int horsePower;

        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public String getType() {
            return Character.toTitleCase(this.type.charAt(0))
                    + this.type.substring(1);
        }

        public String getModel() {
            return this.model;
        }

        public String getColor() {
            return this.color;
        }

        public int getHorsePower() {
            return this.horsePower;
        }
    }
}
