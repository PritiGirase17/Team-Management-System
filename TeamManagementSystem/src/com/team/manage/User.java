package com.team.manage;

public class User 
{
	private int userId;
	
	private String userName;
	
	private String userPhone;
	
	private String userAddress;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public User(int userId, String userName, String userPhone, String userAddress) 
	{
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
	}

	public User(String userName, String userPhone, String userAddress) {
		super();
		this.userName = userName;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
	}

	public User() 
	{
		super();
		
	}

	@Override
	public String toString() 
	{
		return "User [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + ", userAddress="
				+ userAddress + "]";
	}

	
	
	
}
