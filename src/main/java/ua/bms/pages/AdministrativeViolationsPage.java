package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ua.bms.data.AdminViolCardData;

public class AdministrativeViolationsPage extends Page {
	
	public AdministrativeViolationsPage(WebDriver driver) {
		super(driver);
	}
	
	//Page elements
	//Title "Військові адмінправопорушення"
	@FindBy(xpath = ".//*[@id='unit9-crimeSearch-1114_header-title-textEl']/div[1]")
	public WebElement titleAV;
	
	//Button "Створити"
	@FindBy(id = "button-1065-btnInnerEl")
	public WebElement buttonCreateCardAV;
	
	//Input field "Номер протоколу"
	@FindBy(id = "textfield-1203-inputEl")
	public WebElement inputProtocolNumber;
	
	//Input field "Дата складання протоколу"
	@FindBy(id = "datefield-1204-inputEl")
	public WebElement inputProtocolCreatingDate;

	//Input field "Стаття КУпАП"
	@FindBy(using ="Стаття КУпАП:")
	public WebElement inputSectionAVLawbook;
	//First Item "Ст. 172-10" from drop-down list of input field "Стаття КУпАП"
	@FindBy(partialLinkText  = "Ст. 172-10")
	public WebElement itemSectionAVLawbook;
	
	//Input field "Дата вчинення правопорушення"
	@FindBy(id = "datefield-1206-inputEl")
	public WebElement inputCommitingAVDate;
	
	//Input field "Фабула"
	@FindBy(id = "textarea-1207-inputEl")
	public WebElement inputTheory;
	
	//Input field "ПІБ правопорушника"
	@FindBy(id = "textfield-1209-inputEl")
	public WebElement inputOffenderName;
	
	//Input field "Дата народження"
	@FindBy(id = "datefield-1210-inputEl")
	public WebElement inputBirthday;
	
	//Input field "Військове формування"
	@FindBy(id = "combo-1211-inputEl")
	public WebElement inputMilitaryTroops;
	//First Item "Збройні сили" from drop-down list of input field "Військові формування"
	@FindBy(xpath = ".//*[@id='boundlist-1264-listEl']/li[1]")
	public WebElement itemMilitaryTroop;
	
	//Input field "Назва військової частини, установи"
	@FindBy(id = "textfield-1212-inputEl")
	public WebElement inputMilitaryUnitName;
	
	//Input field "Військове звання"
	@FindBy(id = "combo-1214-inputEl")
	public WebElement inputMilitaryRank;
	//First Item "Старший та вищій офіцерський склад" from drop-down list of input field "Військові звання"
	@FindBy(xpath = ".//*[@id='boundlist-1403-listEl']/li[1]")
	public WebElement itemMilitaryRank;
	
	//Input field "Категорія посади"
	@FindBy(id = "combo-1354-inputEl")
	public WebElement inputPostCategory;
	//First Item "Командир(начальник) військової частини" from drop-down list of input field "Категорія посади"
	@FindBy(xpath = ".//*[@id='boundlist-1335-listEl']/li[1]")
	public WebElement itemPostCategory;
	
	//Button "Зберегти" for saving card
	@FindBy(id = "button-1260-btnInnerEl")
	public WebElement buttonSave;
	
	
	
	@Override
	public void open() {
					
	}
	
	public void createCard (AdminViolCardData adminViolCard) {
		buttonCreateCardAV.click();
		type(inputProtocolNumber, adminViolCard.protocolNumber);
		type(inputProtocolCreatingDate, adminViolCard.protocolCreatingDate);
		type(inputCommitingAVDate, adminViolCard.commitingAVDate);
		type(inputTheory, adminViolCard.theory);
		type(inputOffenderName, adminViolCard.offenderName);
		type(inputBirthday, adminViolCard.birthday);
		type(inputMilitaryUnitName, adminViolCard.militaryUnitName);
		inputSectionAVLawbook.click();
		itemSectionAVLawbook.click();
		inputMilitaryTroops.click();
		itemMilitaryTroop.click();
		inputMilitaryRank.click();
		itemMilitaryRank.click();
		inputPostCategory.click();
		itemPostCategory.click();
		buttonSave.click();
		
	}
}
