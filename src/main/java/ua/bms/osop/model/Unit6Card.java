package ua.bms.osop.model;

import java.util.Random;

/*
 * Implements model of Unit 6 Card
 */
public class Unit6Card {
	
	public String claimNumber;
	public String applicantName;
	public String summary;
	public String receivingProsecutorDate;
		
	/*Constructor of Unit 7 Model Object*/
	public Unit6Card(String applicantName, String summary, String receivingProsecutorDate) {
		this.claimNumber = createClaimNumber();
		
		this.applicantName = applicantName;
		this.summary = summary;
		this.receivingProsecutorDate = receivingProsecutorDate;
	}
	
	/*Generation of random number of Claim*/
	private String createClaimNumber() {
		Random rnd = new Random();
		return Integer.toString(rnd.nextInt(99999999));
	}

}
