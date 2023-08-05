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
        