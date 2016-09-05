package ua.bms.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Unit9MilitaryPage extends AnyPage {
	
	public Unit9MilitaryPage(PageManager pages) {
		super(pages);
	}
	
	
/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "Military Administrative Violations" ("Військові адмінправопорушення")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Військові адмінправопорушення')]")
	private WebElement titleAV;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//table[1]//td[12]/div")
	private WebElement buttonEdit;
	
	//Button "Delete"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//table[1]//td[13]/div/img")
	private WebElement buttonRemove;
		
	//Button "Recover" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//div[contains(@id, 'crimeGridDeleted')]//table[1]//td[12]/div/img")
	private WebElement buttonRecover;
	
/*------------------The Web-Elements of the Card------------------------------------------------------*/
	//Input field "Protocol Number" ("Номер протоколу")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Номер протоколу:')]/../following-sibling::div[1]//input")
	//@CacheLookup /*Caching web-element refer for reusing this element*/
	private WebElement inputProtocolNumber;
	
	//Input field "Protocol Creating Date" ("Дата складання протоколу")
	@FindBy(id = "datefield-1204-inputEl")
	private WebElement inputProtocolCreatingDate;

	//Input field "Section of AV Lawbook" ("Стаття КУпАП")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Стаття КУпАП:')]")
	private WebElement inputSectionAVLawbook;
	//First Item "Ст. 172-10" from drop-down list of input field "Section of AV Lawbook" ("Стаття КУпАП")
	@FindBy(xpath  = "//div[contains(@id, 'boundlist')]//li[contains(., 'Ст. 172-10')]")
	private WebElement itemSectionAVLawbook;
	
	//Input field "Date of Commitment Administrative Violations" ("Дата вчинення правопорушення")
	@FindBy(id = "datefield-1206-inputEl")
	private WebElement inputCommitingAVDate;
	
	//Input field "Theory" ("Фабула")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//textarea")
	private WebElement inputTheory;
	
	//Input field "Name of Offender" ("ПІБ правопорушника")
	@FindBy(id = "textfield-1209-inputEl")
	private WebElement inputOffenderName;
	
	//Input field "Birthday" ("Дата народження")
	@FindBy(id = "datefield-1210-inputEl")
	private WebElement inputBirthday;
	
	//Input field "Military Troop" ("Військове формування") 
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Військове формування:')]")
	private WebElement inputMilitaryTroop;
	//First Item "Armed Forces" ("Збройні сили") from drop-down list of input field "Military Troop" ("Військове формування") 
	@FindBy(xpath = "//li[contains(., 'Збройні сили')]")
	private WebElement itemMilitaryTroop;
	
	//Input field "Military Unit Name" ("Назва військової частини, установи")
	@FindBy(id = "textfield-1212-inputEl")
	private WebElement inputMilitaryUnitName;
	
	//Input field "Military Rank" ("Військове звання")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Військове звання:')]")
	private WebElement inputMilitaryRank;
	//Second Item "Company Officers" ("Молодший офіцерський склад") from drop-down list of input field "Military Rank" ("Військове звання")
	@FindBy(xpath = "//li[contains(., 'Молодший офіцерський склад')]")
	private WebElement itemMilitaryRank;
	
	//Input field "Post Category" ("Категорія посади")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Категорія посади:')]")
	private WebElement inputPostCategory;
	//First Item "Командир (начальник) військової частини" from drop-down list of input field "Post Category" ("Категорія посади")
	@FindBy(xpath = "//li[contains(., 'Командир (начальник) військової частини')]")
	private WebElement itemPostCategory;
	
	//Input field "Post" ("Посада")
	@FindBy(id = "textfield-1216-inputEl")
	private WebElement inputPost;
	
	//Input field "Date of the First Refering to the Court" ("Дата первинного направлення до суду(для обліку у звіті)")
	@FindBy (id = "datefield-1218-inputEl")
	private WebElement inputReferToCourtDate;
	
	//Input field "Court Name" ("Назва суду")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Назва суду:')]")
	private WebElement inputCourtName;
	//Third item of Courts
	@FindBy (xpath = "//span[contains(., 'Вищий спеціалізований суд України з розгляду цивільних і кримінальних справ')]")
	private WebElement itemOfCourt;
	
	//CheckBox "Returning by Court" ("Повернуто судом")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//label[contains(., 'Повернуто судом')]")
	private WebElement checkboxReturnByCourt;
	
	//Input field "Date of Receiving Court Decision" (Дата надходження рішення про повернення судом (для обліку у звіті)")
	@FindBy(id = "datefield-1228-inputEl")
	private WebElement inputReceivingCourtDecisionDate;
	
	//Input field "Date of Repeated Refering to the Court" ("Дата повторного направлення (для обліку у звіті)")
	@FindBy(id = "datefield-1229-inputEl")
	private WebElement inputRepeatedReferToCourtDate;
	
	//Button "Add" ("Додати"). Adding a record into grid "Відомості про повторні направлення протоколу до суду / повернення судом"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Додати')]")
	private WebElement buttonAdd;
	
	//Form "Creating "Protocol Movement"" ("Створення "Рух протоколу"")
	//Input field "Refered to Court/Return by Court" ("Направлено до суду/Повернуто судом")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crime-as-sendingToCourtInfoCard')]//span[contains(., 'Повернуто судом')]")
	private WebElement inputReferReturn;
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., 'Направлено до суду')]")
	private WebElement itemReferReturn;
	//Input field "Decision Date"  ("Дата рішення")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crime-as-sendingToCourtInfoCard')]//input[contains(@id, 'datefield')]")
	private WebElement inputCourtDecisionDate;
	//Saving button of record into grid "Info about repeated ref/ret" ("Відомості про повторні направлення протоколу до суду / повернення судом")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crime-as-sendingToCourtInfoCard')]//span[contains(text(), 'Додати')]")
	private WebElement buttonAddMovingOfProtocol;
	
	//Input field "Consideration Result" ("Результат розгляду")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Результат розгляду:')]")
	private WebElement inputConsiderationResult;
	//Third item of court consideration result
	@FindBy (xpath = "//span[contains(., 'Арешт з утриманням на гауптвахті')]") 
	private WebElement itemConsiderationResult;	
	
	//Input field "Receiving Date of Decision Result" ("Дата надходження рішення суду(для обліку у звіті)")
	//(пошук наступного(1) div-елемента після span(на одному рівні)  )
	@FindBy(xpath = "//span[contains(., 'Дата надходження рішення суду (для обліку у звіті):')]/../following-sibling::div[1]//input")
	private WebElement inputReceivingDateMain;
	
	//!!!CheckBox "Carried Punishment" ("Відбули покарання у виді арешту з утриманням на гауптвахті").
	//Enable only if "Результат розгляду"="Арешт з утриманням на гауптвахті"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//label[contains(., 'Відбули покарання у виді арешту з утриманням на гауптвахті')]")
	private WebElement checkboxCarriedPunishment;
	
	//Input field "Beginning Punishment Date" ("Дата початку утримання на гауптвахті)
	//"Enable only if "Результат розгляду"="Арешт з утриманням на гауптвахті".(пошук наступного(1) div-елемента після span(на одному рівні) )
	@FindBy(xpath = "//span[contains(., 'Дата початку утримання на гауптвахті:')]/../following-sibling::div[1]//input")
	private WebElement inputBeginningPunishmentDate;
	
