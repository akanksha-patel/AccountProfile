package com.bitwise.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResidentalController
 */
@WebServlet("/ResidentalController")
public class ResidentalController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ResidentalController() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String submit = request.getParameter("submit");
		
		if(submit.equals("save")){
		
		String tenth = request.getParameter("tenth");
		String twelth = request.getParameter("twelth");
		String cgpa = request.getParameter("cgpa");
		String subject = request.getParameter("subject");
		
	}else{
		
		response.sendRedirect("residental.jsp");
	}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
