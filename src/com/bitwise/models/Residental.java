package com.bitwise.models;

public class Residental {
	private String permanentAddress;
	private String temporaryAddress;
	private int mobile;
	private int landline;

	
	
	public Residental(String permanentAddress, String temporaryAddress, int mobile, int landline) {
		super();
		this.permanentAddress = permanentAddress;
		this.temporaryAddress = temporaryAddress;
		this.mobile = mobile;
		this.landline = landline;
	}
	
	public Residental() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Residental [permanentAddress=" + permanentAddress + ", temporaryAddress=" + temporaryAddress
				+ ", mobile=" + mobile + ", landline=" + landline + "]";
	}



	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getTemporaryAddress() {
		return temporaryAddress;
	}
	public void setTemporaryAddress(String temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getLandline() {
		return landline;
	}
	public void setLandline(int landline) {
		this.landline = landline;
	}
	
}
