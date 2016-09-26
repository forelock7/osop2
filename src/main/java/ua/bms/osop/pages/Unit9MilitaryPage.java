package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.Unit9Card;

/*
 * Declare all Web-elements on Military Administrative Offenses Page - Unit 9("Військові адмінправопорушення")
 * and the main methods with them
 */
public class Unit9MilitaryPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit9MilitaryPage(PageManager pages) {
		super(pages);
	}
		
/*-------------------The Web-Elements of Military Page----------------------------------------------------*/

	//Title "Military Administrative Offenses" ("Військові адмінправопорушення")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Військові адмінправопорушення')]")
	private WebElement titleUnit9;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//table[1]//td[12]/div")
	private WebElement buttonEdit;
	
	//Button "Delete"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//table[1]//td[13]/div/img")
	private WebElement buttonRemove;
		
	//Button "Recover" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//div[contains(@id, 'crimeGridDeleted')]//table[1]//td[12]/div/img")
	private WebElement buttonRestore;
	
	/*------------------The Web-Elements of the Military Card------------------------------------------------------*/
	//Input field "Protocol Number" ("Номер протоколу")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Номер протоколу:')]/../following-sibling::div[1]//input")
	//@CacheLookup /*Caching web-element refer for reusing this element*/
	private WebElement inputProtocolNumber;
	
	//Input field "Protocol Creating Date" ("Дата складання протоколу")
	@FindBy(id = "datefield-1204-inputEl")
	private WebElement inputProtocolCreatingDate;

	//Input field "Section of AV Lawbook" ("Стаття КУпАП")
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., 'Стаття КУпАП:')]")
	private WebElement inputSectionAOLawbook;
	//First Item "Ст. 172-10" from drop-down list of input field "Section of AV Lawbook" ("Стаття КУпАП")
	@FindBy(xpath  = "//div[contains(@id, 'boundlist')]//li[contains(., 'Ст. 172-10')]")
	private WebElement itemSectionAOLawbook;
	
	//Input field "Date of Commitment Administrative Violations" ("Дата вчинення правопорушення")
	@FindBy(id = "datefield-1206-inputEl")
	private WebElement inputCommitingAODate;
	
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
	//Saving button for recording into grid "Info about repeated ref/ret" ("Відомості про повторні направлення протоколу до суду / повернення судом")
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
	
	/*------------------Methods of Military Page-------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public Unit9MilitaryPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit9/*By.xpath("//div[contains(@id, 'header-title-text')]//div[contains(., 'Військові адмінправопорушення')]"*/));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCardUnit9() {
		buttonEdit.click();
	}
	
	//Removing Card with getinging registration number of the card that will be removed
	public void removeCardUnit9(Unit9Card unit9Card){
		buttonRemove.click();
		unit9Card.regNumberRemovedCard = super.confirmationOfRemoving();
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardUnit9(Unit9Card unit9Card) {
		buttonRestore.click();
		unit9Card.regNumberRestoredCard = confirmRestoring();
	}
	
	/*------------------Methods of Military Page-------------------------------------------------------------*/	
	
	//Sets all field of Card
	public Unit9MilitaryPage setCardUnit9(Unit9Card unit9Card) /*throws InterruptedException*/{
		type(inputProtocolNumber, unit9Card.protocolNumber);
		type(inputProtocolCreatingDate, unit9Card.protocolCreatingDate);
		inputSectionAOLawbook.click();
		//Thread.sleep(2000);
		//itemSectionAVLawbook.click();
		waitFluent.until(ExpectedConditions.elementToBeClickable/*presenceOfElementLocated*/(By.xpath("//div[contains(@id, 'boundlist')]//li[contains(., 'Ст. 172-10')]"))).click();
		type(inputCommitingAODate, unit9Card.commitingAVDate);
		type(inputTheory, unit9Card.theory);
		type(inputOffenderName, unit9Card.offenderName);
		type(inputBirthday, unit9Card.birthday);
		inputMilitaryTroop.click();
		itemMilitaryTroop.click();
		type(inputMilitaryUnitName, unit9Card.militaryUnitName);
		inputMilitaryRank.click();
		itemMilitaryRank.click();
		inputPostCategory.click();
		itemPostCategory.click();
		type(inputPost, unit9Card.post);
		type(inputReferToCourtDate, unit9Card.referToCourtDate);
		inputCourtName.click();
		itemOfCourt.click();
		checkboxReturnByCourt.click();
		type(inputReceivingCourtDecisionDate, unit9Card.receivingCourtDecisionDate);
		type(inputRepeatedReferToCourtDate, unit9Card.repeatedReferToCourtDate);
		buttonAdd.click();
		inputReferReturn.click();
		//Thread.sleep(2000);
		//itemReferReturn.click();
		wait.until(ExpectedConditions.elementToBeClickable/*presenceOfElementLocated*/(By.xpath("//div[contains(@id, 'boundlist')]//li[contains(., 'Направлено до суду')]"))).click();
		type(inputCourtDecisionDate, unit9Card.courtDecisionDate);
		buttonAddMovingOfProtocol.click();
		inputConsiderationResult.click();
		itemConsiderationResult.click();
		type(inputReceivingDateMain, unit9Card.receivingDateMain);
		checkboxCarriedPunishment.click();
		type(inputBeginningPunishmentDate, unit9Card.beginingPunishmentDate);
		return this;
	}
	
	//Editing SOME field ("Theory" ("Фабула"))
	public void setInputTheoryUnit9(String someNewText) {
		type(inputTheory, someNewText);
	}
	
	//Getting value from input-field "Protocol Number" in formerly created card
	public String getInputProtocolNumberUnit9() {
		return inputProtocolNumber.getAttribute("value");
	}
	
	//Getting value from input-field "Theory" in formerly created card
	public String getInputTheoryUnit9() {
		return inputTheory.getAttribute("value");
	}

}
	

