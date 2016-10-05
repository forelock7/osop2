package ua.bms.osop.model;

import java.util.Random;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * Implements model of 5 - "Acts of supervision over Operational Activities"("Акти нагляду за ОРД");
 */
public class Unit2ActOACardModel {
	
	private String decisionDate;
	private String amountOfChecked; 
	
	private String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	private String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	private String regNumberRestoredCard;
	
	public Unit2ActOACardModel(String decisionDate) {
		this.decisionDate = decisionDate;
		this.amountOfChecked = createAmountOfCheked();

		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Proceeding*/
	private String createAmountOfCheked() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(99999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(999999));
	}
	
	/*---Get Methods---*/
	
	public String getDecisionDate() {
		return decisionDate;
	}
	
	public String getAmountOfChecked() {
		return amountOfChecked;
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
