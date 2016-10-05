package ua.bms.osop.model;

/*
 * Implements model of User
 */
public class UserModel {
	
	private String login;
	private String password;
	
	/*Constructor of User Model Object*/
	public UserModel(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	/*---Get Methods---*/
	
	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}

}

