package com.bitwise.models;

import java.util.ArrayList;
import java.util.List;

public class Users {
	List<User> users=new ArrayList<>();
	


	@Override
	public String toString() {
		return "Users [users=" + users + "]";
	}
	public Users(){
		this.setUser();
	}
	public List<User> getUsers() {
		return users;
	}
	

	public void setUser(){
		users.add(new User("akanksha","miku"));
		users.add(new User("gaurav","gauri"));
		users.add(new User("varun","vslala"));
		users.add(new User("pooja","tweety"));
	}
}
