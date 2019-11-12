/**
	File name: Menu.java
	Short description: ??????
	IST 242 Assignment:  
	@author Joshua Michaels
	@version 1.01 2014-08-25
	date of last revision:
	details of the revision: none
*/



import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
/**
 *
 * @author Joshua
 */
public class Menu extends JPanel {

    private JLabel menuTitle;
    private JComboBox items;
    private JLabel menuDescription;
    
    public Menu()
    {
        setBackground(Color.RED);
        setLayout(null);
        final int MENU_WIDTH = 800;
        final int MENU_HEIGHT = 800;
        setSize(MENU_WIDTH, MENU_HEIGHT);
        menuTitle = new JLabel("Main Menu");
        menuTitle.setBounds(0, 0, 650, 200);
        menuTitle.setFont(new Font("Serif", Font.BOLD, 100));
        menuDescription = new JLabel("Select an item");
        menuDescription.setFont(new Font("Serif", Font.BOLD, 50));
        menuDescription.setBounds(100, 270, 500, 180);
        items = new JComboBox();
        items.setBounds(100, 400, 200, 20);
        items.addItem("Item 1");
        items.addItem("Item 2");
        items.addItem("Item 3");
        
        add(menuTitle);
        add(menuDescription);
        add(items);
        
    }
    
    
}
