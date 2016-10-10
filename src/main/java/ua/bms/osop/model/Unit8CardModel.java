package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of Unit 6 Card
 */
public class Unit8CardModel {
	
	private String registrationNumber;
	private String requestNumber;
	private String receiptDate;
	private String summary;
	
	private String someNewText;
	
	/*Constructor of Unit 8 Model Object*/
	public Unit8CardModel(String receiptDate, String summary) {
		this.registrationNumber = null;
		this.requestNumber = createRequestNumber();
		
		this.receiptDate = receiptDate;
		this.summary = summary;
		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Request*/
	private String createRequestNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(999999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt U8!cdeswcvdaewv@##$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	
	/*---Get Methods---*/
	
	public String getRequestNumber() {
		return requestNumber;
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
