package be.intecbrussel.Test06012020.Teacher;

public class MainStudent {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.createStudents();
        studentService.studentRegister();
        studentService.analyseStudentSubject();

    }
}
