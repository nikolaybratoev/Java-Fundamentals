package objects;

import java.util.*;
import java.util.stream.Collectors;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);

            personList.add(person);

        }

        List<Person> person = personList
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.toList());

        for (Person person1 : person) {
            System.out.println(person1.getName() + " - " + person1.getAge());
        }

    }

    private static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.setName(name);
            this.setAge(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
    }
}
