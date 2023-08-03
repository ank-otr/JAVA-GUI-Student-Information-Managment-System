if (e.getSource() == book) {
    String enrollmentIdStr = iDTF.getText();
    String daysPresentStr = dPTF.getText();

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
                        Regular regularStudent = (Regular) student;
                        regularStudent.setDaysPresent(daysPresent); // Set the days present for the student
                        String attendanceGrade = regularStudent.calculateAttendanceGrade(); // Calculate and get the attendance grade
                        String message = "Attendance Grade for Enrollment ID " + enrollmentId + ": " + attendanceGrade;
                        JOptionPane.showMessageDialog(newFrame, message, "Attendance Grade", JOptionPane.INFORMATION_MESSAGE);
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
