/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Akash
 */
public class loginServlet extends HttpServlet {

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
        
        if(LoginDao.validate(n, p))
        {
            RequestDispatcher rd = request.getRequestDispatcher("Welcome.html");
            rd.forward(request, response);
        }
        
        else
        {
            out.println("Sorry username and password");
            RequestDispatcher rd = request.getRequestDispatcher("Main.html");
            rd.include(request, response);
        }
        
        out.close();

  }
}