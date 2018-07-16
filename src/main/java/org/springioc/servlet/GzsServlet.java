package org.springioc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GzsServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		 System.out.println(1);
	}
	
	public void doHead(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
	    System.out.println(2);
	 }
	 
	 
}
