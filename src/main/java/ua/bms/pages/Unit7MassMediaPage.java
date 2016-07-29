package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ua.bms.data.Unit7CardData;

public class Unit7MassMediaPage extends Page{
	
	public Unit7MassMediaPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public void open() {}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "ЗМІ"
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'ЗМІ')]")
	private WebElement titleMM;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-9).
	@FindBy(xpath = "//table[1]//td[9]/div")
	private WebElement buttonEdit;
	
	//Button "Delete"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-10).
	@FindBy(xpath = "//table[1]//td[10]/div")
	private WebElement buttonDelete;
	
/*------------------The Web-Elements of the Card------------------------------------------------------*/
	
	//Input field "Дата виступу"
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//input[contains(@id, 'datefield')]")
	private WebElement inputSpeechDate;
	
	//Input field "Вид висвітлення діяльності органів прокуратури"
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//input[contains(@id, 'treecombo')]")
	private WebElement inputTypeOfCoverage;
	//Second Item "Інформація в органи влади" from drop-down list of input field "Вид висвітлення діяльності органів прокуратури"
	@FindBy(xpath  = "//div[contains(@id, 'treepanel')]//table[2]")
	private WebElement itemTypeOfCoverage;
	
	//Input field "Назва ЗМІ"
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//label[contains(., 'Назва ЗМІ:')]/following-sibling::div//input")
	private WebElement inputNameOfMassMedia;
	
	//Input field "Тема чи назва виступу"
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//label[contains(., 'Тема чи назва виступу:')]/following-sibling::div//input")
	private WebElement inputSubjectOfSpeech;
	
	//Input field "Автор"
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//label[contains(., 'Автор:')]/following-sibling::div//input")
	private WebElement inputAuthorOfSpeech;
	
	//Input field "Примітка"
	@FindBy(xpath = "//div[contains(@id, 'unit7-mediaCard')]//textarea")
	private WebElement inputRemark;
	
	/*------------------Methods---------------------------------------------------------------------------*/
	
	//Checking if user jumped into page of Unit7 (existing unit7 title)
	public boolean isOnUnit7Page() {
		return isElementPresent(titleMM);
	}
	
	//Creating the new card with filling all fields in
	public void createCardU7 (Unit7CardData massMediaCard) throws InterruptedException {
		buttonCreateCard.click();
		type(inputSpeechDate, massMediaCard.speechDate);
		inputTypeOfCoverage.click();
		Thread.sleep(2000);
		itemTypeOfCoverage.click();
		//inputNameOfMassMedia.click();
		type(inputNameOfMassMedia, massMediaCard.nameOfMassMedia);
		type(inputSubjectOfSpeech, massMediaCard.subjectOfSpeech);
		type(inputAuthorOfSpeech, massMediaCard.authorOfSpeech);
		type(inputRemark, massMediaCard.remark);
		
		this.saveCard();
		this.clickOnAlertOK();
		//buttonSave.click();
		//buttonOKAlertPopup.click();
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void openCardToEdit() {
		buttonEdit.click();
	}
	
	public String getSubjectOfSpeech() {
		return inputSubjectOfSpeech.getAttribute("value");
	}
}
