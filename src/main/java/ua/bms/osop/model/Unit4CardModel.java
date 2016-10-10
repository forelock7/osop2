package ua.bms.osop.model;

import java.util.Random;

/*
 * "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 * Implements model of Unit 4 Card
 */
public class Unit4CardModel {

	private String registrationNumber;
	private String claimNumber;
	private String receiptDate;
	private String summary;
	
	private String someNewText;
	
	/*Constructor of Unit 4 Model Object*/
	public Unit4CardModel(String receiptDate, String summary) {
		this.registrationNumber = null;
		this.claimNumber = createClaimNumber();
		
		this.receiptDate = receiptDate;
		this.summary = summary;
		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Claim*/
	private String createClaimNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(999999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt U4!@##dddghfhds$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getClaimNumber() {
		return claimNumber;
	}
	
	public String getReceiptDate() {
		return receiptDate;
	}
	
	public String getSummary() {
		return summary;
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
