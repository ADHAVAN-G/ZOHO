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
		
				if(name.equals("adhavan") && pword.equals("adhav1405"))
					chain.doFilter(request, response);			
				else
					res.sendRedirect("login.jsp");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
