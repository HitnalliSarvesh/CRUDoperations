package com.xworkz.football.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/call.dosa")    //call.dosa is a resource name.
public class FirstServlet extends HttpServlet{
	public FirstServlet() {
		System.out.println("Created first servlet...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doGet in FirstServlet");
	}


}
