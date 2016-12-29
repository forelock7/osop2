package ua.bms.osop.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ua.bms.osop.model.Unit7CardModel;

public class Unit7MassMediaCard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit7MassMediaCard(PageManager pages) {
		super(pages);
	}
	
/*------------------The Web-Elements of the Mass Media Card------------------------------------------------------*/
	
	//Input field "Speech Date" ("Дата виступу")
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//input[contains(@id, 'datefield')]")
	private WebElement inputSpeechDate;
	
	//Input field "Type Coverage of Prosecution Authorities" ("Вид висвітлення діяльності органів прокуратури")
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//input[contains(@id, 'treecombo')]")
	private WebElement inputTypeOfCoverage;
	//Second Item "Information for Government Authority" ("Інформація в органи влади") from drop-down list of input field 
	//"Type Coverage of Prosecution Authorities" "Вид висвітлення діяльності органів прокуратури"
	@FindBy(xpath  = "//div[contains(@id, 'treepanel')]//table[2]")
	private WebElement itemTypeOfCoverage;
	
	//Input field "Name of Mass Media" ("Назва ЗМІ")
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//label[contains(., 'Назва ЗМІ:')]/following-sibling::div//input")
	private WebElement inputNameOfMassMedia;
	
	//Input field "Subject of Speech" ("Тема чи назва виступу")
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//label[contains(., 'Тема чи назва виступу:')]/following-sibling::div//input")
	private WebElement inputSubjectOfSpeech;
	
	//Input field "Author" ("Автор")
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//label[contains(., 'Автор:')]/following-sibling::div//input")
	private WebElement inputAuthorOfSpeech;
	
	//Input field "Remark" ("Примітка")
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//textarea")
	private WebElement inputRemark;
	
	/*------------------Methods of Mass Media Card------------------------------------------------------------------*/
	
	//Setting the new card with filling all fields in
	public Unit7MassMediaCard setCardUnit7(Unit7CardModel massMediaCard){
		type(inputSpeechDate, massMediaCard.getSpeechDate());
		inputTypeOfCoverage.click();
		fluientWaitforElement(itemTypeOfCoverage).click();
		//wait.until(presenceOfElementLocated(By.xpath("//div[contains(@id, 'treepanel')]//table[2]"))).click();
		type(inputNameOfMassMedia, massMediaCard.getNameOfMassMedia());
		type(inputSubjectOfSpeech, massMediaCard.getSubjectOfSpeech());
		type(inputAuthorOfSpeech, massMediaCard.getAuthorOfSpeech());
		type(inputRemark, massMediaCard.getRemark());
		return this;
	}
	
	//Getting existing Subject of Speech from input-field
	public String getInputSubjectOfSpeechUnit7() {
		return inputSubjectOfSpeech.getAttribute("value");
	}
		
	//Editing SOME field ("Author" ("Автор"))
	public void setInputAuthorOfSpeechUnit7(String someNewText) {
		type(inputAuthorOfSpeech, someNewText);
	}
	
	//Getting existing value from input-field "Author" ("Автор")
	public String getInputAuthorOfSpeechUnit7() {
		return inputAuthorOfSpeech.getAttribute("value");
	}
}
