package com.example.demo;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.servlet.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebsiteApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<Servlet> loginBean() {
		return new ServletRegistrationBean(new LoginServlet(), "/auth"); // add your servlet details here , example :
																			// login sevlet and url pattern
	}
/*
	@Bean
	public ServletRegistrationBean<Servlet> regBean() {
		return new ServletRegistrationBean(new RegServlet(), "/reg"); // add your servlet details here , example :
																			// login sevlet and url pattern
	}
*/	
	@Bean
	public ServletRegistrationBean<Servlet> cartBean() {
		System.out.println("In the cart bean");
		return new ServletRegistrationBean(new CartServlet(), "/cart"); // add your servlet details here , example :
																			// login sevlet and url pattern
	}
	
	@Bean
	public ServletRegistrationBean<Servlet> checkoutBean() {
		System.out.println("In the checkout bean");
		return new ServletRegistrationBean(new CheckOutServlet(), "/checkout"); // add your servlet details here , example :
																			// login sevlet and url pattern
	}
	@Bean
	public FilterRegistrationBean<Filter> loggingFilter() {
		FilterRegistrationBean<Filter> loginBean = new FilterRegistrationBean<>();
		loginBean.setFilter(new LoginFilter()); // add your filter class here
		loginBean.addUrlPatterns("/*"); // add the filter for url pattern here
		return loginBean;
	}
}
