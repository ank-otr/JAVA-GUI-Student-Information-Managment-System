public class Dropout extends Student {
      private int numOfRemainingModules;
      private int numOfMonthsAttended;
      private String dateOfDropout;
      private int remainingAmount;
      private boolean hasPaid;
      private boolean added;
      private boolean removed;

    public Dropout(String studentName, int courseDuration, int tuitionFee, int numOfRemainingModules, 
    int numOfMonthsAttended, String dateOfDropout, int enrollmentID, String courseName, String dateOfEnrollment, String dateOfBirth ) 
    {
        super(dateOfBirth, studentName, courseDuration, tuitionFee); //calling to the superclass constructor with four parameters
        super.setEnrollmentID(enrollmentID); //calling the parent class setter method for enrollment id 
        super.setCourseName(courseName);   //calling the parent class setter method for course name
        super.setDateOfEnrollment(dateOfEnrollment);    //calling the parent class setter method for date of enrollment 
       //assigning whit the parameter values 
    this.numOfRemainingModules = numOfRemainingModules;      
    this.numOfMonthsAttended = numOfMonthsAttended;
    this.dateOfDropout = dateOfDropout;
    this.remainingAmount = 0; //initializing the value to '0'.
    this.hasPaid = false; //initializing the value to 'false'.
    }
    
    // Accessor methods for each attributes 
    
    public int getNumOfRemainingModules() {
        return numOfRemainingModules;
    }

    public int getNumOfMonthsAttended() {
        return numOfMonthsAttended;
    }

    public String getDateOfDropout() {
        return dateOfDropout;
    }

    public int getRemainingAmount() {
        return remainingAmount;
    }
    
    public boolean getHasPaid() {
        return hasPaid;
    }
    
    public boolean getAdded(){
        return added;
    }
    
    public boolean getRemoved(){
        return removed;
    }
   //mutator methods
    public void setDateOfDropout(String dateOfDropout){
        this.dateOfDropout = dateOfDropout;
    }
    
    public void setNumOfRemainingModules (int numOfRemainingModules){
        this.numOfRemainingModules = numOfRemainingModules;
    }
    
    public void setNumOfMonthsAttended (int numOfMonthsAttended){
        this.numOfMonthsAttended = numOfMonthsAttended;
    }
    
    public void setRemainingAmount (int remainingAmount){
        this.remainingAmount = remainingAmount ;
    }
    
    
    // creating billsPayable method to calculate the pending tuition fee amount.
    public void billsPayable() {
    if(removed == true){ 
        System.out.println("Student information missing!");
    }else{
        remainingAmount = (super.getCourseDuration() - numOfMonthsAttended) * (super.getTuitionFee()/super.getCourseDuration());
        hasPaid = true;
        System.out.println(remainingAmount); 
         
    }
    
}

    
    //crating removeStudent method
    public void removeStudent(){
    if(removed == true){
        System.out.println("Student information missing!");
    }else{
        if (hasPaid) {
        setDateOfBirth("");
        setCourseName("");
        setStudentName("");
        setDateOfEnrollment("");
        setCourseDuration(0);
        setTuitionFee(0);
        setDateOfDropout("");
        setEnrollmentID(0);
        setNumOfRemainingModules(0);
        setNumOfMonthsAttended(0);
        setRemainingAmount(0);
        } 
        else {
             System.out.println("All bills not cleared");
        }
    }
}
    
    //display method
     public void display(){
    super.display(); // get basic student information from the Student class
    if(added == true){
        
    
    System.out.println("\n" +"Number of Remaining Modules: " + numOfRemainingModules + "\n" +
                         "Number of Months Attended: " + numOfMonthsAttended + "\n" +
                         "Date of Drop Out: " + dateOfDropout + "\n"+
                         "Remaning Amount: " + remainingAmount + "\n"); // additional information specific to Dropout class
 }else{
     System.out.println("Dropout Student has not been added");
 }
                        
}
}