package com.mycl.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Index")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String Name=request.getParameter("name");
		String ContactNumber=request.getParameter("contactnumber");
		String Email=request.getParameter("email");
		String City=request.getParameter("city");
		pw.println("<h1>the user details are</h1>");
		pw.println("<table border='1'>");
		pw.println("<tr>");
		pw.println("<th>Name</th>");
		pw.println("<th>ContactNumber</th>");
		pw.println("<th>Email</th>");
		pw.println("<th>City</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>"+Name+"</td>");
		pw.println("<td>"+ContactNumber+"</td>");
		pw.println("<td>"+Email+"</td>");
		pw.println("<td>"+City+"</td>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.close();


		


		


		
		
	}

}
