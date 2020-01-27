package be.intecbrussel.stringExercise;

import be.intecbrussel.AssociatiesChapter9.demoAggregation.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StudentRecord {

    public static void main(String[] args) {

        List<Students> studentsSort = new LinkedList<>();
        Scanner keyboard = new Scanner(System.in);
        Students[] students = {new Students(keyboard.next(),keyboard.next()),
                new Students(keyboard.next()), new Students(keyboard.next())};

        String newName = null;

        Arrays.stream(students).forEach(System.out::println);

        studentsSort = Arrays.asList(students); //converting array as list.


        System.out.println("Choose what you want to do from the below options");
        System.out.println("1. Change the name");
        System.out.println("2. Add the last name");

        int input = keyboard.nextInt();

        if (input == 1) {
            System.out.println(
                    "You have selected to change the name, Please enter the name you want to change");
        } else if (input == 2) {
            System.out.println(
                    "You have selected to add the last name, Please enter the name you want to change");
        }


        sirishaloop:
        while (input == 1) {
            String nameToChange = keyboard.next();
            System.out.println("name to change : " + nameToChange);
            System.out.println("to what do I need to change the name ?");

            for (Students student : studentsSort) {


                    if (student.getFirstName().equalsIgnoreCase(nameToChange)) {
                    System.out.println("Please provide the new first name");
                    if (keyboard.hasNext()) {
                        String newFirstName = keyboard.next();
                        student.setFirstName(newFirstName);
                        System.out.println("The name is changed");
                        break sirishaloop;
                    }
                }
            }
            System.out.println("Student not found, try again");
        }

//            studentToChange.setFirstName(nameToChange);
//            System.out.println("The name is changed");
//
//
//            Optional<Students> studentOptional = studentsSort.stream()
//                    .filter(students1 -> nameToChange.toLowerCase()
//                            .equals(students1.getFirstName()))
//                    .findFirst();
//            if (studentOptional.isPresent()) {
//                Students student = studentOptional.get();
//                System.out.println("Please change the first name");
//                newName = keyboard.next();
//                student.setFirstName(newName);
//                System.out.println("The name is changed");
//                break;
//            } else {
//                System.out.println("Please enter correct name");
//            }
//        }

        Stream.of(studentsSort).forEach(System.out::println);
        while (input == 2) {
            final String nameToChange = keyboard.next();
            System.out.println("name to change : " + nameToChange);
            Optional<Students> studentOptional = studentsSort.stream()
                    .filter(students1 -> nameToChange
                            .equalsIgnoreCase(students1.getFirstName()))
                    .findFirst();
            if (studentOptional.isPresent()) {
                Students student = studentOptional.get();
                System.out.println("Please provide the last name");
                newName = keyboard.next();
                student.setLastName(newName);
                System.out.println("The name is changed");
                break;
            } else {
                System.out.println("Please enter correct name");
            }
        }

        Stream.of(studentsSort).forEach(System.out::println);
    }
}









