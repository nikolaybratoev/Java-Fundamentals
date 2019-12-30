package data_types;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        long maxValue = Integer.MIN_VALUE;
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;

        for (int ball = 0; ball < n; ball++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            long snowballValue = (long) Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                bestSnow = snowballSnow;
                bestTime = snowballTime;
                bestQuality = snowballQuality;
            }

        }

        System.out.printf("%d : %d = %d (%d)", bestSnow, bestTime, maxValue, bestQuality);

    }
}
