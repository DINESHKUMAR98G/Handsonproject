package com.myhcl.org1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String EventName=request.getParameter("eventname");
		String HallName=request.getParameter("hallname");
		String EventType=request.getParameter("eventType");
		String Details=request.getParameter("details");
		String StartDate=request.getParameter("startdate");
		String EndDate=request.getParameter("enddate");
		if(EventName==""||HallName==""||EventType==""||Details==""||StartDate==""||EndDate=="") {
			 RequestDispatcher rd = request.getRequestDispatcher("./Index");
			pw.println("<h1>Event Creating</h1>");
			
		
		if(EventName=="") {
			pw.println("Event name must not be Empty<br>");
		}
		if(HallName=="") {
			pw.println("Hall name must not be Empty<br>");
		}
		if(EventType=="") {
			pw.println("Event type must not be Empty<br>");
		}
		if(Details=="") {
			pw.println("Details  must not be Empty<br>");
		}
		if(StartDate=="") {
			pw.println("StartDate must not be Empty<br>");
		}
		if(EndDate=="") {
			pw.println("endDate must not be Empty<br>");
		}
		rd.include(request,response);
		
	}else {
		pw.println("<h1>Event created successfully</h1>");
		pw.println("<h2>Event Detailsy</h2>");
		pw.println("<table border='1'>");
		pw.println("<tr>");
		pw.println("<th>EventName</th>");
		pw.println("<th>HallName</th>");
		pw.println("<th>EventType</th>");
		pw.println("<th>Details</th>");
		pw.println("<th>StartDate</th>");
		pw.println("<th>EndDate</th>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>"+EventName+"</td>");
		pw.println("<td>"+HallName+"</td>");
		pw.println("<td>"+EventType+"</td>");
		pw.println("<td>"+Details+"</td>");
		pw.println("<td>"+StartDate+"</td>");
		pw.println("<td>"+EndDate+"</td>");
		pw.println("</tr>");
		pw.println("</table>");

		pw.close();




		

		

		


		
	}

}
}
