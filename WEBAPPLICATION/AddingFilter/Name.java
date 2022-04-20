package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/register")
public class Name extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		String name=req.getParameter("name");
		
		PrintWriter out=res.getWriter();
		
		out.println("Name-->"+name);
	}
}
