/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Maraxys
 */
public class DBConnExp {
    private static Connection conn;
    
    static{
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-BHPGLS9F:1521/xe","expense","minor");
            //JOptionPane.showMessageDialog(null,"Connected to the Database successfully","Success!",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Error Connecting to the Database"+ex,"Error!",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static Connection getConnection() { 
        return conn;
    }
    
    public static void closeConnection() {
        try{
            if(conn!=null) {
            conn.close();
            JOptionPane.showMessageDialog(null,"Disconnected successfully from the Database","Success!",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Could not Disconnect from the Database"+ex,"Error!",JOptionPane.ERROR_MESSAGE);   
        }
    }
}
