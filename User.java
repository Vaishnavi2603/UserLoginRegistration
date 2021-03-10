package com.fujitsu.LoginAndRegistration.model;

public class User {
	
	int id;
	String UserName;
	String Password;
	int Phone;
	String Address;
	
	public User(int id, String userName, String password, int phone, String address) {
		super();
		this.id = id;
		UserName = userName;
		Password = password;
		Phone = phone;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", UserName=" + UserName + ", Password=" + Password + ", Phone=" + Phone
				+ ", Address=" + Address + "]";
	}
	
}
