public  class Student
{
        //setting attributes of Students
           private int enrollmentID;
           private String dateOfBirth;
           private String courseName;
           private String studentName;
           private String dateOfEnrollment;
           private int courseDuration;
           private int tuitionFee;
        //creating a constructor Students
        public Student(String dateOfBirth, String studentName, int courseDuration, int tuitionFee)
        {
            this.enrollmentID = 0;                  //Here the attribute enrollmentID is initialized to zero.
            this.dateOfBirth =dateOfBirth; 
            this.studentName = studentName;
            this.courseDuration = courseDuration;
            this.tuitionFee = tuitionFee;
            this.courseName = "";                   //Here attribute courseName initialized to an empty string.
            this.dateOfEnrollment = "";             //Here attribute dateOfEnrollment initialized to an empty string.
        }
        
        /*  using 
            get method 'get()': accessor  
            set methods 'set()': mutator 
          */
        
        //get() for enrollmentID
        
        public int getEnrollmentID(){
            return enrollmentID;
        }
        
        //get() for dateOfBirth
        public String getDateOfBirth(){
            return dateOfBirth;
        }
        
         
        //get() for studentName
        public String getStudentName(){
            return studentName;
        }
        
         //get() for courseDuration
        public int getCourseDuration(){
            return courseDuration;
        }
        
        //get() for tuitionFee 
        public int getTuitionFee(){
            return tuitionFee;
        }
        
        //get() for courseName
        public String getCourseName(){
            return courseName;
        }
                
        //get() for dateOfEnrollment 
        public String getDateOfEnrollment(){
            return dateOfEnrollment;
        }
        
        //set() for courseName
        public  void setCourseName(String courseName){
            this.courseName = courseName;
        }
        
        //set() for enrollmentID 
        public void setEnrollmentID(int enrollmentID) {
            this.enrollmentID = enrollmentID;
        }
        
        //mutator mentod or set() for dateOfEnrollment
        public void setDateOfEnrollment(String dateOfEnrollment){
            this.dateOfEnrollment = dateOfEnrollment;
        }
        
        public void setCourseDuration(int courseDuration){
            this.courseDuration = courseDuration;
        }
        
        public void setDateOfBirth( String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
        }
        
        public void setStudentName(String studentName){
            this.studentName = studentName;
        }
        
        public void setTuitionFee( int tuitionFee){
            this.tuitionFee = tuitionFee;
        }
        //Here created display method with String return type.  
        public void display() {
        if (enrollmentID == 0) {
           System.out.println("Not all parameters have been set");
        } else if (dateOfBirth.isEmpty()) {                 //.isEmpty checks string is empty or not 
            System.out.println("Not all parameters have been set");
        } else if (studentName.isEmpty()) {
            System.out.println("Not all parameters have been set");
        } else if (courseDuration == 0) {                   //for int '=='is used if it is equals to 
            System.out.println("Not all parameters have been set");
        } else if (tuitionFee == 0) {
            System.out.println("Not all parameters have been set");
        } else if (courseName.isEmpty()) {
            System.out.println("Not all parameters have been set");
        } else if (dateOfEnrollment.isEmpty()) {
            System.out.println("Not all parameters have been set");
        } else {
            //creating variable displayString to return String
            String displayString = "\n" + "Enrollment ID: " + enrollmentID + "\n"; // /n is a newline character 
            displayString += "Date of Birth: " + dateOfBirth + "\n"; /* 'dispaly + display' is same as 'display +='
                                                                value of displayString is updated to be included in the String"Date of Birth" */   
            displayString += "Student Name: " + studentName + "\n";
            displayString += "Course Name: " + courseName + "\n";
            displayString += "Years Enrolled: " + (courseDuration / 12) + " years\n";
            displayString += "Course Duration: " + courseDuration + " months\n";
            displayString += "Tuition Fee: Rs." + tuitionFee + "\n";
            displayString += "Date Of Enrollment " + dateOfEnrollment + "\n";
            System.out.println(displayString);
         
        
    }
}
}





    

