package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // Ask how many students we want to add
        System.out.println("Enter number of new students to enrol:");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int n=0; n<numOfStudents; n++) {
            students[n] = new Student();
            students[n].enrol();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}
