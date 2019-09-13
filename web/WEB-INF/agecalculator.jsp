<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2019, 3:46:13 PM
    Author     : 778766
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <div>
            <form action='age' method='post'>
                Enter your age: <input type="text" name="age"><br>
                <input type="submit" value="Age next birthday">
            </form>
            <div>${ageN}</div>
        </div>    
    </body>
</html>
