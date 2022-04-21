package com.loginModule;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/allocateSeat")
public class AllocateSeat extends HttpServlet {
	static int seat=25;
	final int amount=100;
	static int provide=1;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		int required=Integer.parseInt(request.getParameter("tickets"));
		if(required>seat) {
			//out.println("Available tickets="+seat);
			String html="<html><h2> Available tickets="+seat+"</h2>"
					+"<form action=\"Booking.jsp\">"
					+ "<input type=\"submit\" value=\"Go to booking\">"
					+ "</form>"
					+ "</html>";
			out.println(html);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("Receipt.jsp");
			ArrayList<Integer>seats=new ArrayList();
			for(int i=provide;i<provide+required;i++) {
				seats.add(i);
			}
			provide+=required;
			seat-=required;
			int total=required*amount;
			request.setAttribute("name",request.getParameter("name"));
			request.setAttribute("mobilenumber",request.getParameter("mobilenumber"));
			request.setAttribute("totalAmount",String.valueOf(total));
			request.setAttribute("seats",seats.toString());
			rd.forward(request, response);
		}
	}
}
