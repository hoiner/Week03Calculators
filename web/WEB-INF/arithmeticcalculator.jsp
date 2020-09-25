<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 25, 2020, 10:11:22 AM
    Author     : 758688
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
        <form method="post" action="arithmetic"> 
            First: <input type="number" name="first" value="${first}"><br>
            Second: <input type="number" name="second" value="${second}}"><br>
            <input type="submit" value="+" name="operator">
            <input type="submit" value="-" name="operator">
            <input type="submit" value="*" name="operator">
            <input type="submit" value="%" name="operator">
        </form>
        <p>Result: ${answer}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
