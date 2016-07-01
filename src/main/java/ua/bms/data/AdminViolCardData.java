package ua.bms.data;

public class AdminViolCardData {
	public String protocolNumber;
	public String protocolCreatingDate;
	public String commitingAVDate;
	public String theory;
	public String offenderName;
	public String birthday;
	public String militaryUnitName;
	
	public AdminViolCardData(String protocolNumber, String protocolCreatingDate, String commitingAVDate, String theory, String offenderName, String birthday, String militaryUnitName) {
		this.protocolNumber = protocolNumber;
		this.protocolCreatingDate = protocolCreatingDate;
		this.commitingAVDate = commitingAVDate;
		this.theory = theory;
		this.offenderName = offenderName;
		this.birthday = birthday;
		this.militaryUnitName = militaryUnitName;
	}

}
