package ua.bms.osop.model;

import java.util.Random;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * Implements model of   6 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
 */
public class Unit2CovertCardModel {

	private String prosecutorDecisionDate;
	private String courtResultDate;
	
	private String newCourtResultDate;
	//set registration number Card is been removing from confirmation form of Deletion
	private String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	private String regNumberRestoredCard;
	
	public Unit2CovertCardModel(String courtResultDate) {
		this.prosecutorDecisionDate = createProsecutorDecisionDate();
		this.courtResultDate = courtResultDate;
		
		this.newCourtResultDate = creatNewJudgmentDate();
	}
	
	/*Generation of random number of Decision of Prosecutor Date*/
	private String createProsecutorDecisionDate() {
		Random rnd = new Random();
		return "0" + Integer.toString(rnd.nextInt(9)+1) + ".0" + Integer.toString(rnd.nextInt(9)+1) + ".2015";
	}
	
	/*Generation of random new text for editing some field*/
	private String creatNewJudgmentDate() {
		Random rnd = new Random();
		return "0" + Integer.toString(rnd.nextInt(9)+1) + ".0" + Integer.toString(rnd.nextInt(9)+1) + ".2015";
	}
	
	/*---Get Methods---*/
	
	public String getProsecutorDecisionDate() {
		return prosecutorDecisionDate;
	}
	
	public String getCourtResultDate() {
		return courtResultDate;
	}
	
	public String getNewCourtResultDate() {
		return newCourtResultDate;
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
