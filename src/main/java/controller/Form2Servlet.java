package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Form2Servlet
 */
@WebServlet("/Form2Servlet")
public class Form2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get form data
        String data = request.getParameter("data");

        // Process data
        DataProcessor dataProcessor = new DataProcessor();
        String processedData = dataProcessor.processLowercase(data);

        // Forward to result2.jsp with processed data
        request.setAttribute("processedData", processedData);
        request.getRequestDispatcher("result2.jsp").forward(request, response);
    }
}
