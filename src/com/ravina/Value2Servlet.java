package com.ravina;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Value2Servlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
//	    int a=Integer.parseInt(req.getParameter("a"));
		int a= (int) req.getAttribute("a");
PrintWriter out=res.getWriter();
out.println("calling servlet from servlet through request Dispatcher");
out.println("value of a is:"+a);
	}

}
