package ua.bms.data;

import java.util.Random;

public class Unit9CardData {
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

	//generation of random protocol number
	private String setProtocolNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(999999));
	}
	
	public Unit9CardData(String protocolCreatingDate, String commitingAVDate, String theory, String offenderName, String birthday, String militaryUnitName, String post, String referToCourtDate, String receivingCourtDecisionDate, String repeatedReferToCourtDate, String courtDecisionDate, String receivingDateMain, String beginingPunishmentDate) {

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
		
	}
	

	


}
