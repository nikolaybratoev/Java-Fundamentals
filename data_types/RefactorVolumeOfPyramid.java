package data_types;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length, height, volume, width = 0;

        length = Double.parseDouble(scanner.nextLine());
        width = Double.parseDouble(scanner.nextLine());
        height = Double.parseDouble(scanner.nextLine());

        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");

        double refactorVolume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", refactorVolume);

    }
}