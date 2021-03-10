package com.fujitsu.LoginAndRegistration.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fujitsu.LoginAndRegistration.DAO.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Start of doPost");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		LoginDao dao = new LoginDao();
		boolean result = dao.verifyUserCredentials(userName,password);
		
		if(result) {
			System.out.println("Executing if Block"+result);
			HttpSession session =request.getSession();
			session.setAttribute("user", userName);
			response.sendRedirect("Welcome.jsp");
			System.out.println("Redirect the response to welcome page"+result);
		}
		
		else {
			
			System.out.println("User not registered");
			response.sendRedirect("UserRegistration.jsp");
			//response.sendRedirect("Login.jsp");
			//System.out.println("Else Block");
			
		}
		
		System.out.println("End of doPost");
		
	}

}