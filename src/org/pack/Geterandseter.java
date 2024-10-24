package org.pack;

public class Geterandseter {
	private String accountUserName;
	private String password;
	private int balance;
	
	public int getbalance() {
		return balance;
	}
	 
	public void setaccoutUserName(String user,String pass) {
		
		this.accountUserName=user;
		this.password=pass;
	if(accountUserName.equals("Suhitha") && password.equals("suhi@123"))
	   this.balance=5000;
	else if(accountUserName.equals("Aaadhan") && password.equals("Aadha@5"))
		this.balance=10000;
	else
		System.out.println("invalid password");
	
		
	}	
		}
	





