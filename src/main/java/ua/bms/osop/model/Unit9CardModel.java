package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of Unit 9 Card
 */
public class Unit9CardModel {
	
	private String registrationNumber;
	private String protocolNumber;
	private String protocolCreatingDate;
	private String commitingAVDate;
	private String theory;
	private String offenderName;
	private String birthday;
	private String militaryUnitName;
	private String post;
	private String referToCourtDate;
	private String receivingCourtDecisionDate;
	private String repeatedReferToCourtDate;
	private String courtDecisionDate;
	private String receivingDateMain;
	private String beginingPunishmentDate;
	
	//Text is set after editing Card
	private String someNewText;

	//generation of random protocol number
	private String setProtocolNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(999999));
	}
	
	//generation of random new text for editing some Text Field
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt U9" + Integer.toString(rnd.nextInt(999999));
	}
	
	/*Constructor of Unit 9 Model Object*/
	public Unit9CardModel(String protocolCreatingDate, String commitingAVDate, String theory, String offenderName, String birthday, String militaryUnitName, String post, String referToCourtDate, String receivingCourtDecisionDate, String repeatedReferToCourtDate, String courtDecisionDate, String receivingDateMain, String beginingPunishmentDate) {
		this.registrationNumber = null;
		this.protocolNumber = setProtocolNumber();
		this.protocolCreatingDate = protocolCreatingDate;
		this.commitingAVDate = commitingAVDate;
		this.theory = theory;
		this.offenderName = offenderName;
		this.birthday = birthday;
		this.militaryUnitName = militaryUnitName;
		this.post = post;
		this.referToCourtDate = referToCourtDate;
		this.receivingCourtDecisionDate = receivingCourtDecisionDate;
		this.repeatedReferToCourtDate = repeatedReferToCourtDate;
		this.courtDecisionDate = courtDecisionDate;
		this.receivingDateMain = receivingDateMain;
		this.beginingPunishmentDate = beginingPunishmentDate;
		
		this.someNewText = creatNewText();
		
	}
	
	/*---Get Methods---*/
	
	public String getProtocolNumber() {
		return protocolNumber;
	}
	
	public String getProtocolCreatingDate() {
		return protocolCreatingDate;
	}
	
	public String getCommitingAVDate() {
		return commitingAVDate;
	}

	public String getTheory() {
		return theory;
	}
	
	public String getOffenderName() {
		return offenderName;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public String getMilitaryUnitName() {
		return militaryUnitName;
	}
	
	public String getPost() {
		return post;
	}
	
	public String getReferToCourtDate() {
		return referToCourtDate;
	}
	
	public String getReceivingCourtDecisionDate() {
		return receivingCourtDecisionDate;
	}
	
	public String getRepeatedReferToCourtDate() {
		return repeatedReferToCourtDate;
	}
	
	public String getCourtDecisionDate() {
		return courtDecisionDate;
	}
	
	public String getReceivingDateMain() {
		return receivingDateMain;
	}
	
	public String getBeginingPunishmentDate() {
		return beginingPunishmentDate;
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
