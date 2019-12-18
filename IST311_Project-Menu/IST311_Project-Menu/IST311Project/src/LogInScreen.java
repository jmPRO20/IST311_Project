/**
	File name: LogInScreen.java
	Short description: ??????
	IST 242 Assignment:  
	@author Joshua Michaels
	@version 1.01 2014-08-25
	date of last revision:
	details of the revision: none
*/



import java.awt.Color;
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
        
        add(userLabel);
        add(userField);
        add(passwordLabel);
        add(passwordField);
        add(enterButton);
        
    }
}
