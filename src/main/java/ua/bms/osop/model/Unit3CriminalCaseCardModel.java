package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of 1 - "Criminal cases"("Кримінальні справи") Card(Unit 3)
 */
public class Unit3CriminalCaseCardModel {
	
	private String registrationNumber;
	private String criminalCaseNumber;
	private String investigationBeginningDate;
	private String investigationAgency;
	private String offenseQualification;
	
	private String sentToCourtDate;
	
	private String someNewText;
	
	/*Constructor of Model Object*/
	public Unit3CriminalCaseCardModel(String investigationBeginningDate, String offenseQualification, String sentToCourtDate) {
		this.registrationNumber = null;
		this.criminalCaseNumber = createCriminalCaseNumber();
		
		this.investigationBeginningDate = investigationBeginningDate;
		this.offenseQualification = offenseQualification;
		
		this.sentToCourtDate = sentToCourtDate;
		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Claim*/
	private String createCriminalCaseNumber() {
		Random rnd = new Random();
		return "справа №" + Integer.toString(rnd.nextInt(99999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt Розділ1-НП!@##dddghfhds$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*---Get Methods---*/
	
	public String getCriminalCaseNumber() {
		return criminalCaseNumber;
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
