package com.myhcl;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("<h1>Welcome To Popular Paradise</h1>");
		pw.println("<p>The types of event are</p>");
		pw.println("<a href='./Exhibition'>Exhibition</a><br>");
		pw.println("<a href='./StageShow'>StageShow</a>");
		pw.println("</body>");
		pw.println("</html>");
		pw.close();




		
	}

}
