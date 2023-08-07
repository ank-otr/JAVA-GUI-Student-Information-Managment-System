import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class StudentGUI implements ActionListener{
    private JPanel leftPanel, rtPanel, bPanel;
    
    private JLabel hL, iDL, sNL, dOBL,cNL, cDL, tFL, nOML, nOCHL, dPL, dOEL, nORML, nOMAL, dODL, iDCPPL, dPCPPL, hL1, cNGCL, dOEGCL;
    
    private JTextField iDTF, sNTF, cNTF, cDTF, tFTF , nOMTF, nOCHTF, dPTF, nORMTF, nOMATF, iDCPPTF, dPCPPTF, cNGCTF, iDGCTF;
    
    private JButton addR, cPPB, gCB, dButton, cButton, addD, pBB, rSB, closeP, clear,book, book2;
    
    private JToggleButton toggleMenu;
    
    private JFrame newFrame;
    
    private JComboBox dOBComboBox, dOEComboBox, dODComboBox, dayDODComboBox, monthDODComboBox, yearDODComboBox, dayComboBox,
    monthComboBox, yearComboBox,daysComboBox,monthsComboBox,yearsComboBox,daysGCComboBox,monthsGCComboBox,yearsGCComboBox ;
    
    
    
    private int regularStudent, dropoutStudent, aRegular, aDropout;
    
    ArrayList<Student> arrList = new ArrayList<Student>();
    
    private String iD ;
    private String sN;
    private String cN;
    private String cD;
    private String tF;
    private String nOM;
    private String nOCH;
    private String dP;
    private String nORM;
    private String nOMA;
    private String dOB;
    private String dOE;
    private String dOD;
    private String dayOfBirth ;
    private String monthOfBirth;
    private String yearOfBirth;
    private String dayOfEnrollment;
    private String monthOfEnrollment;
    private String yearOfEnrollment;
    private String dayOfDropout;
    private String monthOfDropout;
    private String yearOfDropout;
    private String dOEGC;
    
    
    
    public void StudentGUI(){
        Font aC = new Font("Monospaced", Font.BOLD,14);
        Color lC = new Color(237,139,0), tFC = new Color(190,195,198);   
        newFrame = new JFrame();
        newFrame.setTitle("Student Information System");
        newFrame.setLayout(null);
        newFrame.setBackground(new Color(217,236,238,255));
        newFrame.getContentPane().setBackground(new Color(155, 155, 155));
        
        /* Setting Frame Background 
        
        Set background image on the content pane*/
        
        ImageIcon img = new ImageIcon("background.jpg");
        JLabel background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 700);
        newFrame.setContentPane(background);
        
        
        //Creating Panels 
        
        leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBackground(new Color(33,46,82));
        leftPanel.setBounds(50,95,445,550);
        newFrame.add(leftPanel);
        
        rtPanel = new JPanel();
        rtPanel.setLayout(null);
        rtPanel.setBackground(new Color(33,46,82));
        rtPanel.setBounds(500,95, 445,550);
        newFrame.add(rtPanel);
        
        //Creating new Panel for Calculate Present Percentage of Regular Student
        
        
        bPanel = new JPanel();
        bPanel.setBounds(250,110,500,350);
        bPanel.setBackground(new Color(33,46,82));
        bPanel.setLayout(null);
        
        
        
        //Header
        
        hL = new JLabel();
        hL.setText("REGULAR STUDENT");
        hL.setFont(new Font("Monospaced", Font.BOLD,30));
        hL.setForeground(new Color(237,139,0));
        hL.setBounds(362,40,500,50);
        newFrame.add(hL);
        
        
        
        //Footer 
        
        JLabel fL= new JLabel();
        fL.setText("By:Ankit Kumar Bindu, Met ID: 2285800");
        fL.setFont(new Font("Monospaced", Font.BOLD,10));
        fL.setForeground(new Color(158,123,55));
        fL.setBounds(740,636,500,50);
        newFrame.add(fL);
        
        
        
        
        
        //Label for Enrollment ID
        
        iDL = new JLabel();
        iDL.setText("Enrollment ID: ");
        iDL.setFont(new Font("Monospaced", Font.BOLD,14));
        iDL.setForeground(new Color(237,139,0));
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
        toggleMenu.setText("<html><font color='white' style='font-size: 20px;'>&#8644;</font><font color='red' style='font-size:13px;' >    Dropout Student</font></html>");
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
        cPPB.addActionListener(this);
        rtPanel.add(cPPB);
        
        
        //Creating Grant Certifiacte of Regular Student Button 
        gCB = new JButton();
        gCB.setText("Grant Certificate");
        gCB.setBounds(150,250,150,50);
        gCB.setForeground(new Color(66,133,244));
        gCB.addActionListener(this);
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
        addD.addActionListener(this);
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
        
        
        
        
        //Creating JLabel and TextFeild to enter Enrollment ID for Calculate Present Percentage of Regular Student
        iDCPPL = new JLabel();
        iDCPPL.setText("Enrollment ID:");
        iDCPPL.setFont(new Font("Monospaced", Font.BOLD,13));
        iDCPPL.setForeground(lC);
        iDCPPL.setBounds(20,80,200,50);
        
        iDCPPTF = new JTextField();
        iDCPPTF.setBounds(190, 90, 250, 25);
        iDCPPTF.setBackground(new Color(190,195,198));
        iDCPPTF.setFont(new Font("Monospaced", Font.BOLD,20));
        
        bPanel.add(iDCPPTF);
        bPanel.add(iDCPPL);
        
        //Creating JLabel to enter Days Present for Calculate Present Percentage of Regular Student
        hL1 =new JLabel();
        hL1.setText("");
        hL1.setFont(new Font("SERIF", Font.BOLD,22));
        hL1.setForeground(new Color(237,139,0));
        
        hL1.setBounds(50,10,400,50); 
        bPanel.add(hL1);
        
        dPCPPL= new JLabel();
        dPCPPL.setText("Days Present:");
        dPCPPL.setFont(new Font("Monospaced", Font.BOLD,13));
        dPCPPL.setForeground(lC);
        dPCPPL.setBounds(20,160,200,50);
        
        dPCPPTF = new JTextField();
        dPCPPTF.setBounds(190, 170, 250, 25);
        dPCPPTF.setBackground(new Color(190,195,198));
        dPCPPTF.setFont(new Font("Monospaced", Font.BOLD,20));
        
        bPanel.add(dPCPPTF);
        bPanel.add(dPCPPL);
        
        //Creating Close Button to go back from Calculate Present Percentage Panel
        closeP = new JButton();
        
        closeP.setBounds(475,3,20,20);
        
        ImageIcon closeIcon = new ImageIcon("close.png");
        Image image = closeIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH); // Resize the image
        ImageIcon resizedIcon = new ImageIcon(image);
        closeP.setIcon(resizedIcon);
        closeP.addActionListener(this);
        bPanel.add(closeP);
        
        //Creating Book button for Calulate Present Pecentage
        book = new JButton();
        book.setText("Book");
        book.setForeground(new Color(66,133,244));
        book.setBounds(280, 250, 100,50);
        book.addActionListener(this);
        book.setVisible(false);
        bPanel.add(book);
        //Creating clear button to clear all for Calculate Present Percentage Panel .......
        
        clear = new JButton();
        clear.setText("Clear");
        clear.setForeground(Color.RED);
        clear.setBounds(120, 250, 100,50);
        clear.addActionListener(this);
        clear.setVisible(false);
        bPanel.add(clear);
        
        cNGCL = new JLabel();
        cNGCL.setText("Course Name:");
        cNGCL.setFont(aC);
        cNGCL.setForeground(lC);
        cNGCL.setBounds(20,130,200,50);
        cNGCL.setVisible(false);
        bPanel.add(cNGCL);
        
        cNGCTF = new JTextField();
        cNGCTF.setBounds(190, 140, 250, 25);
        cNGCTF.setBackground(new Color(190,195,198));
        cNGCTF.setFont(new Font("Monospaced", Font.BOLD,20));
        cNGCTF.setVisible(false);
        bPanel.add(cNGCTF);
        
        dOEGCL = new JLabel();
        dOEGCL.setText("Date of Enrollment:");
        dOEGCL.setFont(aC);
        dOEGCL.setForeground(lC);
        dOEGCL.setBounds(20,180,200,50);
        dOEGCL.setVisible(false);
        bPanel.add(dOEGCL);
        
        //ComboBox for Date of Enrollment
        
        String[] daysGC = new String[31];
        for (int i = 1; i<=31; i++){
            daysGC[i-1] = Integer.toString(i);
        }
        daysGCComboBox = new JComboBox<>(daysGC);
        daysGCComboBox.setBounds(190, 193, 60, 20);
        
        String [] monthsGC = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthsGCComboBox = new JComboBox<>(monthsGC);
        monthsGCComboBox.setBounds(245, 193,80, 20);
        
        String[] yearsGC = new String[100];
        for(int i = 0; i < 100; i++){
            yearsGC[i] = Integer.toString(2023 - i);
        }
        yearsGCComboBox = new JComboBox<>(yearsGC);
        yearsGCComboBox.setBounds(320,193,90,21);
        
        daysGCComboBox.setVisible(false);
        monthsGCComboBox.setVisible(false);
        yearsGCComboBox.setVisible(false);
        
        bPanel.add(daysGCComboBox);
        bPanel.add(monthsGCComboBox);
        bPanel.add(yearsGCComboBox);
        
        iDGCTF = new JTextField();
        iDGCTF.setBounds(190, 90, 250, 25);
        iDGCTF.setBackground(new Color(190,195,198));
        iDGCTF.setFont(new Font("Monospaced", Font.BOLD,20));
        bPanel.add(iDGCTF);
        
        bPanel.add(iDCPPTF);
        //Creating Book button for Calulate Present Pecentage
        book2 = new JButton();
        book2.setText("Book");
        book2.setForeground(new Color(66,133,244));
        book2.setBounds(280, 250, 100,50);
        book2.addActionListener(this);
        book2.setVisible(false);
        bPanel.add(book2);
        
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
        
        newFrame.add(bPanel);
        
        bPanel.setVisible(false);
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
    
    //Creating a method to Clear Text fields and Combobox
    private void clear(){
        //Clearing Text Fields 
        
         iDTF.setText("");
         sNTF.setText("");
         cNTF.setText("");
         cDTF.setText("");
         tFTF.setText("");
         nOMTF.setText("");
         nOCHTF.setText("");
         dPTF.setText("");
         nORMTF.setText("");
         nOMATF.setText("");
         iDCPPTF.setText("");
         dPCPPTF.setText("");
         cNGCTF.setText("");
        
        
        
        //Clearing the combo boxes
        
        dayComboBox.setSelectedIndex(-1);
        monthComboBox.setSelectedIndex(-1);
        yearComboBox.setSelectedIndex(-1);
        
        
        daysComboBox.setSelectedIndex(-1);
        monthsComboBox.setSelectedIndex(-1);
        yearsComboBox.setSelectedIndex(-1);
        
        
        dayDODComboBox.setSelectedIndex(-1);
        monthDODComboBox.setSelectedIndex(-1);
        yearDODComboBox.setSelectedIndex(-1);
        
        daysGCComboBox.setSelectedIndex(-1);
        monthsGCComboBox.setSelectedIndex(-1);
        yearsGCComboBox.setSelectedIndex(-1);
    }
    
    public void hide(boolean showHide){
        if(showHide){
            hL1.setVisible(true);
            clear.setVisible(true);
            closeP.setVisible(true);
            leftPanel.setVisible(false);
            rtPanel.setVisible(false);
            hL.setVisible(false);
            bPanel.setVisible(true);
        }else{
            hL1.setVisible(false);
            clear.setVisible(false);
            closeP.setVisible(false);
            leftPanel.setVisible(true);
            rtPanel.setVisible(true);
            hL.setVisible(true);
            bPanel.setVisible(false);
        }
    }
    //Creating method to view elements of the Calculate Present percentage 
    public void cPPV(boolean showHide){
        if(showHide){
            hide(true);
            hL1.setText("Calculate Present Percentage");
            iDCPPL.setVisible(true);
            iDGCTF.setVisible(false);
            iDCPPTF.setVisible(true);
            dPCPPL.setVisible(true);
            dPCPPTF.setVisible(true);
            book.setVisible(true);
            cNGCL.setVisible(false);
            cNGCTF.setVisible(false);
            daysGCComboBox.setVisible(false);
            monthsGCComboBox.setVisible(false);
            yearsGCComboBox.setVisible(false);
            dOEGCL.setVisible(false);

            
        }else{
            hide(false);
            hL1.setText("");
            iDCPPL.setVisible(false);
            iDCPPTF.setVisible(false);
            dPCPPL.setVisible(false);
            dPCPPTF.setVisible(false);
            book.setVisible(false);
            
        }
        
    }
    //Creating method to view elements of Grant Certificate 
    public void gCV(boolean showHide1){
        if(showHide1){
            hide(true);
            hL1.setText("Grant Certificate");
            iDCPPL.setVisible(true);
            iDCPPTF.setVisible(false);
            cNGCL.setVisible(true);
            cNGCTF.setVisible(true);
            daysGCComboBox.setVisible(true);
            monthsGCComboBox.setVisible(true);
            yearsGCComboBox.setVisible(true);
            dOEGCL.setVisible(true);
            dPCPPTF.setVisible(false);
            dPCPPL.setVisible(false);
            book.setVisible(false);
            iDGCTF.setVisible(true);
            book2.setVisible(true);
        }else{
            hide(false);
            hL.setText("");
            iDCPPL.setVisible(false);
            iDGCTF.setVisible(true);
            cNGCL.setVisible(false);
            cNGCTF.setVisible(false);
            daysGCComboBox.setVisible(false);
            monthsGCComboBox.setVisible(false);
            yearsGCComboBox.setVisible(false);
            dOEGCL.setVisible(false);
        }
    }
    
    //Main Method
    public static void main(String[] args){
        StudentGUI gui = new StudentGUI();
        gui.StudentGUI();
    }
     
    //Action Listener    
        public void actionPerformed(ActionEvent e){
        // For retriving selected item for Regular Student  
        String iD = iDTF.getText().trim();
        String sN = sNTF.getText().trim();
        
        // Get the selected date of birth from the JComboBoxes
        String dayOfBirth = (String) dayComboBox.getSelectedItem();
        String monthOfBirth = (String) monthComboBox.getSelectedItem();
        String yearOfBirth = (String) yearComboBox.getSelectedItem();
        
        dOB = dayOfBirth + "-" + monthOfBirth + "-" + yearOfBirth;
        
        String cN = cNTF.getText().trim();
        String cD = cDTF.getText().trim();
        String tF = tFTF.getText().trim();
        String nOM = nOMTF.getText().trim();
        String nOCH = nOCHTF.getText().trim();
        String dP = dPTF.getText().trim();
        
        String iDCP = iDCPPTF.getText().trim();
        String dPCP = dPCPPTF.getText().trim();
        // Get the selected date of enrollment from the JComboBoxes
        String dayOfEnrollment = (String) daysComboBox.getSelectedItem();
        String monthOfEnrollment = (String) monthsComboBox.getSelectedItem();
        String yearOfEnrollment = (String) yearsComboBox.getSelectedItem();
        
        dOE = dayOfEnrollment + "-" + monthOfEnrollment + "-" + yearOfEnrollment;
        
        // For retriving additional selected item for Dropout Student
        String nORM =nORMTF.getText().trim();
        String nOMA = nOMATF.getText().trim();
        
        // Get the selected date of dropout from the JComboBoxes
        String dayOfDropout = (String) dayDODComboBox.getSelectedItem();
        String monthOfDropout = (String) monthDODComboBox.getSelectedItem();
        String yearOfDropout =(String) yearDODComboBox.getSelectedItem();
        
        dOD = dayOfDropout + "-" + monthOfDropout + "-" + yearOfDropout;
        
        String eIDNew = iDGCTF.getText().trim();
        String courseNameNew= cNGCTF.getText().trim();
        // Get selected values from the combo boxes for day, month, and year
        String selectedDay = (String) daysGCComboBox.getSelectedItem();
        String selectedMonth = (String) monthsGCComboBox.getSelectedItem(); 
        String selectedYear = (String) yearsGCComboBox.getSelectedItem();   
        
        String dOENEW= selectedDay + "-" + selectedMonth + "-" + selectedYear;
        
        boolean a; //Intializing boolean for toggleMenu
        boolean showHide;
        //For Switching between Regular Student and Dropout Student         
        if(toggleMenu.isSelected()){
            
            a = true;
            clear();
            
            hL.setText("DROPOUT STUDENT");
            toggleMenu.setText("<html><font color='white' style='font-size: 20px;'>&#8644;</font><font color='red' style='font-size:13px;'>    Regular Student</font></html>");
                    
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
                  
                    
        }else{
            
            
            a = false;
            clear();
            
            hL.setText("REGULAR STUDENT");
            toggleMenu.setText("<html><font color='white' style='font-size: 20px;'>&#8644;</font><font color='red' style='font-size:13px;'>    Dropout Student</font></html>");
                    
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
            addD.setVisible(false);
            gCB.setVisible(true);
                    
                    
            addD.setVisible(false);
            pBB.setVisible(false);
            rSB.setVisible(false);
                    
                    
                    
                    
        }
           
        //For add Regular Student button   
        if (e.getSource() == addR) {            
            if (iD.length() == 0 || dOB.length() == 0 || cN.length() == 0 || sN.length() == 0 || dOE.length() == 0 || cD.length() == 0 || tF.length() == 0 || nOM.length() == 0 || nOCH.length() == 0 ||dP.length() == 0 ) {
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
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(newFrame, "Error adding student: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            clear();
        }

         
        // For add  Dropout Student button
        if (e.getSource() == addD) {
              if (iD.length() == 0 || sN.length() == 0 || dOB.length() == 0 || cN.length() == 0 || tF.length() == 0 || dOD.length() == 0 || dOE.length() == 0 || cD.length() == 0 || nORM.length() == 0 || nOMA.length() == 0) {
                    JOptionPane.showMessageDialog(newFrame, "Error: Empty Fields!", "Fill Up", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        Dropout newDropoutStudent = new Dropout(sN, Integer.parseInt(cD), Integer.parseInt(tF), Integer.parseInt(nORM), Integer.parseInt(nOMA), dOD, Integer.parseInt(iD), cN, dOE, dOB);
                        boolean enID = false;
                        for (Student student : arrList) {
                            if (student.getEnrollmentID() == newDropoutStudent.getEnrollmentID()) {
                                enID = true;
                                JOptionPane.showMessageDialog(newFrame, "Enrollment ID " + newDropoutStudent.getEnrollmentID() + " already taken!", "Error", JOptionPane.WARNING_MESSAGE);
                                break;
                            }
                        }
                        if (!enID) {
                            arrList.add(newDropoutStudent);
                            JOptionPane.showMessageDialog(newFrame, sN + " is added as a Dropout Student!");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(newFrame, "Only numbers are allowed in fields marked with *", "Numeric Inputs Required!", JOptionPane.WARNING_MESSAGE);   
             }   
          }
          clear();
        }
        
        //For Book Button to Calculate Present Percentage 
        if (e.getSource() == book) {
            String enrollmentIdStr = iDCP;
            String daysPresentStr = dPCP;
            
            
            if (enrollmentIdStr.isEmpty() || daysPresentStr.isEmpty()) {
                JOptionPane.showMessageDialog(newFrame, "Please fill in both Enrollment ID and Days Present.", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    int enrollmentId = Integer.parseInt(enrollmentIdStr);
                    int daysPresent = Integer.parseInt(daysPresentStr);
        
                    boolean studentFound = false;
                    for (Student student : arrList) {
                        if (student.getEnrollmentID() == enrollmentId) {
                            if (student instanceof Regular) {
                                Regular regularStudent = (Regular)student;
                                regularStudent.setDaysPresent(daysPresent); // Set the days present for the student
                                
                                String attendanceGrade = regularStudent.presentPercentage(); // Calculate the present percentage and get the attendance grade
                                String message = "Attendance Grade for Enrollment ID " + enrollmentId + ": " + attendanceGrade;
                                JOptionPane.showMessageDialog(newFrame, regularStudent.presentPercentage(), "Attendance Grade", JOptionPane.INFORMATION_MESSAGE);
                                studentFound = true;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(newFrame, "Enrollment ID " + enrollmentId + " does not belong to a Regular Student.", "Invalid Student", JOptionPane.WARNING_MESSAGE);
                                studentFound = true;
                                break;
                            }
                        }
                    }
        
                    if (!studentFound) {
                        JOptionPane.showMessageDialog(newFrame, "Student with Enrollment ID " + enrollmentId + " not found.", "Student Not Found", JOptionPane.WARNING_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(newFrame, "Please enter valid numeric values.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
       //For Book Button for Grant Certificate 
        // For Book Button for Grant Certificate
    if (e.getSource() == book2) {
        String enrollmentIdStr = eIDNew;
        String courseNameStr = courseNameNew;
        String dOEStr = dOENEW; // Assuming this is a valid date string
    
        if (enrollmentIdStr.isEmpty() || courseNameStr.isEmpty() || dOEStr.isEmpty()) {
            JOptionPane.showMessageDialog(newFrame, "Please fill in all required fields.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int enrollmentId = Integer.parseInt(enrollmentIdStr);
                
                boolean studentFound = false;
                for (Student student : arrList) {
                    if (student instanceof Regular) {
                        Regular regularStudent = (Regular) student;
                        if (regularStudent.getEnrollmentID() == enrollmentId &&
                            regularStudent.getCourseName().equalsIgnoreCase(courseNameStr) &&
                            regularStudent.getDateOfBirth().equalsIgnoreCase(dOEStr)) {
                            
                            regularStudent.grantCertificate(courseNameStr, enrollmentId, dOEStr); // Call grantCertificate method
                            
                            studentFound = true;
                            JOptionPane.showMessageDialog(newFrame, "Certificate granted to " + regularStudent.getStudentName(), "Certificate Granted", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }
                }
                
                if (!studentFound) {
                    JOptionPane.showMessageDialog(newFrame, "Regular student with provided details not found.", "Student Not Found", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(newFrame, "Please enter a valid numeric Enrollment ID.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        }
        clear(); // Assuming you want to clear fields after the action
    }

        //For Grant Certificate Button 
        if (e.getSource() == gCB){
            gCV(true);
        }
        
        
        //For Clear Buttons 
        if (e.getSource() == cButton){
            
            clear();
            
        }
        
        if(e.getSource() == clear){
            hide(true);

        }
        
        
        
        // For Calculate Present Percentage Button    
        if (e.getSource() == cPPB) {
             cPPV(true);
                        
            
        } 
        
        //For CloseP Button 
        if (e.getSource() == closeP){
             hide(false);
             clear();
        }
        
             
        // For Display Button
        if (e.getSource() == dButton) {
            if (arrList.isEmpty()) {
                JOptionPane.showMessageDialog(newFrame, "No Fields to Display", "ArrayList is Empty", JOptionPane.WARNING_MESSAGE);
            } else {
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                for (Student list : arrList) {
                    if (list instanceof Regular) {
                        System.out.println("\n\n");
                        Regular regularStudent = (Regular) list;
                        regularStudent.display();
        
                    } else if (list instanceof Dropout) {
                        System.out.println("\n\n");
                        Dropout dropoutStudent = (Dropout) list;
                        dropoutStudent.display();
                    }
                }
                System.out.println("\n\n");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            }
            clear();
        }
    }
}



