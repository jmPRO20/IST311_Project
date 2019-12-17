/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbrun;

import java.beans.Statement;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.SQLException;  
   



public class Connect {  
     /** 
     * Connects to  menu database
     */  
    public static void connect() {  
        Connection conn = null;  
        try {  
            // file path (not local)
            String url = "jdbc:sqlite:updatemenu.db";  
             
            conn = DriverManager.getConnection(url);  
            //initially used for testing, uncomment if nothing is displayed.
            //System.out.println("Connection to SQLite has been established.");  
              
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        } finally {  
            try {  
                if (conn != null) {  
                    conn.close();  
                }  
            } catch (SQLException ex) {  
                System.out.println(ex.getMessage());  
            }  
        }  
    }  
    /** 
     * @param args the command line arguments 
     */  
    /*
    public static void main(String[] args) {  
        //connect();  
        SelectTable app = new SelectTable();  
        app.selectAll();  
    }  
}  
*/ 