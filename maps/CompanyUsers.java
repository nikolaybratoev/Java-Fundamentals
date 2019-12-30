package maps;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companies = new TreeMap<>();

        while (!input.equals("End")) {

            String[] tokens = input.split(" -> ");
            String company = tokens[0];
            String employee = tokens[1];

            if (!companies.containsKey(company)) {
                companies.put(company, new ArrayList<>());
                companies.get(company).add(employee);
            } else {
                if (!companies.get(company).contains(employee)) {
                    companies.get(company).add(employee);
                }
            }

            input = scanner.nextLine();

        }

        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n",
                        entry.getValue().get(i));
            }
        }

    }
}
