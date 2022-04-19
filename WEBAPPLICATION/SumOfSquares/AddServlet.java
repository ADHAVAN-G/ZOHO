package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
		int x=Integer.parseInt(req.getParameter("num1"));
		int y=Integer.parseInt(req.getParameter("num2"));
		
		int z=x+y;
		req.setAttribute("z",z);
		
		RequestDispatcher dis=req.getRequestDispatcher("squ");
		dis.forward(req, res);
		//PrintWriter out=res.getWriter();
		//out.println("result-->"+z);
	}
}
