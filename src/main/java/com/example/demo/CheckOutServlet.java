package com.example.demo;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckOutServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		  try {
			  res.sendRedirect("checkout.jsp");
			  
		  } catch (Exception e) {
			  e.printStackTrace();
		  }
		 }

		 public void doPost(HttpServletRequest req, HttpServletResponse res) {
			  try {
				  res.sendRedirect("checkout.jsp");
				  
			  } catch (Exception e) {
				  e.printStackTrace();
		 }
}}

