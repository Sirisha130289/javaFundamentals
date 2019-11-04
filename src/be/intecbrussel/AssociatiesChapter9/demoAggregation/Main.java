package be.intecbrussel.AssociatiesChapter9.demoAggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sirisha",1,"JAVAOct");
        Student student2 = new Student("Frederic",2,"JAVAOct");
        Student student3 = new Student("ABC",3,"C##");
        Student student4 = new Student("DEF",4,"C##");

        List<Student>JAVAOct_students=new ArrayList<Student>();
        JAVAOct_students.add(student1);
        JAVAOct_students.add(student2);

        List<Student>CshaOct_students=new ArrayList<Student>();
        CshaOct_students.add(student1);
        CshaOct_students.add(student2);

        Department JAVAOct = new Department("JAVAOct",JAVAOct_students);
        Department CshaOct = new Department("ChsOct",CshaOct_students);

        List<Department>departments = new ArrayList<Department>();
        departments.add(JAVAOct);
        departments.add(CshaOct);

        Institute institute = new Institute("Intec",departments);
        System.out.println("Total no.of Students in Institute: " +institute.getTotalStudentsInInstitute());



        }
    }
