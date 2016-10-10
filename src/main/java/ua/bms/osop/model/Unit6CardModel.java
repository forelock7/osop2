package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of Unit 6 Card
 */
public class Unit6CardModel {
	
	private String registrationNumber;
	private String claimNumber;
	private String applicantName;
	private String summary;
	private String receivingProsecutorDate;
	
	private String someNewText;
		
	/*Constructor of Unit 6 Model Object*/
	public Unit6CardModel(String applicantName, String summary, String receivingProsecutorDate) {
		this.registrationNumber = null;
		this.claimNumber = createClaimNumber();
		
		this.applicantName = applicantName;
		this.summary = summary;
		this.receivingProsecutorDate = receivingProsecutorDate;
		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Claim*/
	private String createClaimNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(99999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt U6!@##$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getClaimNumber() {
		return claimNumber;
	}
	
	public String getApplicantName() {
		return applicantName;
	}
	
	public String getSummary() {
		return summary;
	}

	public String getReceivingProsecutorDate() {
		return receivingProsecutorDate;
	}
	
	public String getSomeNewText() {
		return someNewText;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	/*---Set Methods---*/
	
	public void setRegistrationNumber (String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}
