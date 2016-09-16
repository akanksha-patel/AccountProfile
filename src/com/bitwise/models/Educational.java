package com.bitwise.models;

public class Educational {
	private int tenth;
	private int twelth;
	private int cgpa;
	private String favouriteSubject;
	
	
	
	@Override
	public String toString() {
		return "Educational [tenth=" + tenth + ", twelth=" + twelth + ", cgpa=" + cgpa + ", favouriteSubject="
				+ favouriteSubject + "]";
	}
	public Educational(int tenth, int twelth, int cgpa, String favouriteSubject) {
		super();
		this.tenth = tenth;
		this.twelth = twelth;
		this.cgpa = cgpa;
		this.favouriteSubject = favouriteSubject;
	}
	
	public Educational() {
	}
	
	public int getTenth() {
		return tenth;
	}
	public void setTenth(int tenth) {
		this.tenth = tenth;
	}
	public int getTwelth() {
		return twelth;
	}
	public void setTwelth(int twelth) {
		this.twelth = twelth;
	}
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	public String getFavouriteSubject() {
		return favouriteSubject;
	}
	public void setFavouriteSubject(String favouriteSubject) {
		this.favouriteSubject = favouriteSubject;
	}
	
	

}
