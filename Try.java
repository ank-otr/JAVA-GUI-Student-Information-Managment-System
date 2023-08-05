   private void convertString() {
        // For retriving selected item for Regular Student  
        iD = iDTF.getText().trim();
        sN = sNTF.getText().trim();
        
        // Get the selected date of birth from the JComboBoxes
        String dayOfBirth =  dayComboBox.getSelectedItem() != null ? dayComboBox.getSelectedItem().toString().trim():"";
        String monthOfBirth =  monthComboBox.getSelectedItem() != null ? monthComboBox.getSelectedItem().toString().trim() : "";
        String yearOfBirth =  yearComboBox.getSelectedItem() != null ? yearComboBox.getSelectedItem().toString().trim() : "";
        
        dOB = dayOfBirth + "-" + monthOfBirth + "-" + yearOfBirth;
        
        cN = cNTF.getText().trim();
        cD = cDTF.getText().trim();
        tF = tFTF.getText().trim();
        nOM = nOMTF.getText().trim();
        nOCH = nOCHTF.getText().trim();
        dP = dPTF.getText().trim();
        
        // Get the selected date of enrollment from the JComboBoxes
        String dayOfEnrollment =  daysComboBox.getSelectedItem() != null ? daysComboBox.getSelectedItem().toString().trim() : "";
        String monthOfEnrollment = monthsComboBox.getSelectedItem() != null ? monthsComboBox.getSelectedItem().toString().trim() : "";
        String yearOfEnrollment = yearsComboBox.getSelectedItem() != null ? yearsComboBox.getSelectedItem().toString().trim() : "";
        
        dOE = dayOfEnrollment + "-" + monthOfEnrollment + "-" + yearOfEnrollment;
        
        // For retriving additional selected item for Dropout Student
        nORM =nORMTF.getText().trim();
        nOMA = nOMATF.getText().trim();
        
        // Get the selected date of dropout from the JComboBoxes
        String dayOfDropout =  dayDODComboBox.getSelectedItem() != null ? dayDODComboBox.getSelectedItem().toString().trim() : "";
        String monthOfDropout =  monthDODComboBox.getSelectedItem() != null ? monthDODComboBox.getSelectedItem().toString().trim() : "";
        String yearOfDropout = yearDODComboBox.getSelectedItem() != null ? yearDODComboBox.getSelectedItem().toString().trim() : "";
        
        dOD = dayOfDropout + "-" + monthOfDropout + "-" + yearOfDropout;
    }