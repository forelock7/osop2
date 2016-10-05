package ua.bms.osop.model;

import java.util.Random;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - List of Response Documents(Перелік документів реагування);
 * Implements model of Unit 5 Response Document Card
 */
public class Unit5DocumentCardModel {
	
	private String documentContent;
	
	private String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	private String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	private String regNumberRestoredCard;
	
	/*Constructor of Response Document Unit 5 Model Object*/
	public Unit5DocumentCardModel() {
		this.documentContent = createDocumentContent();
				
		this.someNewText = creatNewText();
	}
	
	/*Generation of random Document Content*/
	private String createDocumentContent() {
		Random rnd = new Random();
		return "Response Document Content" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "SomeNEWteXtU5Document" + Integer.toString(rnd.nextInt(99999));
	}
	
	
	/*---Get Methods---*/
	
	public String getDocumentContent() {
		return documentContent;
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
