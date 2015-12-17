package com.redhat.celepar;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/")
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	static String PAGE_HEADER = "<html><head><title>helloworld</title></head><body>";

    static String PAGE_FOOTER = "</body></html>";


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println(PAGE_HEADER);
		writer.println("<h1>Hello World Servlet</h1>");
		writer.println("<h2> Hostname: " + InetAddress.getLocalHost().getHostName()+ "</h2>");
		writer.println("<h2> IP: " + InetAddress.getLocalHost()+ "</h2>");
		writer.println(PAGE_FOOTER);
		writer.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
