package com.loginModule;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.sql.*;

@WebFilter("/login")
public class LoginFilter implements Filter {
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }
	public void destroy() {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		String name=req.getParameter("username");
		String pword=req.getParameter("password");
		try {
			Connection con=JDBC.initialize();
			Statement st=con.createStatement();
			String query="select * from loginAccount";
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				if(rs.getString(2).equals(name) && rs.getString(3).equals(pword))
					chain.doFilter(request,response);
			}
			res.sendRedirect("login.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
