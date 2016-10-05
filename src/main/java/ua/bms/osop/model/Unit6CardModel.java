package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of Unit 6 Card
 */
public class Unit6CardModel {
	
	private String claimNumber;
	private String applicantName;
	private String summary;
	private String receivingProsecutorDate;
	
	private String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	private String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	private String regNumberRestoredCard;
		
	/*Constructor of Unit 6 Model Object*/
	public Unit6CardModel(String applicantName, String summary, String receivingProsecutorDate) {
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
