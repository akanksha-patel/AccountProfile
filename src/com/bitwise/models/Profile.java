package com.bitwise.models;

public class Profile {
	private String name;
	private String email;
	private String gender;
	private String hobbies;
	
	public Profile(){
		
	}
	
	
	public Profile(String name, String email, String gender, String hobbies) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.hobbies = hobbies;
	}
	@Override
	public String toString() {
		return "Profile [name=" + name + ", email=" + email + ", gender=" + gender + ", hobbies=" + hobbies + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobbies() {
		return hobbies;
	}
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
}
