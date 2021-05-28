/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chaudhari
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "Result: ---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // get input and submit button values as a String
        String firstString = request.getParameter("first");
        String secondString = request.getParameter("second");
        String addButton = request.getParameter("add");
        String subButton = request.getParameter("sub");
        String multButton = request.getParameter("mult");
        String modButton = request.getParameter("mod");
        
        int first = 0;
        int second = 0;
        int result = 0;
        boolean isValidNum;
        
        // set the inputs to their respective values
        request.setAttribute("first", firstString);
        request.setAttribute("second", secondString);
        
        // check if inputs are valid int using try catch
        try {
            first = Integer.parseInt(firstString);
            second = Integer.parseInt(secondString);
            isValidNum = true;
        } catch (NumberFormatException e) {
            isValidNum = false;
        }
        
        // if inputs are null/empty/invalid tell the user the input is invalid
        if (firstString == null || firstString.equals("") || secondString == null || secondString.equals("") || !isValidNum) {
            request.setAttribute("message", "Result: Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        // if statements to do operations based on user input
        if (addButton != null) {
            result = first + second;
        } else if (subButton != null) {
            result = first - second;
        } else if (multButton != null) {
            result = first * second;
        } else if (modButton != null) {
            // check for divide by 0
            if (second == 0) {
                request.setAttribute("message", "Result: Invalid (Divide by 0)");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
            result = first % second;
        }
        
        // display result of user input and selection
        request.setAttribute("message", "Result: " + result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

        

    }

}
