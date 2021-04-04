package com.ravina;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValueServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
	int a=Integer.parseInt(req.getParameter("a"));
	req.setAttribute("a", a);
		
		RequestDispatcher rd=req.getRequestDispatcher("/value2");
		rd.forward(req, res);
//PrintWriter out=res.getWriter();
//out.println("Value of a is:"+a);
	}

}
