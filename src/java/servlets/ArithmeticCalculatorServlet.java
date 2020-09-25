/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 758688
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/ArithmeticCalculatorServlet"})
public class ArithmeticCalculatorServlet extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("answer", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        
        String typeCalc = request.getParameter("operator");
        String answer = "---";
        
        if(first == null || second == null || first.equals("") || second.equals("")){
            answer = "invalid";
        } else {
                int firstInt = Integer.parseInt(first);
                int secondInt = Integer.parseInt(second);
                switch(typeCalc){
                    case "+":
                        answer = String.valueOf(firstInt + secondInt);
                        break;
                    case "-":
                        answer = String.valueOf(firstInt - secondInt);
                        break;
                    case "*":
                        answer = String.valueOf(firstInt * secondInt);
                        break;
                    case "%":
                        answer = String.valueOf(firstInt % secondInt);
                        break;
                }
            }
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        request.setAttribute("answer", answer);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
  
}
