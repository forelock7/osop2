package ua.bms.osop.model;

import java.util.Random;

public class Unit9Card {
	public String protocolNumber;
	public String protocolCreatingDate;
	public String commitingAVDate;
	public String theory;
	public String offenderName;
	public String birthday;
	public String militaryUnitName;
	public String post;
	public String referToCourtDate;
	public String receivingCourtDecisionDate;
	public String repeatedReferToCourtDate;
	public String courtDecisionDate;
	public String receivingDateMain;
	public String beginingPunishmentDate;
	
	//Text is set after editing Card
	public String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	public String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	public String regNumberRestoredCard;

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
	
	public Unit9Card(String protocolCreatingDate, String commitingAVDate, String theory, String offenderName, String birthday, String militaryUnitName, String post, String referToCourtDate, String receivingCourtDecisionDate, String repeatedReferToCourtDate, String courtDecisionDate, String receivingDateMain, String beginingPunishmentDate) {

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
	

	


}