/*------------------Methods---------------------------------------------------------------------------*/

	public Unit9MilitaryPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//div[contains(@id, 'header-title-text')]//div[contains(., 'Військові адмінправопорушення')]")));
		return this;
	}
	
	/*	
	//Checking if user jumped into page of Unit9 (existing unit9 title)
	public boolean isOnUnit9Page() {
		return isElementPresent(titleAV);
	}

	//Creating the new card with filling all fields in
	public void createCardU9 (Unit9CardData adminViolCard) throws InterruptedException {
		buttonCreateCard.click();
		type(inputProtocolNumber, adminViolCard.protocolNumber);
		type(inputProtocolCreatingDate, adminViolCard.protocolCreatingDate);
		inputSectionAVLawbook.click();
		Thread.sleep(2000);
		itemSectionAVLawbook.click();
		type(inputCommitingAVDate, adminViolCard.commitingAVDate);
		type(inputTheory, adminViolCard.theory);
		type(inputOffenderName, adminViolCard.offenderName);
		type(inputBirthday, adminViolCard.birthday);
		inputMilitaryTroop.click();
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
		inputReferReturn.click();
		Thread.sleep(2000);
		itemReferReturn.click();
		type(inputCourtDecisionDate, adminViolCard.courtDecisionDate);
		buttonAddMovingOfProtocol.click();
		inputConsiderationResult.click();
		itemConsiderationResult.click();
		type(inputReceivingDateMain, adminViolCard.receivingDateMain);
		checkboxCarriedPunishment.click();
		type(inputBeginningPunishmentDate, adminViolCard.beginingPunishmentDate);
		this.saveCard();
		this.clickOnAlertOK();
	}
	
	//Removing Card with getinging registration number of the card that is deleting
	public String removeCardUnit9() throws InterruptedException{
		buttonRemove.click();
		String regNumberRemovedCard = this.confirmDeletion();
		this.goToRemoved();
		return regNumberRemovedCard;
	}
	

	
	//Click on "Edit" button for the first record in the main grid
	public void openCardToEdit() {
		buttonEdit.click();
	}
	
	//Getting value from input-field "Protocol Number" in formerly created card
	public String getProtocolNumber() {
		return inputProtocolNumber.getAttribute("value");
	}
	
	//Getting value from input-field "Theory" in formerly created card
	public String getTheory() {
		return inputTheory.getAttribute("value");
	}
	
	//Editing field "Theory" ("Фабула")
	public void changeValueInTheoryField(String someText) {
		type(inputTheory, someText);
	}

	public String recoverCardUnit9() {
		buttonRecover.click();
		String regNumber = confirmRecovering();
		this.goToMainTab();
		return regNumber;
	}
	*/

	

}
