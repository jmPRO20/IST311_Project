/**
	File name: LogInScreen.java
	Short description: ??????
	IST 242 Assignment:  
	@author Joshua Michaels
	@version 1.01 2014-08-25
	date of last revision:
	details of the revision: none
*/


import java.io.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Joshua
 */
public class LogInScreen extends JPanel {

    private JTextField userField;
    private JTextField passwordField;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JButton enterButton;
    
    public LogInScreen() 
    {
       
        setBackground(Color.CYAN);
        userField = new JTextField(12);
        passwordField = new JTextField(12);
        userLabel = new JLabel("Username");
        passwordLabel = new JLabel("Password");
        enterButton = new JButton("Enter");
        enterButton.addActionListener(new LogInListener());
        
        add(userLabel);
        add(userField);
        add(passwordLabel);
        add(passwordField);
        add(enterButton);
        
    }
    
    class LogInListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                writeToFile();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LogInScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Username and password saved!");
        }
        
    }
    
    private void writeToFile() throws FileNotFoundException {
        String outputFileName = "Save File.txt";
            //File outFile = new File(outputFileName);
            PrintWriter output = new PrintWriter(outputFileName);
            output.print(userField.getText() + "\n" + passwordField.getText());
            output.close();
    }
}
