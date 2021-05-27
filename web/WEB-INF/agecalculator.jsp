<%-- 
    Document   : agecalculator
    Created on : 26-May-2021, 12:50:21 PM
    Author     : Chaudhari
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
        <form action="age" method="post">
            <label for="age_id">Enter Your Age:</label>
            <input type="text" name="age" id="age_id" value="${age}">
            <br>
            <input type="submit" value="Age Next Birthday">
        </form>
        <p>${message}</p>
        <a href="/Lab3_Calculators/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
