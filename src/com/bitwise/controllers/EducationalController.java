package com.bitwise.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.models.Educational;
import com.bitwise.models.Profile;


@WebServlet("/EducationalController")
public class EducationalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public EducationalController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String submit = request.getParameter("submit");
		HttpSession session = request.getSession();
		if(submit.equals("next")){
		
		Integer tenth = Integer.parseInt(request.getParameter("tenth"));
		Integer twelth = Integer.parseInt(request.getParameter("twelth"));
		Integer cgpa = Integer.parseInt(request.getParameter("cgpa"));
		String subject = request.getParameter("subject");
		
		System.out.println(tenth+" "+twelth+" "+cgpa+""+subject);
		
		createProfile(session, tenth, twelth, cgpa, subject);
		response.sendRedirect("residental.jsp");
		
	}else{
		
		response.sendRedirect("residental.jsp");
	}
		
		
	}
	
	private void createProfile(HttpSession session, int tenth, int twelth, int cgpa, String subject) {
		if (session != null && session.getAttribute("educational") != null) {
				Educational educational = (Educational) session.getAttribute("educational");
				educational.setTenth(tenth);
				educational.setTwelth(twelth);
				educational.setCgpa(cgpa);
				educational.setFavouriteSubject(subject);
				session.setAttribute("profile", educational);
			
		} else {
			Educational educational = new Educational(tenth, twelth, cgpa, subject);
			session.setAttribute("educational", educational);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
