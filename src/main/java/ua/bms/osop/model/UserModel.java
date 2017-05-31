package ua.bms.osop.model;

/*
 * Implements model of User
 */
public class UserModel {
	
	private String login;
	private String password;
	private String lastName;
	private String firstName;
	private String middleName;
	private String prosecutionOffice;
	private String subdivision;
	private String post;
	private String role;
	private String email;
	private String profileCreatingDate;


	/*Constructor of User Model Object*/
	public UserModel(String login, String password, String lastName, String firstName, String middleName, String email) {
		this.login = login;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.email = email;
		System.out.println(" instance - 6");
	}

	/*Constructor of User Model Object*/
	public UserModel(String login, String password) {
		this.login = login;
		this.password = password;
		System.out.println(" instance - 2");

	}
	
	/*---Get Methods---*/
	
	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getEmail() {
		return email;
	}

	/*---Set Methods---*/

	public void setprofileCreatingDate (String profileCreatingDate) {
		this.profileCreatingDate = profileCreatingDate;
	}

}

