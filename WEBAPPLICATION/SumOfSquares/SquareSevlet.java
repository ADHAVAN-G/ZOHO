package com.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class SquareSevlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int z=(int)req.getAttribute("z");
		PrintWriter out=res.getWriter();
		int result=z*z;
		out.println("Square--->"+result);
	}
}
