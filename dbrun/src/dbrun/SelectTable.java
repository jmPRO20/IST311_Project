package dbrun;

import java.sql.DriverManager;  
import java.sql.Connection;  
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.sql.Statement;  


public class SelectTable {  
   
    private Connection connect() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:updatemenu.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }  
   
  
    public void selectAll(){
        // Selects data from the entire table
        String sql = "SELECT * FROM Menu";  
          
        try {  
            Connection conn = this.connect();  
            Statement stmt  = conn.createStatement();  
            ResultSet rs    = stmt.executeQuery(sql);  
              
            // loop through the result set to display everything
            // Reads in data from table and assigns it to variables
            while (rs.next()) {  
                System.out.println(rs.getInt("ItemNum") +  "\t" +   
                                   rs.getString("ItemName") + "\t" +  
                                   rs.getDouble("Price") + "\t" +
                                   rs.getString("Size")
               );  
            }  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }  
      
     
   
    
   
}  
