package org.test.automation.utils;


/**
 * 
 * @author Srinivas Goud Nakka
 *
 */
public class UserData {
	
	private String userName;
	private String password;

	public UserData(String userName, String password) {

		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
