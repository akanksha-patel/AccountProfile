package com.bitwise.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.models.User;
import com.bitwise.models.Users;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    
    public LoginController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User(username,password);
		Users users = new Users();
		if (users.getUsers().contains(user)) {
			
			session.setAttribute("user", user);
			session.setAttribute("sessID", session.getId());
			session.setMaxInactiveInterval(1000);  
			Cookie cookie = new Cookie("sessID", session.getId());
			response.addCookie(cookie);
			response.sendRedirect("ProfileController");
		} else {
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			pw.write("Invalid Credentials!");
			request.getRequestDispatcher("login.jsp").include(request, response);
			
		}
	}

	

}
