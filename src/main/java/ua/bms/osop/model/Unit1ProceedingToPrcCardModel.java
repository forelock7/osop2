package ua.bms.osop.model;

import java.util.Random;

/*
 * Section "Presentetion" ("Представництво") - Unit 1
 * 2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
 * Implements model of Unit 1 Proceeding To Procuracy Card
 */
public class Unit1ProceedingToPrcCardModel {

	private String plaintiff;
	private String defendant;

	private String someNewText;

    /*Constructor of Unit 1 Claim Model Object*/
    public Unit1ProceedingToPrcCardModel (String defendant) {
        this.plaintiff = createNewPaintiff();
        this.defendant = defendant;

        this.someNewText = creatNewText();
    }

    /*Generation of random number of Claim*/
    private String createNewPaintiff() {
        Random rnd = new Random();
        return "Paintiff-Позивач(до прок)" + Integer.toString(rnd.nextInt(9999));
    }

    /*Generation of random new text for editing some Text Field*/
    private String creatNewText() {
        Random rnd = new Random();
        return "teXt Розділ1-НП за поз до прок!@##dddghfhds$$%&*^&*(&)" + Integer.toString(rnd.nextInt(999999999));
    }
    
	/*---Get Methods---*/
	
	public String getPlaintiff() {
		return plaintiff;
	}
	
	public String getDefendant() {
		return defendant;
	}
	
	public String getSomeNewText() {
		return someNewText;
	}

}
