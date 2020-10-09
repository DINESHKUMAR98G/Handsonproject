package com.mycl.org1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Index")
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public Index() {
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<form action=\"./Validate\" method=\"get\">");
		pw.println("Event name:<input type=\"text\" name=\"eventname\"><br>");
		pw.println("Hall Name:<input type=\"text\" name=\"hallname\"><br>");
		pw.println("EventType:<input type=\"radio\" value =\"Exhibition\" name=\"eventType\">Exhibition<br>");
		pw.println("<input type=\"radio\"  value=\"StageShow\" name=\"eventType\">StageShow<br>");
		pw.println("Details:<input type=\"text\" name=\"details\"><br>");
		pw.println("Owner:<input type=\"text\" name=\"owner\"><br>");
		pw.println("Start Date:<input type=\"text\" name=\"startdate\"><br>");
		pw.println("End Date:<input type=\"text\" name=\"enddate\"><br>");
		pw.println("<input type=\"submit\" value=\"Create\"><br>");
		pw.println("</form");
		pw.println("</body>");
		pw.println("</html>");







	}

}
