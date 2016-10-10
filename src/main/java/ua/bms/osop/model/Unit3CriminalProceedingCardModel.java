package ua.bms.osop.model;

/*
 * Implements model of 1 - "Criminal proceedings"("Кримінальні провадження") Card(Unit 3)
 */
import java.util.Random;

public class Unit3CriminalProceedingCardModel {

	private String registrationNumber;
	private String criminalProceedingNumber;
	private String investigationBeginningDate;
	private String investigationAgency;
	private String offenseQualification;
	
	private String sentToCourtDate;
	
	private String someNewText;
	
	/*Constructor of Model Object*/
	public Unit3CriminalProceedingCardModel(String investigationBeginningDate, String offenseQualification, String sentToCourtDate) {
		this.registrationNumber = null;
		this.criminalProceedingNumber = createCriminalProceedingNumber();
		
		this.investigationBeginningDate = investigationBeginningDate;
		this.offenseQualification = offenseQualification;
		
		this.sentToCourtDate = sentToCourtDate;
		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Claim*/
	private String createCriminalProceedingNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(99999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt Розділ1-НП!@##dddghfhds$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getCriminalProceedingNumber() {
		return criminalProceedingNumber;
	}
	
	public String getInvestigationBeginningDate() {
		return investigationBeginningDate;
	}
	
	public String getSomeNewText() {
		return someNewText;
	}
	
	public String getInvestigationAgency() {
		return investigationAgency;
	}
	
	public String getOffenseQualification() {
		return offenseQualification;
	}

	public String getSentToCourtDate() {
		return sentToCourtDate;
	}
	
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	
	/*---Set Methods---*/
	
	public void setRegistrationNumber (String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
}
