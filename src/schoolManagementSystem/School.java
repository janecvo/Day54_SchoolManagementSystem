package schoolManagementSystem;

import java.util.List;

//School can have many teachers, many students
//Implement teachers and students using an ArrayList

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

  //new school object is created
  //teachers - list of teachers in school
  //students - list of students in school

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    //returns the list of teachers in school
    public List<Teacher> getTeachers() {
        return teachers;
    }

    //adds a teacher to the school through Teachers list
    //teacher - the teacher to be added
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    //returns the list of students in the school
    public List<Student> getStudents() {
        return students;
    }

    //adds a student to the school through Students list
    //student - student to be added
    public void addStudents(Student student) {
        students.add(student);
    }

    //return the total money earned by the school
    public  int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    //adds the total money earned by the school
    //MoneyEarned money that is supposed to be added
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

   //returns the total money spent by the school
    public static  int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //update the money that is spent by the school which is the salary given by the school to its teachers
    //MoneySpent - the money spent by school (teacher salary)
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }

    





}
