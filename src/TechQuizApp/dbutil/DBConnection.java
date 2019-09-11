package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DBConnection {
    private static Connection conn;
    
    static
    {
        try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-7QODKKDN:1521/xe","tanuj","code");
            JOptionPane.showMessageDialog(null,"Connected Successfully!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Cannot Connect to the db");            
        }
    }
    
    public static Connection getConnection()
    {
        return conn;
    }
    
    public static void closeConnection()
    {
        try
        {
            conn.close();
            JOptionPane.showMessageDialog(null,"DisConnected Successfully!");
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Cannot Close the connection");            
        }
    }
}
