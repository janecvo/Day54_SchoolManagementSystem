package schoolManagementSystem;

//This class is responsible for keeping track of teacher's id, name, and salary

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

   //creates a new Teacher object
   //id - id for the teacher
   //name - name of the teacher
   //salary - salary of the teacher

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    //returns the id for the teacher
    public int getId(){
        return id;
    }

    //returns the name of the teacher
    public String getName(){
        return name;
    }

    //returns the salary of the teacher
    public int getSalary(){
        return salary;
    }

    //set the salary
    public void setSalary(int salary){
        this.salary = salary;
    }


    //adds to salaryEarned
    //Removes from the total money earn by school
    
    public void receiveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

@Override
    public String toString(){
        return "Teacher " + name+ " has earned $" + salaryEarned + " from AHHS.";
    }
}
