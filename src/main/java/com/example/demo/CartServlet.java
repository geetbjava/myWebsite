package com.example.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartServlet extends HttpServlet {
	 
	 // doget, dopost, init, service
	
		  
	 public void doGet(HttpServletRequest req, HttpServletResponse res) {
	  try {
		  System.out.println("customer passed product name: " + req.getParameter("pname"));
		  System.out.println("customer passed quanity: " + req.getParameter("qty"));
		  System.out.println("customer passed price: " + req.getParameter("price"));
		  String productname = req.getParameter("pname"); // store the value of request input
		  String quantity = req.getParameter("qty"); 
		  String price = req.getParameter("price"); 
		  
		// calculating total 
		  
		  int quanInt=Integer.parseInt(quantity); // converting string Quanity to int  (reading the request sent by customer)
		  int priceInt=Integer.parseInt(price); // converting string price to int 
		  int itemTotal= quanInt * priceInt; 
		  
		  HttpSession cookie=req.getSession();
		  if(cookie.getAttribute("total") == null) {
			 cookie.setAttribute("total", itemTotal);
		  } else {
			  int previousTotal = (int) cookie.getAttribute("total");
			  itemTotal = itemTotal + previousTotal;
			  System.out.println(itemTotal);
			  cookie.setAttribute("total", itemTotal);
		  }
		     
	  } catch (Exception e) {
		  e.printStackTrace();
	  }
	 }

	 public void doPost(HttpServletRequest req, HttpServletResponse res) {
		 doGet(req, res);
	 }
	}
