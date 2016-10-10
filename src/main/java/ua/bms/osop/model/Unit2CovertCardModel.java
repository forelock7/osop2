package ua.bms.osop.model;

import java.util.Random;

/*
 * Unit 2: "Pre-trial investigation"("Досудове розслідування")
 * Implements model of   6 - "Covert surveillances(investigative)"("Негласні слідчі(розшукові) дії");
 */
public class Unit2CovertCardModel {

	private String registrationNumber;
	private String prosecutorDecisionDate;
	private String courtResultDate;
	
	private String newCourtResultDate;
	
	public Unit2CovertCardModel(String courtResultDate) {
		this.registrationNumber = null;
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
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	/*---Set Methods---*/
	
	public void setRegistrationNumber (String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
}
