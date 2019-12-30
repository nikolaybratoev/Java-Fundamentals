package objects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);

        }

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.printf("%s %s: %.2f%n",
                    student.getFirstName(),
                    student.getLastName(),
                    student.getGrade());
        }

    }

    private static class Student{
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }
        public double getGrade() {
            return this.grade;
        }
    }
}
