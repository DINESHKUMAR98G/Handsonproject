package com.myhcl.org;

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
		PrintWriter pw =response.getWriter();
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<body>");
		pw.println("<form action=\"./Display\" method='post'>");
		pw.println("NAME<input type=\"text\" name=\"name\"><br>");
		pw.println("CONTACT NO<input type=\"text\" name=\"contactnumber\"><br>");
		pw.println("EMAIL<input type=\"text\" name=\"email\"><br>");
		pw.println("CITY<input type=\"text\" name=\"city\"><br>");
		pw.println("<input type=\"submit\" value=\"Submit\">");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");


		

		
	}

}
