<%-- 
    Document   : arithmeticcalculator
    Created on : 26-May-2021, 7:08:33 PM
    Author     : Chaudhari
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
        <form action="" method="">
            <label for="first_id">First:</label>
            <input type="text" name="first" id="first_id">
            <br>
            <label for="second_id">Second:</label>
            <input type="text" name="second" id="second_id">
            <br>
            <input type="submit" value="+" name="add">
            <input type="submit" value="-" name="sub">
            <input type="submit" value="*" name="mult">
            <input type="submit" value="%" name="mod">
        </form>
        <p></p>
        <a href="/Lab3_Calculators/age">Age Calculator</a>
    </body>
</html>
