import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;



public class StudentGUI implements ActionListener{
    private JPanel leftPanel, rtPanal;
    private JLabel hL, iDL, sNL, dOBL,cNL, cDL, tFL, nOML, nOCHL, dPL, dOEL, nORML, nOMAL, dODL;
    private JTextField iDTF, sNTF, cNTF, cDTF, tFTF , nOMTF, nOCHTF, dPTF, nORMTF, nOMATF;
    
    private JButton addR, cPPB, gCB, dButton, cButton, addD, pBB, rSB;
    
    private JToggleButton toggleMenu;
    private JFrame newFrame;
    private JComboBox dOBComboBox, dOEComboBox, dODComboBox, dayDODComboBox, monthDODComboBox, yearDODComboBox, dayComboBox,
    monthComboBox, yearComboBox,daysComboBox,monthsComboBox,yearsComboBox ;
    
    
    
    
    
    ArrayList<Student> arrList = new ArrayList<Student>();
    
    
    
    private int regularStudent, dropoutStudent, aRegular, aDropout;
    
    public void StudentGUI(){
        
        
        
        JFrame newFrame = new JFrame();
        newFrame.setTitle("Student Information System");
        newFrame.setLayout(null);
        newFrame.setBackground(new Color(217,236,238,255));
        newFrame.getContentPane().setBackground(new Color(155, 155, 155));
        
        //setting Frame Background 
        
        // Set background image on the content pane
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        newFrame.setContentPane(background);
        
        
        //Creating Panels 
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBackground(new Color(33,46,82));
        leftPanel.setBounds(50,95,445,550);
        newFrame.add(leftPanel);
        
        JPanel rtPanel = new JPanel();
        rtPanel.setLayout(null);
        rtPanel.setBackground(new Color(33,46,82));
        rtPanel.setBounds(500,95, 445,550);
        newFrame.add(rtPanel);
        
        //Header
        hL = new JLabel();
        hL.setText("REGULAR STUDENT");
        hL.setFont(new Font("Monospaced", Font.BOLD,30));
        hL.setForeground(new Color(158,123,55));
        hL.setBounds(362,40,500,50);
        newFrame.add(hL);
        
        
        
        //Footer 
        JLabel fL= new JLabel();
        fL.setText("By:Ankit Kumar Bindu, Met ID: 2285800");
        fL.setFont(new Font("Monospaced", Font.BOLD,10));
        fL.setForeground(new Color(158,123,55));
        fL.setBounds(740,636,500,50);
        newFrame.add(fL);
        
        //Fonts and Colors
        Font aC = new Font("Monospaced", Font.BOLD,14);
        Color tFC = new Color(190,195,198);
        Color lC = new Color(158,123,55);
        
        
        
        //Label for Enrollment ID
        iDL = new JLabel();
        iDL.setText("Enrollment ID: ");
        iDL.setFont(new Font("Monospaced", Font.BOLD,14));
        iDL.setForeground(new Color(158,123,55));
        iDL.setBounds(20,10,200,50);
        leftPanel.add(iDL);
        
        //TextField for Enrollment ID
        iDTF = new JTextField();
        iDTF.setBounds(180, 25, 250, 25);
        iDTF.setBackground(new Color(190,195,198));
        iDTF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(iDTF);
        
        //Label for Student Name 
        sNL = new JLabel();
        sNL.setText("Student Name: ");
        sNL.setFont(aC);
        sNL.setForeground(lC);
        sNL.setBounds(20, 60, 200, 50);
        leftPanel.add(sNL);
        
        //TextField for Student Name 
        
        sNTF = new JTextField();
        sNTF.setBounds(180, 75, 250, 25);
        sNTF.setBackground(new Color(190,195,198));
        sNTF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(sNTF);
        
        //Label for Date Of Birth
        dOBL = new JLabel();
        dOBL.setText("Date Of Birth: ");
        dOBL.setFont(aC);
        dOBL.setForeground(lC);
        dOBL.setBounds(20, 110, 200, 50);
        leftPanel.add(dOBL);
        
        
        //ComboBox for Date of Birth
        
        String[] day = new String[31];
        for (int i = 1; i<=31; i++){
            day[i-1] = Integer.toString(i);
        }
        dayComboBox = new JComboBox<>(day);
        dayComboBox.setBounds(180, 127, 60, 20);
        
        String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        monthComboBox = new JComboBox<>(month);
        monthComboBox.setBounds(236, 127,80, 20);
        
        String[] year = new String[100];
        for(int i = 0; i < 100; i++){
                    year[i] = Integer.toString(2023 - i);
        }
        yearComboBox = new JComboBox<>(year);
        yearComboBox.setBounds(312,127,90,21);
        
        
        
        
        leftPanel.add(dayComboBox);
        leftPanel.add(monthComboBox);
        leftPanel.add(yearComboBox);
        
        //Label for Course Name
        
        cNL = new JLabel();
        cNL.setText("Course Name: ");
        cNL.setFont(aC);
        cNL.setForeground(lC);
        cNL.setBounds(20, 160, 200, 50);
        leftPanel.add(cNL);
        
        //TextField for Course Name 
        
        
        cNTF = new JTextField();
        cNTF.setBounds(180, 175, 250, 25);
        cNTF.setBackground(new Color(190,195,198));
        cNTF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(cNTF);
        
        //Label for Course Duration 
        cDL = new JLabel();
        cDL.setText("Course Duration: ");
        cDL.setFont(aC);
        cDL.setForeground(lC);
        cDL.setBounds(20, 210, 200, 50);
        leftPanel.add(cDL);
        
        
        //Text Field for Course Duration
        
        cDTF = new JTextField();
        cDTF.setBounds(180, 225, 250, 25);
        cDTF.setBackground(new Color(190,195,198));
        cDTF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(cDTF);
        
        
        //Label for TuitionFee
        tFL = new JLabel();
        tFL.setText("Tuition Fee: ");
        tFL.setFont(aC);
        tFL.setForeground(lC);
        tFL.setBounds(20, 260, 200, 50);
        leftPanel.add(tFL);
        
        
        //Text Feild for Tuition Fee
        
        tFTF = new JTextField();
        tFTF.setBounds(180, 275, 250, 25);
        tFTF.setBackground(new Color(190,195,198));
        tFTF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(tFTF);
        
        
        //Label for Number Of Modules 
        nOML = new JLabel();
        nOML.setText("No.Of Modules: ");
        nOML.setFont(aC);
        nOML.setForeground(lC);
        nOML.setBounds(20, 310, 200, 50);
        leftPanel.add(nOML);
        
        
        //Text Feild for Number Of Modules 
        
        nOMTF = new JTextField();
        nOMTF.setBounds(180, 325, 250, 25);
        nOMTF.setBackground(new Color(190,195,198));
        nOMTF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(nOMTF);
        
        
        
        //Label for Number Of Credit Hours
        nOCHL = new JLabel();
        nOCHL.setText("Credit Hours: ");
        nOCHL.setFont(aC);
        nOCHL.setForeground(lC);
        nOCHL.setBounds(20, 360, 200, 50);
        leftPanel.add(nOCHL);
        
        
        //Text Feild for Number Of Credit Hours
        
        nOCHTF = new JTextField();
        nOCHTF.setBounds(180, 375, 250, 25);
        nOCHTF.setBackground(new Color(190,195,198));
        nOCHTF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(nOCHTF);
        
        //Label for Days Present
        dPL = new JLabel();
        dPL.setText("Days Present: ");
        dPL.setFont(aC);
        dPL.setForeground(lC);
        dPL.setBounds(20, 410, 200, 50);
        leftPanel.add(dPL);
        
        
        //Text Feild for Days Present
        
        dPTF = new JTextField();
        dPTF.setBounds(180, 424, 250, 25);
        dPTF.setBackground(new Color(190,195,198));
        dPTF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(dPTF);
        
        //Label for Date Of Enrollment
        dOEL = new JLabel();
        dOEL.setText("Date Of Enrollment: ");
        dOEL.setFont(new Font("Monospaced", Font.BOLD,14));
        dOEL.setForeground(lC);
        dOEL.setBounds(20, 460, 200, 50);
        leftPanel.add(dOEL);
        
        
        //ComboBox for Date of Enrollment
        
        String[] days = new String[31];
        for (int i = 1; i<=31; i++){
            days[i-1] = Integer.toString(i);
        }
        daysComboBox = new JComboBox<>(days);
        daysComboBox.setBounds(180, 475, 60, 20);
        
        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthsComboBox = new JComboBox<>(months);
        monthsComboBox.setBounds(236, 475,80, 20);
        
        String[] years = new String[100];
        for(int i = 0; i < 100; i++){
                    years[i] = Integer.toString(2023 - i);
        }
        yearsComboBox = new JComboBox<>(years);
        yearsComboBox.setBounds(312,475,90,21);
        
        
        
        leftPanel.add(daysComboBox);
        leftPanel.add(monthsComboBox);
        leftPanel.add(yearsComboBox);
        
        
        /*Dropout*/
        // Label for Number Of Remaining Modules 
        nORML = new JLabel();
        nORML.setText("Remaining Modules : ");
        nORML.setFont(aC);
        nORML.setForeground(lC);
        nORML.setBounds(20, 310, 200, 50);
        leftPanel.add(nORML);
        
        
        //Text Feild for Number Of Remaining Modules 
        
        nORMTF = new JTextField();
        nORMTF.setBounds(180, 325, 250, 25);
        nORMTF.setBackground(new Color(190,195,198));
        nORMTF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(nORMTF);
        
        //Label for Number Of Months Attended 
        nOMAL = new JLabel();
        nOMAL.setText("Months Attended: ");
        nOMAL.setFont(aC);
        nOMAL.setForeground(lC);
        nOMAL.setBounds(20, 360, 200, 50);
        leftPanel.add(nOMAL);
        
        
        //Text Feild for Number Of Months Attended 
        
        nOMATF = new JTextField();
        nOMATF.setBounds(180, 375, 250, 25);
        nOMATF.setBackground(new Color(190,195,198));
        nOMATF.setFont(new Font("Monospaced", Font.BOLD,20));
        leftPanel.add(nOMATF);
        
        //Label for Date Of Dropout
        dODL = new JLabel();
        dODL.setText("Date Of Dropout: ");
        dODL.setFont(aC);
        dODL.setForeground(lC);
        dODL.setBounds(20, 410, 200, 50);
        leftPanel.add(dODL);
        
        
        //Combobox for Date Of Dropout
        String[] dayDOD = new String[31];
        for (int i = 1; i<=31; i++){
            dayDOD[i-1] = Integer.toString(i);
        }
        dayDODComboBox = new JComboBox<>(dayDOD);
        dayDODComboBox.setBounds(180, 425, 60, 20);
        
        String [] monthDOD = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthDODComboBox = new JComboBox<>(monthDOD);
        monthDODComboBox.setBounds(236, 425,80, 20);
        
        String[] yearDOD = new String[100];
        for(int i = 0; i < 100; i++){
                    yearDOD[i] = Integer.toString(2023 - i);
        }
        yearDODComboBox = new JComboBox<>(yearDOD);
        yearDODComboBox.setBounds(312,425,90,21);
        
        
        
        leftPanel.add(dayDODComboBox);
        leftPanel.add(monthDODComboBox);
        leftPanel.add(yearDODComboBox);
        
        
        
        //Creating Toggle Button to switch between Regular Student and Dropout Student 
        toggleMenu = new JToggleButton();
        
        
        toggleMenu.setText("<html><font color='black' style='font-size: 20px;'>&#8644;</font><font color='red' style='font-size:13px;' >    Dropout Student</font></html>");

        toggleMenu.setBounds(110, 10, 230, 45);
        toggleMenu.setBorder(BorderFactory.createTitledBorder("<html> <font color='white'>Switch to</font></html>"));
        
        toggleMenu.addActionListener(this);
        toggleMenu.setFont(new Font("Monospaced", Font.PLAIN,14));
        
        toggleMenu.setForeground(new Color(158,123,55)); 
        
        rtPanel.add(toggleMenu);
        
        
        //Creating Add regular student button
        addR = new JButton();
        addR.setText("Add Student");
        addR.setBounds(150,100,150,50);
        addR.addActionListener(this);
        
        addR.setForeground(new Color(66,133,244)); // Set the text color to make it visible on the blue background
        
        
        rtPanel.add(addR);
        
        //Creating Calculate Present Percentage of Regular Student Button 
        
        cPPB = new JButton();
        cPPB.setText("Present Percentage");
        cPPB.setBounds(150,175,150,50);
        cPPB.setForeground(new Color(66,133,244));
        rtPanel.add(cPPB);
        
        
        //Creating Grant Certifiacte of Regular Student Button 
        
        gCB = new JButton();
        gCB.setText("Grant Certificate");
        gCB.setBounds(150,250,150,50);
        gCB.setForeground(new Color(66,133,244));
        rtPanel.add(gCB);
        
        //Creating Display Button 
        
        dButton = new JButton();
        dButton.setText("Display");
        dButton.setBounds(50,350,150,50);
        dButton.setForeground(new Color(66,133,244));
        dButton.addActionListener(this);
        rtPanel.add(dButton);
        
        
        //Creating Clear Button
        
        cButton = new JButton();
        cButton.setText("Clear");
        cButton.setBounds(250,350,150,50);
        cButton.setForeground(new Color(66,133,244));
        cButton.addActionListener(this);
        rtPanel.add(cButton);
        
        
        
        
        //Creating Add Dropout student button
        addD = new JButton();
        addD.setText("Add Student");
        addD.setBounds(150,100,150,50);
        addD.setForeground(new Color(66,133,244));
        rtPanel.add(addD);
        
        //Creating Pay the Bills of Dropout Student 
        
        pBB = new JButton();
        pBB.setText("Pay Bills");
        pBB.setBounds(150,175,150,50);
        pBB.setForeground(new Color(66,133,244));
        rtPanel.add(pBB);
        
        
        //Creating Remove Student Button 
        
        rSB = new JButton();
        rSB.setText("Remove Student");
        rSB.setBounds(150,250,150,50);
        rSB.setForeground(new Color(66,133,244));
        rtPanel.add(rSB);
        
        
        // Adding a Window Listener to the JFrame newFrame to handle the window closing event
        newFrame.addWindowListener(new WindowAdapter() {   
            public void windowClosing(WindowEvent wc) {
                    int pop = JOptionPane.showConfirmDialog(newFrame, "Do you want to Exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                    if (pop == JOptionPane.YES_OPTION) {
                        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    } else if (pop == JOptionPane.NO_OPTION) {
                        newFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                    }
             }
        });

        
        
        nORML.setVisible(false);
        nOMAL.setVisible(false);
        dODL.setVisible(false);
        newFrame.setVisible(true);
        newFrame.setSize(1000, 700);
        newFrame.setResizable(false);
        
    }
    
