package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split("\\s+");

        List<String> firstArray = new ArrayList<>();

        Collections.addAll(firstArray, firstInput);

        String[] secondInput = scanner.nextLine().split("\\s+");

        List<String> secondArray = new ArrayList<>();

        Collections.addAll(secondArray, secondInput);

        List<String> newArray = new ArrayList<>();

        if (firstArray.size() > secondArray.size()) {
            for (int i = 0; i < firstArray.size(); i++) {

                newArray.add(firstArray.get(i));

                if (i < secondArray.size()) {
                    newArray.add(secondArray.get(i));
                }
            }
        } else {
            for (int i = 0; i < secondArray.size(); i++) {

                if (i < firstArray.size()) {
                    newArray.add(firstArray.get(i));
                }

                newArray.add(secondArray.get(i));
            }
        }

        System.out.println(String.join(" ", newArray));

    }
}
