package humen;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // สร้าง Lecturer
        Lecturer lecturer = new Lecturer("Dr. Smith", LocalDate.of(1980, 5, 10), 1001);
        System.out.println("Lecturer: " + lecturer.name + ", Birthday: " + lecturer.birthDay + ", ID: " + lecturer.id);
        lecturer.eat();
        lecturer.sleep();
        lecturer.teach();

        System.out.println();

        // สร้าง Student
        Student student = new Student("Alice", LocalDate.of(2003, 8, 25), 2001);
        System.out.println("Student: " + student.name + ", Birthday: " + student.birthDay + ", ID: " + student.id);
        student.eat();
        student.sleep();
        student.registerclass();
        student.takeExam();
    }
}
