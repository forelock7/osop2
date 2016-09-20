package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of Unit 6 Card
 */
public class Unit8Card {
	
	public String requestNumber;
	public String receiptDate;
	public String summary;
	
	public String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	public String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	public String regNumberRestoredCard;
	
	/*Constructor of Unit 8 Model Object*/
	public Unit8Card(String receiptDate, String summary) {
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
	
}
