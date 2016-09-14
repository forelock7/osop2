package ua.bms.osop.model;

import java.util.Random;

/*
 * "International Judicial Cooperation" Page - Unit 4 ("Міжнародно-правове співробітництво")
 * Implements model of Unit 4 Card
 */
public class Unit4Card {

	public String claimNumber;
	public String receiptDate;
	public String summary;
	
	public String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	public String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	public String regNumberRestoredCard;
	
	/*Constructor of Unit 4 Model Object*/
	public Unit4Card(String receiptDate, String summary) {
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
	
	
}
