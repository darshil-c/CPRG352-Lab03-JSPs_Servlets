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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // display the page when a get request is issued
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // get age as a String from the form
        String ageString = request.getParameter("age");
        
        // variables to check for validation
        int age = 0;
        boolean isValidNum;
        
        // set the input to age entered
        request.setAttribute("age", ageString);
        
        // check if input is a valid int using try catch
        try {
            age = Integer.parseInt(ageString);
            isValidNum = true;
            age += 1;
        } catch (NumberFormatException e) {
            isValidNum = false;
        }
        
        // if the input is left empty ask the user to enter current age
        if (ageString == null || ageString.equals("")) {
            request.setAttribute("message", "Your must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        } 
        // check if user entered a valid number
        else if (!isValidNum) {
            request.setAttribute("message", "You must enter a number.");
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        } 
        // display users age next birthday
        else {
            request.setAttribute("message", "Your age next birthday will be " + age);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);

        }  
                
    }

}
