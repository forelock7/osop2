package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of 5 - "Other Criminal Case"("Інші питання кримінальної справи") Card(Unit 3)
 */
public class Unit3OtherCriminalCaseCardModel {

	private String caseNumber;
	private String registrationDate;
	private String shortStory;
	
	private String sentToCourtDate;
	
	private String someNewText;
	
	/*Constructor of Model Object*/
	public Unit3OtherCriminalCaseCardModel(String registrationDate, String shortStory, String sentToCourtDate) {
		this.caseNumber = createCaseNumber();
		
		this.registrationDate = registrationDate;
		this.shortStory = shortStory;
		
		this.sentToCourtDate = sentToCourtDate;
		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Claim*/
	private String createCaseNumber() {
		Random rnd = new Random();
		return "Справа/Провадження" + Integer.toString(rnd.nextInt(99999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXtіцваі Розділ333dddghfhds$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getCaseNumber() {
		return caseNumber;
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