        public void regularStudent() {
        int i = 0;
        for (Student li : arrList) {
            if (li instanceof Regular) {
                i++;
            }
        }
        aRegular = i;
    }

    
            public void dropoutStudent() {
            int i = 0;
            for (Student li : arrList) {
                if (li instanceof Dropout) {
                    i++;
                }
            }
            aDropout = i;
        }
    
        public static void main(String[] args){
            StudentGUI gui = new StudentGUI();
            gui.StudentGUI();
        }
            public void actionPerformed(ActionEvent e){
            //For Switching between Regular Student and Dropout Student
            boolean a;
            
            if(toggleMenu.isSelected()){
                a = true;
              
                hL.setText("DROPOUT STUDENT");
                toggleMenu.setText("<html><font color='black' style='font-size: 20px;'>&#8644;</font><font color='red' style='font-size:13px;'>    Regular Student</font></html>");
                
                nOML.setVisible(false);
                nOCHL.setVisible(false);
                dPL.setVisible(false);
                dPTF.setVisible(false);
                
                nOMTF.setVisible(false);
                nOCHTF.setVisible(false);
                
                cPPB.setVisible(false);
                addR.setVisible(false);
                gCB.setVisible(false);
                addD.setVisible(true);
                pBB.setVisible(true);
                rSB.setVisible(true);
                
                
                nORMTF.setVisible(true);
                nOMATF.setVisible(true);
                
                nORML.setVisible(true);
                nOMAL.setVisible(true);
                dODL.setVisible(true);
                
                
                
                dayDODComboBox.setVisible(true);
                monthDODComboBox.setVisible(true);
                yearDODComboBox.setVisible(true);
              
                
            }
            else {
                a = false;
                
                hL.setText("REGULAR STUDENT");
                toggleMenu.setText("<html><font color='black' style='font-size: 20px;'>&#8644;</font><font color='red' style='font-size:13px;'>    Dropout Student</font></html>");
                
                nORML.setVisible(false);
                nOMAL.setVisible(false);
                dODL.setVisible(false);
                
                nORMTF.setVisible(false);
                nOMATF.setVisible(false);
                nOMTF.setVisible(true);
                nOCHTF.setVisible(true);
                
                  
                nOML.setVisible(true);
                nOCHL.setVisible(true);
                dPL.setVisible(true); 
                dPTF.setVisible(true);
                
                dayDODComboBox.setVisible(false);
                monthDODComboBox.setVisible(false);
                yearDODComboBox.setVisible(false);
                
            
                cPPB.setVisible(true);
                addR.setVisible(true);
                gCB.setVisible(true);
                
                
                addD.setVisible(false);
                pBB.setVisible(false);
                rSB.setVisible(false);
                
                //
                
                
            }
            
            //For Clear Button 
            if (e.getSource() == cButton) {
                iDTF.setText(""); // Clearing the Enrollment ID field
                sNTF.setText("");
                cNTF.setText("");
                cDTF.setText("");
                tFTF.setText("");
                nOCHTF.setText("");
                dPTF.setText("");
                nORMTF.setText("");
                nOMATF.setText("");
                nOMTF.setText("");
                
                
                // Clearing the combo boxes
                dayComboBox.setSelectedIndex(-1);
                monthComboBox.setSelectedIndex(-1);
                yearComboBox.setSelectedIndex(-1);
                
                
                daysComboBox.setSelectedIndex(-1);
                monthsComboBox.setSelectedIndex(-1);
                yearsComboBox.setSelectedIndex(-1);
                
                
                dayDODComboBox.setSelectedIndex(-1);
                monthDODComboBox.setSelectedIndex(-1);
                yearDODComboBox.setSelectedIndex(-1);
                
            }
            
            //For retriving selected item for Regular Student  
            String iD = iDTF.getText();
            String sN = sNTF.getText();
            
            // Get the selected date of birth from the JComboBoxes
            String dayOfBirth = (String) dayComboBox.getSelectedItem();
            String monthOfBirth = (String) monthComboBox.getSelectedItem();
            String yearOfBirth = (String) yearComboBox.getSelectedItem();
            
            String dOB = dayOfBirth + "-" + monthOfBirth + "-" + yearOfBirth;
            
            String cN = cNTF.getText();
            String cD = cDTF.getText();
            String tF = tFTF.getText();
            String nOM = nOMTF.getText();
            String nOCH = nOCHTF.getText();
            String dP = dPTF.getText();
            
            // Get the selected date of enrollment from the JComboBoxes
            String dayOfEnrollment = (String) daysComboBox.getSelectedItem();
            String monthOfEnrollment = (String) monthsComboBox.getSelectedItem();
            String yearOfEnrollment = (String) yearsComboBox.getSelectedItem();
            
            String dOE = dayOfEnrollment + "-" + monthOfEnrollment + "-" + yearOfEnrollment;
            
            //For retriving additional selected item for Dropout Student
            String nORM =nORMTF.getText();
            String nOMA = nOMATF.getText();
            
            // Get the selected date of dropout from the JComboBoxes
            String dayOfDropout = (String) dayDODComboBox.getSelectedItem();
            String monthOfDropout = (String) monthDODComboBox.getSelectedItem();
            String yearOfDropout = (String) yearDODComboBox.getSelectedItem();
            
            String dOD = dayOfDropout + "-" + monthOfDropout + "-" + yearOfDropout;
            
            
        //For add Regular Student button   
        if (e.getSource() == addR) {
            if (iD.length() == 0 || sN.length() == 0 || dOB.length() == 0 || cN.length() == 0 || tF.length() == 0 || nOM.length() == 0 || nOCH.length() == 0 || dP.length() == 0 || dOE.length() == 0) {
                JOptionPane.showMessageDialog(newFrame, "Error: Empty Fields!", "Fill Up", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    // Create a new Regular object and add it to the arrList
                    Regular newRegularStudent = new Regular(Integer.parseInt(iD), dOB, cN, sN, dOE, Integer.parseInt(cD), Integer.parseInt(tF), Integer.parseInt(nOM), Integer.parseInt(nOCH), Integer.parseInt(dP));
                    
                    // Check for duplicate enrollment ID
                    boolean enID = false;
                    for (Student student : arrList) {
                        if (student.getEnrollmentID() == newRegularStudent.getEnrollmentID()) {
                            enID = true;
                            JOptionPane.showMessageDialog(newFrame, "Enrollment ID " + newRegularStudent.getEnrollmentID() + " already taken!", "Error", JOptionPane.WARNING_MESSAGE);
                            break; // Exit the loop, no need to check further
                        }
                    }
        
                    if (!enID) {
                        arrList.add(newRegularStudent);
                        JOptionPane.showMessageDialog(newFrame, sN + " is added as a Regular Student!");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(newFrame, "Only numbers are allowed in field marked with *", "Numeric Inputs Required!", JOptionPane.WARNING_MESSAGE);
                    iDL.setText("Enrollment ID"+ "<html> <font color='red' style='font-size:13px;'>*</font></html>");
                }
            }
        }


           
          

            
           //For Display Button 
            if(e.getSource() == dButton){
                if(arrList.isEmpty()){
                    JOptionPane.showMessageDialog(newFrame,"No Fields to Dispaly", "Arraylist is Empty", JOptionPane.WARNING_MESSAGE);     
                }else{
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            for (Student list : arrList) {
                if (list instanceof Regular) {
                    System.out.println("\n\n");
                    Regular regularStudent = (Regular) list;
                    regularStudent.display();
                }
            }
                    System.out.println("\n\n");
                    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                }
            }
        }
    }

