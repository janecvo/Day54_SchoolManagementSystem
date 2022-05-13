package schoolManagementSystem;

//This class is repsonsible for keeping track of student's fee, name, grade, and fees paid

public class Student{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //Constuctor: To create a new student object by initializing values
    //Fees for every student is $30,000 per year.
    //Fees paid initially is 0.
    // id - id for student - unique
    //name - name of the student
    //grade - grade level of student

    public Student(int id, String name, int grade){
        this. feesPaid = 0; 
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //Not going to alter student's name, studnet's id. - therefore dont need set

    //Used to update the student's grade.
    //paramter grade - new grade of the student
    public void  setGrade(int grade){
        this.grade = grade;
    }

    // Keep adding the fees to feesPaid field
    //feespaid = 10,000 + 5000 + 15000
   //Add the fees to the fees paid.
    //The school is going to receive the funds
    // fees - the fees that student pays

    public void payFees(int fees){
        feesPaid +=fees;
        School.updateTotalMoneyEarned(feesPaid);
        
    }

    //return id of student
    public int getId() {
        return id;
    }

   //return the name of student
    public String getName() {
        return name;
    }

    //return the grade of the student
    public int getGrade() {
        return grade;
    }

   //returns fees paid by the student
    public int getFeesPaid() {
        return feesPaid;
    }

   //returns total fees of the student
    public int getFeesTotal() {
        return feesTotal;
    }

    //returns the remaining fees
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString(){
        return "Student " +name+ " has paid $" + feesPaid + " in fees to AHHS.";
    }


}