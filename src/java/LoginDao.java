/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
import java.sql.*;

public class LoginDao {
    
    public static boolean validate(String name,String pass){
        boolean status = false;
        
        try{ 
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            PreparedStatement ps = con.prepareStatement("select * from registeruser where email=? and pass=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            status = rs.next();
            
        }
        
        // Its required before try , catch Blog
        
        catch(Exception e )
        {
            System.out.println("e");
                
        }
        return status;
        
    } 
    
    
}
