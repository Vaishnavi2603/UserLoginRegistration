package com.fujitsu.LoginAndRegistration.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fujitsu.LoginAndRegistration.DAO.LoginAndRegistrationDao;
import com.fujitsu.LoginAndRegistration.model.User;


@WebServlet("/UserRegistration")
public class UserRegistration extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String UserName = request.getParameter("UserName");
		String Password = request.getParameter("Password");
		int Phone = Integer.parseInt(request.getParameter("Phone"));
		String Address = request.getParameter("Address");
		
		//Generating User ID
		Random random = new Random();
		int userId = random.nextInt(999);
		
		User newUser = new User(userId, UserName, Password, Phone, Address);
		//System.out.println("New User : "+ newUser);
		
		//Save user in Database
		LoginAndRegistrationDao dao = new LoginAndRegistrationDao();
		
		boolean result = dao.registrationUser(newUser);
		
		if(result) {
			System.out.println("User Registration Successful!");
			response.sendRedirect("Welcome.jsp");
		}
		
		else {
			System.err.println("Internal Server Error");
			response.sendRedirect("error.jsp");
					
		}
	}

}
