package ua.bms.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import ua.bms.data.Unit9CardData;


public class Unit9MilitaryPage extends Page {
	
	public Unit9MilitaryPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public void open() {}
	
/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "Військові адмінправопорушення"
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Військові адмінправопорушення')]")
	private WebElement titleAV;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-12).
	@FindBy(xpath = "//table[1]//td[12]/div")
	private WebElement buttonEdit;
	
	//Button "Delete"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-13).
	@FindBy(xpath = "//table[1]//td[13]/div/img")//html/body/div[2]/div/div/div[1]/div[2]/div/div[3]/div[1]/div[1]/table[1]/tbody/tr/td[13]/div/img") //"//div[contains(@id, 'ext-element-9')]/table[1]//td[13]/div/img")
	private WebElement buttonRemove;
	
	//Grid field with Registration Number
	@FindBy(xpath = "/html/body/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody/tr/td[2]/div")
	private WebElement cellRegNumberInGrid;
	@FindBy(id = "ext-quicktips-tip-innerCt")
	private WebElement quicktipRegNumberInGrid;

/*------------------The Web-Elements of the Card------------------------------------------------------*/
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
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//textarea")
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
	
		

	

	
/*------------------Methods---------------------------------------------------------------------------*/
	

	
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
		this.saveCard();
		this.clickOnAlertOK();
		//buttonSave.click();
		//buttonOKAlertPopup.click();
		
	}
	
	public String removeCardUnit9() throws InterruptedException{
		buttonRemove.click();
		String regNumberRemovedCard = this.confirmDeletion();
		this.goTobRemoved();
		this.clickOnAlertOK();
		return regNumberRemovedCard;
	}
	
	public String getRegNumberFromGrid() throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("before method");
		Thread.sleep(3000);
		//cellRegNumberInGrid.click();
		Actions build = new Actions(driver);
		build.moveToElement(cellRegNumberInGrid).doubleClick(cellRegNumberInGrid).build().perform();
		System.out.println("doubleClick!!!!!!!!!!!!!!!");
		//Thread.sleep(2000);
		//build.moveToElement(quicktipRegNumberInGrid).build().perform();
		//((JavascriptExecutor)driver).executeScript("unselectable = off;", cellRegNumberInGrid);
		return /*quicktipRegNumberInGrid*/cellRegNumberInGrid.getAttribute("value");
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void openCardToEdit() {
		buttonEdit.click();
	}
	
	//getting value from input-field "Protocol Number" in formerly created card
	public String getProtocolNumber() {
		
		return inputProtocolNumber.getAttribute("value");
	}
	
	//getting value from input-field "Theory" in formerly created card
	public String getTheory() {
		return inputTheory.getAttribute("value");
	}
	
	//Editing field "Фабула"
	public void changeValueInTheoryField(String someText) {
		type(inputTheory, someText);
	}
	

	

}
