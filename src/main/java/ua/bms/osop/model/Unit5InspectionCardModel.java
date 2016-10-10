package ua.bms.osop.model;

import java.util.Random;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 1 - List Inspections(Перелік перевірок);
 * Implements model of Unit 5 Inspection Card
 */
public class Unit5InspectionCardModel {
	
	private String registrationNumber;
	private String inspectionDate;
	private String agencyName;
	
	private String someNewText;
	
	/*Constructor of Inspection Card Unit 5 Model Object*/
	public Unit5InspectionCardModel(String inspectionDate) {
		this.registrationNumber = null;
		this.inspectionDate = inspectionDate;
		
		this.agencyName = createAgencyName();
		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Claim*/
	private String createAgencyName() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(999999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "SomeNEWteXtU5" + Integer.toString(rnd.nextInt(999));
	}
	
	
	/*---Get Methods---*/
	
	public String getInspectionDate() {
		return inspectionDate;
	}
	
	public String getAgencyName() {
		return agencyName;
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
