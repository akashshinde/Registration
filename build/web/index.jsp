<%-- 
    Document   : index
    Created on : Mar 16, 2013, 10:13:42 AM
    Author     : Akash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">Registration Page </h1>
        <form action="register" method="post">
            <p> <p>Name :     <input type="text" class="input" name="username" /> <br><br>
           <p> <p>Password : <input type="text" name="userpass" /><br><br>
           <p> <p>Email ID : <input type="text" name="usermail" /><br><br>
           <p> <p>Country : 
            <select name="usercountry">
                <option>India</option>>
                <option>Pakistan</option>
                <option>Other</option>
            </select>
               <p><br>
               <br>
          <input type="submit" value="Register" /> 
        </form>
    </body>
</html>
