package com.xworkz.football.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/message")
public class MessageServlet extends HttpServlet{

	
	public MessageServlet() {
		System.out.println("calling message servlet...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doGet in message servlet");
		String name= req.getParameter("name");
		String msg = req.getParameter("msg");
		System.out.println("Name:"+name);
		System.out.println("Message is:"+ msg);
	}
}
