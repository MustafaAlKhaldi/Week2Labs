<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 17, 2019, 2:08:11 PM
    Author     : 778766
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action='arithmetic' method='post'>
            First: <input type="text" name="first" value="${first}"><br>
            Second: <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+" name="calc">
            <input type="submit" value="-" name="calc">
            <input type="submit" value="*" name="calc">
            <input type="submit" value="%" name="calc">
        </form>
        <div>Result: ${result}</div>
        <a href = "age">Age Calculator</a>
    </body>
</html>
