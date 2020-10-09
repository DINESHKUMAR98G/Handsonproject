package com.myhcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StageShow")
public class StageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("<h1>New Year Eve</h1>");
		pw.println("<table id=\"StageShow\" border=\"1\">");
		pw.println("<tr>");
		pw.println("<th>Name</th>");
		pw.println("<th>New Year Eve</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Hall Name</td>");
		pw.println("<td>PVR Lulu Mall</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Date</td>");
		pw.println("<td>10-10-2020</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Start Time</td>");
		pw.println("<td>10:00:00</td>");
		pw.println("</tr>");
		pw.println("<td>End Time</td>");
		pw.println("<td>12:00:00</td>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();

	}

	


}
