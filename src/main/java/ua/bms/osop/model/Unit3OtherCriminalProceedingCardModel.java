package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of 2 - "Other Criminal Proceedings"("Інші питання кримінального провадження") Card(Unit 3)
 */
public class Unit3OtherCriminalProceedingCardModel {
	
	private String proceedingCaseNumber;
	private String registrationDate;
	private String shortStory;
	
	private String sentToCourtDate;
	
	private String someNewText;
	
	/*Constructor of Model Object*/
	public Unit3OtherCriminalProceedingCardModel(String registrationDate, String shortStory, String sentToCourtDate) {
		this.proceedingCaseNumber = createProceedingCaseNumber();
		
		this.registrationDate = registrationDate;
		this.shortStory = shortStory;
		
		this.sentToCourtDate = sentToCourtDate;
		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Claim*/
	private String createProceedingCaseNumber() {
		Random rnd = new Random();
		return "Справа/Провадження" + Integer.toString(rnd.nextInt(99999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt Розділ333dddghfhds$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getProceedingCaseNumber() {
		return proceedingCaseNumber;
	}
	
	public String getRegistrationDate() {
		return registrationDate;
	}
	
	public String getSomeNewText() {
		return someNewText;
	}
	
	public String getShortStory() {
		return shortStory;
	}
	
	public String getSentToCourtDate() {
		return sentToCourtDate;
	}

}
