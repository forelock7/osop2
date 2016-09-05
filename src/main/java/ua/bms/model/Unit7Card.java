package ua.bms.model;

import java.util.Random;

public class Unit7Card {

	public String speechDate;
	public String nameOfMassMedia;
	public String subjectOfSpeech;	
	public String authorOfSpeech;
	public String remark;


	//generation of random subject of speech
	private String setSubjectOfSpeech() {
		Random rnd = new Random();
		return "SuBjEcT - " + Integer.toString(rnd.nextInt(999999));
	}
	
	public Unit7Card(String speechDate, String nameOfMassMedia, String authorOfSpeech, String remark) {

		this.subjectOfSpeech = setSubjectOfSpeech();
		this.speechDate = speechDate;
		this.nameOfMassMedia = nameOfMassMedia;
		this.authorOfSpeech = authorOfSpeech;
		this.remark = remark;
	}
	
}
	

