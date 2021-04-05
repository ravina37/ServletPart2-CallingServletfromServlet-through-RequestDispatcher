package com.ravina;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Value2Servlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int a = Integer.parseInt(req.getParameter("a"));

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Result:</h1>");
		out.println("value of a:" + a);

		System.out.println("Send redirect method worked!");
		System.out.println(" worked!");
	}

}
