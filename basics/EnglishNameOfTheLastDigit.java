package basics;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int lastNumber = number % 10;

        String numberName;
        switch (Math.abs(lastNumber)) {

            case 0:
                numberName = "zero";
                break;

            case 1:
                numberName = "one";
                break;

            case 2:
                numberName = "two";
                break;

            case 3:
                numberName = "three";
                break;

            case 4:
                numberName = "four";
                break;

            case 5:
                numberName = "five";
                break;

            case 6:
                numberName = "six";
                break;

            case 7:
                numberName = "seven";
                break;

            case 8:
                numberName = "eight";
                break;

            case 9:
                numberName = "nine";
                break;

            default:
                numberName = "";
                break;
        }

        System.out.println(numberName);

    }
}
