package be.intecbrussel.Test06012020.Teacher;

import java.util.Random;
import java.util.Scanner;

public class StudentService {
    Scanner keyboard = new Scanner(System.in);
    Student[] students = new Student[10];
    Random random = new Random();
    String[] subjects = new String[10];

    public void createStudents() {
        for (int i = 0; i < students.length; i++) {
            students[i] = generateRandomCollegeStudent();
        }
    }

    public Student generateRandomCollegeStudent() {
        Student student = null;
        int randomNumber = 0;
        randomNumber = random.nextInt(3);
        if (randomNumber == 0) {
            student = new NarayanaStudent();
        } else if (randomNumber == 1) {
            student = new NalandaStudent();
        } else if (randomNumber == 2) {
            student = new ChaitanyaStudent();
        }
        return student;
    }

    public void printStudents() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getCollegeName() + ". I scored " + students[i].getMarks());

            printResult(students[i].getMarks());
            System.out.println();

        }
    }


    public void printResult(int marksScored) {

        if (marksScored < 35) {
            System.out.println("You failed");
        } else if (marksScored > 35 && marksScored < 60) {
            System.out.println("You got 'C' grade");
        } else if (marksScored > 60 && marksScored < 80) {
            System.out.println("You got 'B' grade");
        } else if (marksScored > 80) {
            System.out.println("You got 'A' grade");
        }


    }

    public String getFavouriteSubject() {
        String favouriteSubject = null;
        System.out.println("Please enter your favourite subject using the below inputs: ");
        System.out.println("1. Maths 2.Physics 3.Economics");
        int number = keyboard.nextInt();
        if (number > 3 || number < 0) {
            System.out.println("Please enter a correct number");
            number = keyboard.nextInt();
        }
        if (number == 1) {
            favouriteSubject = "Maths";
        } else if (number == 2) {
            favouriteSubject = "Physics";
        } else if (number == 3) {
            favouriteSubject = "Economics";
        }
        return favouriteSubject;
    }

    public void studentRegister() {

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getCollegeName() + ". I scored " + students[i].getMarks());

            printResult(students[i].getMarks());
            System.out.println();
            subjects[i] = getFavouriteSubject();

        }
    }

    public void analyseStudentSubject() {
        int narayanaMathsCount = 0;
        int narayanaPhysicsCount = 0;
        int narayanaEconomicsCount = 0;
        int nalandaMathsCount = 0;
        int nalandaPhysicsCount = 0;
        int nalandaEconomicsCount = 0;
        int chaitanyaMathsCount = 0;
        int chaitanyaPhysicsCount = 0;
        int chaitanyaEconomicsCount = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] instanceof NarayanaStudent) {
                if ("Maths".equals(subjects[i])) {
                    narayanaMathsCount++;
                }
                if ("Physics".equals(subjects[i])) {
                    narayanaPhysicsCount++;
                }
                if ("Economics".equals(subjects[i])) {
                    narayanaEconomicsCount++;
                }
            }
            if (students[i] instanceof NalandaStudent) {
                if ("Maths".equals(subjects[i])) {
                    nalandaMathsCount++;
                }
                if ("Physics".equals(subjects[i])) {
                    nalandaPhysicsCount++;
                }
                if ("Economics".equals(subjects[i])) {
                    nalandaEconomicsCount++;
                }
            }
            if (students[i] instanceof ChaitanyaStudent) {
                if ("Maths".equals(subjects[i])) {
                    chaitanyaMathsCount++;
                }
                if ("Physics".equals(subjects[i])) {
                    chaitanyaPhysicsCount++;
                }
                if ("Economics".equals(subjects[i])) {
                    chaitanyaEconomicsCount++;
                }
            }
        }
        System.out.println("Total Nalanda Maths favourite count: " + nalandaMathsCount);
        System.out.println("Total Nalanda Physics favourite count: " + nalandaPhysicsCount);
        System.out.println("Total Nalanda Economics favourite count: " + nalandaEconomicsCount);
        System.out.println("Total Narayana Economics favourite count: " + narayanaEconomicsCount);
        System.out.println("Total Narayana Maths favourite count: " + narayanaMathsCount);
        System.out.println("Total Narayana Physics favourite count: " + narayanaPhysicsCount);
        System.out.println("Total Chaitanya Economics favourite count: " + chaitanyaEconomicsCount);
        System.out.println("Total Chaitanya Maths favourite count: " + chaitanyaMathsCount);
        System.out.println("Total Chaitanya Physics favourite count: " + chaitanyaPhysicsCount);
    }
}
