package text_processing;

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal firstInput = new BigDecimal(scanner.nextLine());
        BigDecimal secondInput = new BigDecimal(scanner.nextLine());

        BigDecimal result = firstInput.multiply(secondInput);

        System.out.println(result);

    }
}
