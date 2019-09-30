package com.zensar.models;

public class LoginBean {
	
	private String username,password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean ValidateUser() {
		
		if(username!=null&&password!=null&&username.equals("ak")&&password.equals("ghanta"))
			{return(true);}
		else 
			{return(false);}
	}//busness logic
}
