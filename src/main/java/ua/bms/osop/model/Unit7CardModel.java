package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of Unit 7 Card
 */
public class Unit7CardModel {

	private String speechDate;
	private String nameOfMassMedia;
	private String subjectOfSpeech;	
	private String authorOfSpeech;
	private String remark;
	
	//Text is set after editing Card
	private String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	private String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	private String regNumberRestoredCard;


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
	

