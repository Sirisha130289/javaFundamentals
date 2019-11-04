package be.intecbrussel.AssociatiesChapter9.demoAggregation;

import java.util.List;

public class Institute {
    String name;
    private List<Department> departmentList;

    Institute(String name, List<Department> departmentList) {
        this.name = name;
        this.departmentList = departmentList;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public int getTotalStudentsInInstitute() {
        int noOfStudents = 0;
        List<Student> students;

        for (Department dept : departmentList) {
            students = dept.getStudents();
            for (Student s : students) {
                noOfStudents++;
            }
        }
        return noOfStudents;
    }


}

