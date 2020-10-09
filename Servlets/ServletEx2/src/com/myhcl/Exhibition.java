package com.myhcl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Exhibition")
public class Exhibition extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("<h1>Text Fair 2018 Expo</h1>");
		pw.println("<table id=\"exhibition\"border=\"1\">");
		pw.println("<tr>");
		pw.println("<th>Name</th>");
		pw.println("<th>TextFair 2017 Expo</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Hall Name</td>");
		pw.println("<td>PVR SuperPlex</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Start Date</td>");
		pw.println("<td>10-10-2020</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>End Date</td>");
		pw.println("<td>10-10-2030</td>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();



	}

}
