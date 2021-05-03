package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //Constructor: prompt to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name:\n");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name:\n");
        this.lastName = in.nextLine();

        System.out.print("1 for Freshmen\n2 for Sophomore\n3 for Junior\n4 for Senior\n Enter student grade:\n");
        this.gradeYear = in.nextInt();

        setStudentId();
    }

    //Generate an ID
    private void setStudentId() {
        //Grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enrol in courses
    public void enrol() {
        // Get inside the loop, user hit Q
        do {
        System.out.println("Enter course to enroll (Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();

        if(!course.equals("Q")) {
            courses = courses + "\n " + course;
            tuitionBalance = tuitionBalance + costOfCourse;
        } else { break; }

        } while (1 != 0);
    }

    //View balance
    public void viewBalance() {
        System.out.println("Your balance is £" + tuitionBalance);
    }
    //Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment: £");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of £" + payment);
        viewBalance();
    }
    //Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade " + gradeYear +
                "\nID: " + studentID +
                "\nCourses enrolled:" + courses +
                "\nTuition balance: £" + tuitionBalance;
    }
}
