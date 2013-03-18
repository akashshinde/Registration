/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author Akash
 */
public class register extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String n = request.getParameter("username");
        String p = request.getParameter("userpass");
        String e = request.getParameter("usermail");
        String c = request.getParameter("usercountry");
     
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
            
            PreparedStatement ps = con.prepareStatement("insert into registeruser values(?,?,?,?)");
            ps.setString(1, n);
            ps.setString(2, p);
            ps.setString(3, e);
            ps.setString(4, c);
            
            int i = ps.executeUpdate();
            if(i>0)
            {
                out.println("Succesfully Registered");
                
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    out.close();
         }
    
}
