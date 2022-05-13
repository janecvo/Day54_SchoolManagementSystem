package schoolManagementSystem;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher bob = new Teacher(3, "Bob", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(bob);

        Student janna = new Student(1, "Janna", 4);
        Student john = new Student(2, "John Doe", 12);
        Student elle = new Student(3, "Elle", 5);

        List<Student> studentList = new ArrayList<>();
        
        studentList.add(janna);
        studentList.add(john);
        studentList.add(elle);

        School ahhs = new School(teacherList, studentList);
        
        Teacher eliz = new Teacher (6, "Eliz", 900);
        ahhs.addTeacher(eliz);
        Student lilBob = new Student(4, "Lil Bob", 2);
        ahhs.addStudents(lilBob);

        janna.payFees(5000);
        john.payFees(6000);
        System.out.println("AHHS has earned $" + ahhs.getTotalMoneyEarned() + ".");

        System.out.println("----Making School pay salary----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("AHHS has paid " + lizzy.getName() + " her salary and now has $" + ahhs.getTotalMoneyEarned());
        bob.receiveSalary(bob.getSalary());
        System.out.println("AHHS has paid " + bob.getName() + " his salary and now has $" + ahhs.getTotalMoneyEarned());

        System.out.println(janna);
        System.out.println(bob);
        System.out.println(studentList);
        System.out.println(teacherList);

    }
}
