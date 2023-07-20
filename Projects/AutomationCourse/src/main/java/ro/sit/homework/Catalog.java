package ro.sit.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Catalog {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        Student student1 = new Student();
        student1.setName("Valentina Popa");
        student1.setAverage(8.0);

        Student student2 = new Student();
        student2.setName("Valentin Bratulescu");
        student2.setAverage(10.0);

        Student student3 = new Student();
        student3.setName("Ion Popescu");
        student3.setAverage(7.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        displayStudents(students);
        searchStudent(students);
        removeStudent(students);
        displayStudents(students);
        sortStudentsByName(students);
        displayStudents(students);
        sortStudentsByAverage(students);
        displayStudents(students);
    }

    public static void displayStudents(List<Student> students) {
        System.out.println("=====================");
        System.out.println("List of students is: ");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
    public static void searchStudent(List<Student> students) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("Searching student by his name...");
        System.out.println("Enter the student name:");
        String name = keyboard.nextLine();

        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("I found the student " + name);
                return;
            }
        }

        System.out.println("I did not find the student " + name);
    }

    public static void removeStudent(List<Student> students) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("Removing student by his name...");
        System.out.println("Enter the student name:");
        String name = keyboard.nextLine();

        for (Student student : students) {
            if (student.getName().equals(name)) {
                students.remove(student);
                return;
            }
        }

        System.out.println("I did not find the student " + name);
    }

    public static void sortStudentsByName(List<Student> students) {
        System.out.println("=====================");
        System.out.println("Sorting students by name...");

        Collections.sort(students, new StudentNameComparator());
    }

    public static void sortStudentsByAverage(List<Student> students) {
        System.out.println("=====================");
        System.out.println("Sorting students by average...");

        Collections.sort(students, new StudentAverageComparator());
    }
}
