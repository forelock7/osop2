package ua.bms.data;

public class AdminViolCardData {
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
	
	public AdminViolCardData(String protocolNumber, String protocolCreatingDate, String commitingAVDate, String theory, String offenderName, String birthday, String militaryUnitName, String post, String referToCourtDate, String receivingCourtDecisionDate, String repeatedReferToCourtDate, String courtDecisionDate) {
		this.protocolNumber = protocolNumber;
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
	}

}
