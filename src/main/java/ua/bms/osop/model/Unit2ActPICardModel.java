package ua.bms.osop.model;

import java.util.Random;


/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * Implements model of 1 - "Acts of supervision over pre-trial investigation" Card("Акти нагляду за ДР");
 */
public class Unit2ActPICardModel {

	private String proceedingNumber;
	private String offenseQualification; 
	private String content;
	
	
	private String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	private String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	private String regNumberRestoredCard;
	
	public Unit2ActPICardModel(String offenseQualification, String content) {
		this.proceedingNumber = createProceedingNumber();
		this.offenseQualification = offenseQualification;
		this.content = content;
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Proceeding*/
	private String createProceedingNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(999999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt U2@##dddghfhds$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getProceedingNumber() {
		return proceedingNumber;
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
