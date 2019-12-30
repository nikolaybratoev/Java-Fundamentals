package objects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Persons> list = new ArrayList<>();

        while (!input.equals("End")) {

            String[] data = input.split("\\s+");
            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);

            Persons person = new Persons(name, ID, age);
            list.add(person);

            input = scanner.nextLine();

        }

        list.sort(Comparator.comparingInt(Persons::getAge));

        for (Persons person : list) {
            System.out.printf("%s with ID: %s is %d years old.%n",
                    person.getName(),
                    person.getID(),
                    person.getAge());
        }

    }

    private static class Persons {
        String name;
        String ID;
        int age;

        public Persons(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }

        public String getID() {
            return this.ID;
        }
    }
}
