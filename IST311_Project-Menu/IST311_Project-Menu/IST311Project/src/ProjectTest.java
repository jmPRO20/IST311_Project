
import javax.swing.*;

/**
	File name: ProjectTest.java
	Short description: ??????
	IST 242 Assignment:  
	@author Joshua Michaels
	@version 1.01 2014-08-25
	date of last revision:
	details of the revision: none
*/




/**
 *
 * @author Joshua
 */
public class ProjectTest {

    public static void main(String[] args)
    {
        
        JFrame projectFrame = new JFrame();
        final int MENU_WIDTH = 800;
        final int MENU_HEIGHT = 800;
        projectFrame.setSize(MENU_WIDTH, MENU_HEIGHT);
        projectFrame.setTitle("Store");
        projectFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        
        LogInScreen logIn1 = new LogInScreen();
        
        projectFrame.add(logIn1);
        projectFrame.setVisible(true);
    }
}
