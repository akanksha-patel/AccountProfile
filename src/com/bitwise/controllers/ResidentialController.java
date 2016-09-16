package com.bitwise.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.models.Educational;
import com.bitwise.models.Residental;

@WebServlet("/ResidentialController")
public class ResidentialController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ResidentialController() {
		super();

	}

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String submit = request.getParameter("submit");
		HttpSession session = request.getSession();
		if(submit.equals("next")){
		
			String pAddress = request.getParameter("paddr");
			String tAddress = request.getParameter("taddr");
			Integer mobile = Integer.parseInt(request.getParameter("mobile"));
			Integer landline = Integer.parseInt(request.getParameter("landline"));
		
			System.out.println(pAddress + " " + tAddress + " " + mobile + " " + landline);

			createProfile(session, pAddress, tAddress, mobile, landline);
			response.sendRedirect("details.jsp");
		
	}else{
		response.sendRedirect("residental.jsp");
	}
		
		
	}
	
	private int createProfile(HttpSession session, String permanentAddress, String temporaryAddress, Integer mobile,Integer landline) {
		if (session != null && session.getAttribute("residental") != null) {
			Residental residental = (Residental) session.getAttribute("residental");
			residental.setLandline(landline);
			residental.setMobile(mobile);
			residental.setPermanentAddress(permanentAddress);
			residental.setTemporaryAddress(temporaryAddress);
			System.out.println(residental.getLandline());
			session.setAttribute("residental", residental);
			return 5;
			
		} else {
			Residental residental = new Residental(permanentAddress, temporaryAddress, mobile, landline);
			session.setAttribute("residental", residental);
			System.out.println(session.getAttribute("residental"));
			return 8;
		}
	}
	

}
