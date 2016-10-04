package ua.bms.osop.model;

import java.util.Random;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 1 - List Inspections(Перелік перевірок);
 * Implements model of Unit 5 Inspection Card
 */
public class Unit5InspectionCardModel {
	
	public String inspectionDate;
	public String agencyName;
	
	public String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	public String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	public String regNumberRestoredCard;
	
	/*Constructor of Inspection Card Unit 5 Model Object*/
	public Unit5InspectionCardModel(String inspectionDate) {
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

}
