package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


import ua.bms.data.AdminViolCardData;


public class AdministrativeViolationsPage extends Page {
	
	public AdministrativeViolationsPage(WebDriver driver) {
		super(driver);
	}
	
/*-------------------The Elements of Main Page----------------------------------------------------*/

	//Title "Військові адмінправопорушення"
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Військові адмінправопорушення')]")
	private WebElement titleAV;
	
	//Button "Створити"
	@FindBy(id = "button-1065-btnInnerEl")
	private WebElement buttonCreateCardAV;
	
	//Button "Edit" in the main grid of "Military Administrative Violations" section(row-1; column-12).
	@FindBy(xpath = "//table[1]//td[12]/div")
	private WebElement buttonEdit;

/*------------------The Elements of the Card------------------------------------------------------*/
	//Input field "Номер протоколу"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Номер протоколу:')]/../following-sibling::div[1]//input")
	//@CacheLookup //Caching web-element refer for reusing this element
	private WebElement inputProtocolNumber;
	
	//Input field "Дата складання протоколу"
	@FindBy(id = "datefield-1204-inputEl")
	private WebElement inputProtocolCreatingDate;

	//Input field "Стаття КУпАП"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Стаття КУпАП:')]")
	private WebElement inputSectionAVLawbook;
	//First Item "Ст. 172-10" from drop-down list of input field "Стаття КУпАП"
	@FindBy(xpath  = "//div[contains(@id, 'boundlist')]//li[contains(., 'Ст. 172-10')]")
	private WebElement itemSectionAVLawbook;
	
	//Input field "Дата вчинення правопорушення"
	@FindBy(id = "datefield-1206-inputEl")
	private WebElement inputCommitingAVDate;
	
	//Input field "Фабула"
	@FindBy(id = "textarea-1207-inputEl")
	private WebElement inputTheory;
	
	//Input field "ПІБ правопорушника"
	@FindBy(id = "textfield-1209-inputEl")
	private WebElement inputOffenderName;
	
	//Input field "Дата народження"
	@FindBy(id = "datefield-1210-inputEl")
	private WebElement inputBirthday;
	
	//Input field "Військове формування" 
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Військове формування:')]")
	private WebElement inputMilitaryTroops;
	//First Item "Збройні сили" from drop-down list of input field "Військові формування"
	@FindBy(xpath = "//li[contains(., 'Збройні сили')]")
	private WebElement itemMilitaryTroop;
	
	//Input field "Назва військової частини, установи"
	@FindBy(id = "textfield-1212-inputEl")
	private WebElement inputMilitaryUnitName;
	
	//Input field "Військове звання"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Військове звання:')]")
	private WebElement inputMilitaryRank;
	//Second Item "Молодший офіцерський склад" from drop-down list of input field "Військові звання"
	@FindBy(xpath = "//li[contains(., 'Молодший офіцерський склад')]")
	private WebElement itemMilitaryRank;
	
	//Input field "Категорія посади"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Категорія посади:')]")
	private WebElement inputPostCategory;
	//First Item "Командир (начальник) військової частини" from drop-down list of input field "Категорія посади"
	@FindBy(xpath = "//li[contains(., 'Командир (начальник) військової частини')]")
	private WebElement itemPostCategory;
	
	//Input field "Посада"
	@FindBy(id = "textfield-1216-inputEl")
	private WebElement inputPost;
	
	//Input field "Дата первинного направлення до суду(для обліку у звіті)"
	@FindBy (id = "datefield-1218-inputEl")
	private WebElement inputReferToCourtDate;
	
	//Input field "Назва суду"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Назва суду:')]")
	private WebElement inputCourtName;
	//Third item of Courts
	@FindBy (xpath = "//span[contains(., 'Вищий спеціалізований суд України з розгляду цивільних і кримінальних справ')]")
	private WebElement itemOfCourt;
	
	//CheckBox "Повернуто судом"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//label[contains(., 'Повернуто судом')]")
	private WebElement checkboxReturnByCourt;
	
	//Input field "Дата надходження рішення про повернення судом (для обліку у звіті)"
	@FindBy(id = "datefield-1228-inputEl")
	private WebElement inputReceivingCourtDecisionDate;
	
	//Input field "Дата повторного направлення (для обліку у звіті)"
	@FindBy(id = "datefield-1229-inputEl")
	private WebElement inputRepeatedReferToCourtDate;
	
	//Button "Додати". Adding a record into grid "Відомості про повторні направлення протоколу до суду / повернення судом"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Додати')]")
	private WebElement buttonAdd;
	
