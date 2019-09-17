/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 778766
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String inputType = request.getParameter("calc");
        String numOne = request.getParameter("first");
        String numTwo = request.getParameter("second");
        int firstNum;
        int secondNum;
        request.setAttribute("first", numOne);
        request.setAttribute("second", numTwo);
        try 
        {
            firstNum = Integer.parseInt(numOne);
            secondNum = Integer.parseInt(numTwo);
            switch (inputType)
            {
                case "+":
                    request.setAttribute("result", firstNum + secondNum);
                    break;
                case "-":
                    request.setAttribute("result", firstNum - secondNum);
                    break;
                case "*":
                    request.setAttribute("result", firstNum * secondNum);
                    break;
                case "%":
                    request.setAttribute("result", firstNum % secondNum);
                    break;
            }
        } 
        catch (NumberFormatException nfe) 
        {
            request.setAttribute("result", "invalid");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

}
