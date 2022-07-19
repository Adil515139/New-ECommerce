package com.example.project.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@ServletComponentScan
@WebFilter(urlPatterns = {"/admin/*","/orders/*","/pagecontent/*","/product/*","/users/*"})
public class AuthenticationFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	
		
		HttpServletRequest hreq = (HttpServletRequest) request;
		HttpServletResponse hres = (HttpServletResponse) response;
		
		HttpSession hs = hreq.getSession();
	
		if(hs != null && hs.getAttribute("admin") != null) {
			
			chain.doFilter(request, response);
			
		} else {
			System.err.println("enter in else");
			RequestDispatcher rd = hreq.getServletContext().getRequestDispatcher("/login");
			rd.forward(hreq, hres);
	}

}
}