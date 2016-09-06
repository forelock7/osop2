package ua.bms.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.model.Unit7Card;


public class Unit7MassMediaPage extends AnyPage{
	
	public Unit7MassMediaPage(PageManager pages) {
		super(pages);
	}
	
	public Unit7MassMediaPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//div[contains(@id, 'header-title-text')]//div[contains(., 'ЗМІ')]")));
		return this;
	}

	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "Mass Media" ("ЗМІ")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'ЗМІ')]")
	private WebElement titleMM;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//table[1]//td[9]/div")
	private WebElement buttonEditU7;
	
	//Button "Delete"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-10).
	@FindBy(xpath = "//table[1]//td[10]/div")
	private WebElement buttonDelete;
	
/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
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
	
	/*------------------Methods---------------------------------------------------------------------------*/
	
	
	//Click on "Edit" button for the first record in the main grid
	public void openCardToEditU7() {
		buttonEditU7.click();
	}
	
	//Setting the new card with filling all fields in
	public Unit7MassMediaPage setCardUnit7(Unit7Card massMediaCard){
		type(inputSpeechDate, massMediaCard.speechDate);
		inputTypeOfCoverage.click();
		//Thread.sleep(2000);
		itemTypeOfCoverage.click();
		type(inputNameOfMassMedia, massMediaCard.nameOfMassMedia);
		type(inputSubjectOfSpeech, massMediaCard.subjectOfSpeech);
		type(inputAuthorOfSpeech, massMediaCard.authorOfSpeech);
		type(inputRemark, massMediaCard.remark);
		return this;
	}
	
	//Getting existing Subject of Speech from input-field
	public String getInputSubjectOfSpeech() {
		return inputSubjectOfSpeech.getAttribute("value");
	}
	
	//Editing SOME field ("Author" ("Автор"))
	public void setInputAuthorOfSpeech(String someNewText) {
		type(inputAuthorOfSpeech, someNewText);
	}
	
	public String getInputAuthorOfSpeech() {
		return inputAuthorOfSpeech.getAttribute("value");
	}
	
	
	

}
