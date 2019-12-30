package text_processing;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String fileName = input.substring(input.lastIndexOf("\\") + 1, input.lastIndexOf("."));
        String fileType = input.substring(input.lastIndexOf(".") + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileType);

    }
}
