package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of Unit 6 Card
 */
public class Unit6CardModel {
	
	public String claimNumber;
	public String applicantName;
	public String summary;
	public String receivingProsecutorDate;
	
	public String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	public String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	public String regNumberRestoredCard;
		
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

}
