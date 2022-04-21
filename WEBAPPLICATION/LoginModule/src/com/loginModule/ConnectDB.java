package com.loginModule;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/Store")
public class ConnectDB extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i=0;
		PrintWriter out=response.getWriter();
		
		try {
			String query="insert into loginAccount(name,email,password) values(?,?,?)";
			Connection con=JDBC.initialize();
			PreparedStatement preparedStatement = con.prepareStatement(query);
		      preparedStatement.setString(1,request.getParameter("name"));
		      preparedStatement.setString(2,request.getParameter("email"));
		      preparedStatement.setString(3,request.getParameter("password"));
		      
		      i = preparedStatement.executeUpdate();
		      if(i!=0) {
					String html="<html><h3>Account created successfully</h3><br>"
							+ "<form action=\"login.jsp\"><input type=\"submit\" value=\"login\"></form></html>";
					out.println(html);
				}
				else {
					out.println("Error!!!");
				}
		} catch (Exception e) {
			out.println(e);
		}
	  
	}
}
