package ua.bms.osop.model;

import java.util.Random;

/*
 * "Supervision of the observance of laws in the execution of judgments." Page - Unit 5
 * ("Нагляд за додержанням законів при виконанні судових рішень.")
 * 3 - "List of Charged Person"("Перелік осіб, притягнутих до відповідальності").
 * Implements model of Unit 5 Response Document Card
 */
public class Unit5ChargedCard {
	
	public String name;
	public String post;	

	public String someNewText;
	//set registration number Card is been removing from confirmation form of Deletion
	public String chargedNameDeletedCard;
	
	/*Constructor of Charged Person Card Unit 5 Model Object*/
	public Unit5ChargedCard(String post) {
		
		this.name = createName();
		this.post = post;		
		this.someNewText = creatNewText();
	}
	
	/*Generation of random Document Content*/
	private String createName() {
		Random rnd = new Random();
		return "Name of Person" + Integer.toString(rnd.nextInt(999999999));
	}
	
	/*Generation of random new text for editing some Text Field*/
	private String creatNewText() {
		Random rnd = new Random();
		return "Other post" + Integer.toString(rnd.nextInt(999));
	}
}
