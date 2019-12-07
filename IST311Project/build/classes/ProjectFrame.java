/**
	File name: ProjectFrame.java
	Short description: ??????
	IST 242 Assignment:  
	@author Joshua Michaels
	@version 1.01 2014-08-25
	date of last revision:
	details of the revision: none
*/


import javax.swing.*;

/**
 *
 * @author Joshua
 */
public class ProjectFrame extends JFrame {

    public ProjectFrame()
    {
        final int MENU_WIDTH = 800;
        final int MENU_HEIGHT = 800;
        setSize(MENU_WIDTH, MENU_HEIGHT);
        setTitle("Store");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        LogInScreen logIn1 = new LogInScreen();
       // Menu m1 = new Menu();
        
        
        add(logIn1);
        //add(m1);
        setVisible(true);
    }
}
