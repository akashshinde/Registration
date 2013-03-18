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
          <input type="submit" class="styled-button-3" value="Download" /> 
<style type="text/css">
.styled-button-3 {
	-webkit-box-shadow:rgba(0,0,0,0.0.1) 0 1px 0 0;
	-moz-box-shadow:rgba(0,0,0,0.0.1) 0 1px 0 0;
	box-shadow:rgba(0,0,0,0.0.1) 0 1px 0 0;
	background-color:#5B74A8;
	border:1px solid #29447E;
	font-family:'Lucida Grande',Tahoma,Verdana,Arial,sans-serif;
	font-size:12px;
	font-weight:700;
	padding:2px 6px;
	height:28px;
	color:#fff;
	border-radius:5px;
	-moz-border-radius:5px;
	-webkit-border-radius:5px
}
</style>
            
        </form>
        <div >
            <img src="my.jpg" class="bg" alt="">
        </div>
    </body>
</html>
