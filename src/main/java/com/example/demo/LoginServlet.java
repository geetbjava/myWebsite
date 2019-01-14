package com.example.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	 
	 // doget, dopost, init, service
	 public void doGet(HttpServletRequest req, HttpServletResponse res) {
		  try {
			  System.out.println("customer passed userid: " + req.getParameter("uid"));
			  System.out.println("customer passed password: " + req.getParameter("pwd"));
			  String userid = req.getParameter("uid"); //john
			  String password = req.getParameter("pwd"); //john
			  
			  if (userid.equals("java") && password.equals("jee")) {
				  req.getSession().setAttribute("isLoggedin", true);
				  res.sendRedirect("welcome.html");
				  
			  } else {
				  req.getSession().setAttribute("isLoggedin", false);
				  res.sendRedirect("error.html");
			  }
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		 
		 }

		 public void doPost(HttpServletRequest req, HttpServletResponse res) {
			 	doGet(req, res);
		 }
		}

		  
	/* public void doGet(HttpServletRequest req, HttpServletResponse res) {
	  System.out.println("Entering get method");
	  System.out.println("I am in servlet program - get method");
	  System.out.println("Exiting get method");
	 }

	 public void doPost(HttpServletRequest req, HttpServletResponse res) {
	  System.out.println("Entering post method");
	  System.out.println("I am in servlet program - post method");
	  System.out.println("Exiting post method");
	*/
