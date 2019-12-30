package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String town = tokens[3];

            Student student = new Student(firstName, lastName, age, town);

            students.add(student);

            input = scanner.nextLine();

        }

        String filter = scanner.nextLine();

        for (Student student : students) {
            if (student.getTown().equals(filter)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(),
                        student.getAge());
            }
        }

    }

    private static class Student{
        String firstName;
        String lastName;
        int age;
        String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setAge(age);
            this.setTown(town);
        }

        public String getFirstName() {
            return this.firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getTown() {
            return this.town;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }
}