	//Form "Створення "Рух протоколу""
	//Input field "Направлено до суду/Повернуто судом"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crime-as-sendingToCourtInfoCard')]//span[contains(., 'Повернуто судом')]")
	private WebElement inputRefer_Receive;
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., 'Направлено до суду')]")
	private WebElement itemRefer_Receive;
	//Input field "Дата рішення"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crime-as-sendingToCourtInfoCard')]//input[contains(@id, 'datefield')]")
	private WebElement inputCourtDecisionDate;
	//Saving button of record into grid "Відомості про повторні направлення протоколу до суду / повернення судом"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crime-as-sendingToCourtInfoCard')]//span[contains(text(), 'Додати')]")
	private WebElement buttonAddMovingOfProtocol;
	
	//Input field "Результат розгляду"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Результат розгляду:')]")
	private WebElement inputConsiderationResult;
	//Third item of court consideration result
	@FindBy (xpath = "//span[contains(., 'Арешт з утриманням на гауптвахті')]") 
	private WebElement itemConsiderationResult;	
	
	//Input field "Дата надходження рішення суду(для обліку у звіті)"(пошук наступного(1) div-елемента після span(на одному рівні)  )
	@FindBy(xpath = "//span[contains(., 'Дата надходження рішення суду (для обліку у звіті):')]/../following-sibling::div[1]//input")
	private WebElement inputReceivingDateMain;
	
	//!!!CheckBox "Відбули покарання у виді арешту з утриманням на гауптвахті". Enable only if "Результат розгляду"="Арешт з утриманням на гауптвахті"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//label[contains(., 'Відбули покарання у виді арешту з утриманням на гауптвахті')]")
	private WebElement checkboxCarriedPunishment;
	
	//Input field "Дата початку утримання на гауптвахті:"Enable only if "Результат розгляду"="Арешт з утриманням на гауптвахті".(пошук наступного(1) div-елемента після span(на одному рівні) )
	@FindBy(xpath = "//span[contains(., 'Дата початку утримання на гауптвахті:')]/../following-sibling::div[1]//input")
	private WebElement inputBeginingPunishmentDate;
	
	
	
	//Button "Зберегти" for saving card
	@FindBy(id = "button-1260-btnInnerEl")
	private WebElement buttonSave;
	
	//Button "Вихід" for exit from card
	@FindBy (xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Вихід')]")
	private WebElement buttonExit;
		
/*----------------The Massage Box (after creating card)-----------------------------------------------*/	
	//Alert button "OK" from massage about successful creating
	@FindBy (xpath = "//div[contains(@id, 'messagebox')]//span[contains(@id, 'button')]")
	private WebElement buttonSuccessfulCreating;
	

	

	
	@Override
	public void open() {
					
	}
	
	//Checking if user jumped into page of Unit9 (existing unit9 title)
	public boolean isOnUnit9Page() {
		return isElementPresent(titleAV);
	}

	//Creating the new card with filling all fields in
	public void createCard (AdminViolCardData adminViolCard) throws InterruptedException {
		buttonCreateCardAV.click();
		type(inputProtocolNumber, adminViolCard.protocolNumber);
		type(inputProtocolCreatingDate, adminViolCard.protocolCreatingDate);
		inputSectionAVLawbook.click();
		Thread.sleep(2000);
		itemSectionAVLawbook.click();
		type(inputCommitingAVDate, adminViolCard.commitingAVDate);
		type(inputTheory, adminViolCard.theory);
		type(inputOffenderName, adminViolCard.offenderName);
		type(inputBirthday, adminViolCard.birthday);
		inputMilitaryTroops.click();
		itemMilitaryTroop.click();
		type(inputMilitaryUnitName, adminViolCard.militaryUnitName);
		inputMilitaryRank.click();
		itemMilitaryRank.click();
		inputPostCategory.click();
		itemPostCategory.click();
		type(inputPost, adminViolCard.post);
		type(inputReferToCourtDate, adminViolCard.referToCourtDate);
		inputCourtName.click();
		itemOfCourt.click();
		checkboxReturnByCourt.click();
		type(inputReceivingCourtDecisionDate, adminViolCard.receivingCourtDecisionDate);
		type(inputRepeatedReferToCourtDate, adminViolCard.repeatedReferToCourtDate);
		buttonAdd.click();
		inputRefer_Receive.click();
		Thread.sleep(2000);
		itemRefer_Receive.click();
		type(inputCourtDecisionDate, adminViolCard.courtDecisionDate);
		buttonAddMovingOfProtocol.click();
		inputConsiderationResult.click();
		itemConsiderationResult.click();
		type(inputReceivingDateMain, adminViolCard.receivingDateMain);
		checkboxCarriedPunishment.click();
		type(inputBeginingPunishmentDate, adminViolCard.beginingPunishmentDate);
		buttonSave.click();
		buttonSuccessfulCreating.click();
		
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void openCardToEdit() {
		buttonEdit.click();
	}
	
	//getting value from input-field "Protocol Number" in formerly created card
	public String getProtocolNumber() {
		return inputProtocolNumber.getAttribute("value");

		
	}
	
	//Clicking on "Exit" button in Card
	public void exitFromCard() {
		buttonExit.click();
	}
}
