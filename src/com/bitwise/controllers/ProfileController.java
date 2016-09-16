package com.bitwise.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.models.Profile;


@WebServlet("/ProfileController")
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ProfileController() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("profile.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		String submit = request.getParameter("submit");
		
		if(submit.equals("next") || submit.equals("save")){
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			String hobbies = request.getParameter("hobbies");
			
			createProfile(session, name, email, gender, hobbies);
			response.sendRedirect("educational.jsp");
			
		}else{
			response.sendRedirect("educational.jsp");
			return;
		}
			}

	private void createProfile(HttpSession session, String name, String email, String gender, String hobbies) {
		if (session != null && session.getAttribute("profile") != null) {
				Profile profile = (Profile) session.getAttribute("profile");
				profile.setEmail(email);
				profile.setGender(gender);
				profile.setHobbies(hobbies);
				profile.setName(name);
				session.setAttribute("profile", profile);
		
		} else {
			Profile profile = new Profile(name, email, gender, hobbies);
			session.setAttribute("profile", profile);
		}
	}

}
