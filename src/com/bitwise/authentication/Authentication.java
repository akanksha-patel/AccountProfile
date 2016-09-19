package com.bitwise.authentication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Authentication {

	public static boolean validateEmail(String email) {
		String emailPattern = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p = Pattern.compile(emailPattern);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public static boolean validateMobile(String mobile) {
		return mobile.matches("^[789]\\d{9}$");
	}

	public static boolean validateString(String str) {
		return str.matches("[a-zA-Z]");
	}

	public static boolean validatePassword(String password) {
		return password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})");
	}

	public static boolean validatePercentage(String percentage) {
		return percentage.matches("\\d+(?:\\.\\d+)?%");
	}

	public static boolean validateValue(String value) {
		if (value.trim().equals("")) {
			return false;
		}
		return true;

	}

}
