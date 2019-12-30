package objects;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < words.length; i++) {

            int firstWord = rnd.nextInt(words.length);
            int secondWord = rnd.nextInt(words.length);

            String changer = words[firstWord];
            words[firstWord] = words[secondWord];
            words[secondWord] = changer;
        }

        for (String word : words) {
            System.out.println(word);
        }

    }
}
