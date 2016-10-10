package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of Unit 7 Card
 */
public class Unit7CardModel {

	private String registrationNumber;
	private String speechDate;
	private String nameOfMassMedia;
	private String subjectOfSpeech;	
	private String authorOfSpeech;
	private String remark;
	
	//Text is set after editing Card
	private String someNewText;

	/*Generation of random subject of speech*/
	private String setSubjectOfSpeech() {
		Random rnd = new Random();
		return "SUBJECT # " + Integer.toString(rnd.nextInt(999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt U7" + Integer.toString(rnd.nextInt(999999));
	}
	
	/*Constructor of Unit 7 Model Object*/
	public Unit7CardModel(String speechDate, String nameOfMassMedia, String authorOfSpeech, String remark) {
		this.registrationNumber = null;
		this.subjectOfSpeech = setSubjectOfSpeech();
		this.speechDate = speechDate;
		this.nameOfMassMedia = nameOfMassMedia;
		this.authorOfSpeech = authorOfSpeech;
		this.remark = remark;
		
		this.someNewText = creatNewText();
	}
	
	/*---Get Methods---*/
	
	public String getSpeechDate() {
		return speechDate;
	}
	
	public String getNameOfMassMedia() {
		return nameOfMassMedia;
	}
	
	public String getSubjectOfSpeech() {
		return subjectOfSpeech;
	}

	public String getAuthorOfSpeech() {
		return authorOfSpeech;
	}
	
	public String getRemark() {
		return remark;
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
	

