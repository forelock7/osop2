package ua.bms.osop.model;

import java.util.Random;

/*
 * "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 * Implements model of Unit 4 Card
 */
public class Unit4CardModel {

	private String claimNumber;
	private String receiptDate;
	private String summary;
	
	private String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	private String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	private String regNumberRestoredCard;
	
	/*Constructor of Unit 4 Model Object*/
	public Unit4CardModel(String receiptDate, String summary) {
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
	
	public String getRegNumberRemovedCard() {
		return regNumberRemovedCard;
	}
	
	public String getRegNumberRestoredCard() {
		return regNumberRestoredCard;
	}
	
	/*---Set Methods---*/
	
	public void setRegNumberRemovedCard (String regNumberRemovedCard) {
		this.regNumberRemovedCard = regNumberRemovedCard;
	}
	
	public void setRegNumberRestoredCard (String regNumberRestoredCard) {
		this.regNumberRestoredCard = regNumberRestoredCard;
	}
	
	
}
