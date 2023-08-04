public void switchPanel2(boolean showHide2){
        if(showHide2){
            switchPanel1(false);
            hL1.setText("Grant Certificate of Regular Student");
            cNGCL.setVisible(true);
            cNGCTF.setVisible(true);
            dOEGCL.setVisible(true);
            daysGCComboBox.setVisible(true);
            monthsGCComboBox.setVisible(true);
            yearsGCComboBox.setVisible(true);
        }else{
            switchPanel1(true);
            cNGCL.setVisible(false);
            cNGCTF.setVisible(false);
            dOEGCL.setVisible(false);
            daysGCComboBox.setVisible(false);
            monthsGCComboBox.setVisible(false);
            yearsGCComboBox.setVisible(false);
        }
        
    } 