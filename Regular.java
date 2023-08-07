public class Regular extends Student {
    //setting attributes of Regular 
    private int numOfModules;
    private int numOfCreditHours;
    private double daysPresent;
    private boolean isGrantedScholarship;
    
    
    
    //creating a constructor Regular
    public  Regular(int enrollmentID, String dateOfBirth, String courseName, String studentName, String dateOfEnrollment, int courseDuration,
    int tuitionFee, int numOfModules, int numOfCreditHours, double daysPresent){
        super(dateOfBirth, studentName, courseDuration, tuitionFee);
        super.setEnrollmentID(enrollmentID);
        super.setCourseName(courseName);
        super.setDateOfEnrollment(dateOfEnrollment);
        this.numOfModules = numOfModules;      
        this.numOfCreditHours = numOfCreditHours;
        this.daysPresent = daysPresent;
        this.isGrantedScholarship = false;
        
        
    }
    
    //corresponding accessor method for each attributes    
    
    //for numOfModules
    public int getNumOfModules() {
        return numOfModules;
    }

    //for numOfCreditHours
    public int getNumOfCreditHours() {
        return numOfCreditHours;
    }

    
    //for daysPresent
    public double getDaysPresent() {
        return daysPresent;
    }

    //for isGrantedScholarship
    public boolean getIsGrantedScholarship() {
        return isGrantedScholarship;
    }
    
    //mutator method for isGrantedScholarship 
    public void setIsGrantedScholarship(boolean isGrantedScholarship){
            this.isGrantedScholarship = isGrantedScholarship;
        }
    
    public void setDaysPresent(double daysPresent){
        this.daysPresent = daysPresent;
    }
        
    //here presentPercentage method 
        public String presentPercentage(){
        //checks if days present exceeds course duration 
        if ((daysPresent/30) > super.getCourseDuration()) {
            System.out.println("Warning: Number of days present cannot exceed course duration");
        }
        double presentPercentage = (double) daysPresent / (super.getCourseDuration() * 30) * 100;
        if (presentPercentage >= 80 && presentPercentage <= 100) {
            setIsGrantedScholarship(true); 
            return "Attendance Grade: A";
        } else if (presentPercentage >= 60 && presentPercentage <= 79) {
            setIsGrantedScholarship(false);
            return "Attendance Grade: B";
        } else if (presentPercentage >= 40 && presentPercentage <= 59) {
            setIsGrantedScholarship(false);
            return "Attendance Grade: C";
        } else if (presentPercentage >= 20 && presentPercentage <= 39) {
            setIsGrantedScholarship(false);
            return "Attendance Grade: D";
        } else {
            setIsGrantedScholarship(false);
            return "Attendance Grade: E";
        }
        
    }
    
    
    public void grantCertificate(String courseName, int enrollmentId, String dateOfEnrollment) {
     String message ="The Student has graduated from " + courseName + " with enrollment ID " + enrollmentId + " and date of enrollment " + dateOfEnrollment;
     if (isGrantedScholarship) {
                System.out.println("The scholarship has been granted.");
    }
    System.out.println(message);
    }
    
    public void display(){
        super.display(); // get basic student information from the Student class
        
        System.out.println("Number of Modules: " + numOfModules + "\n" +"Number of Credit Hours: " + numOfCreditHours + "\n" +
                         "Days Present: " + daysPresent + " days" + "\n"); // additional information specific to Regular class
    
    
    
    }
}









