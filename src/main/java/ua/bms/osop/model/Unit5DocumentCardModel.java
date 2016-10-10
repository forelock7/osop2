package ua.bms.osop.model;

import java.util.Random;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 2 - List of Response Documents(Перелік документів реагування);
 * Implements model of Unit 5 Response Document Card
 */
public class Unit5DocumentCardModel {
	
	private String registrationNumber;
	private String documentContent;
	
	private String someNewText;
	
	/*Constructor of Response Document Unit 5 Model Object*/
	public Unit5DocumentCardModel() {
		this.registrationNumber = null;
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
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	/*---Set Methods---*/
	
	public void setRegistrationNumber (String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}
