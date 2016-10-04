package ua.bms.osop.model;

import java.util.Random;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 1 - "Review proceedings on a claim"("НП за позовом");
 * Implements model of Unit 1 Claim Card
 */
public class Unit1ProceedingCardModel {
	
	public String plaintiff;
	public String defendant;
	
	public String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	public String regNumberRemovedCard;
	//set registration number Card is been restoring from confirmation form of Restoring
	public String regNumberRestoredCard;
	
	/*Constructor of Unit 1 Claim Model Object*/
	public Unit1ProceedingCardModel (String defendant) {
		this.plaintiff = createNewPaintiff();
		this.defendant = defendant;
		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random number of Claim*/
	private String createNewPaintiff() {
		Random rnd = new Random();
		return "Paintiff-Позивач" + Integer.toString(rnd.nextInt(9999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Some NEW teXt Розділ1-НП!@##dddghfhds$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
	}

}
