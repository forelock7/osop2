package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import ua.bms.data.AdminViolCardData;

public class AdministrativeViolationsPage extends Page {
	
	public AdministrativeViolationsPage(WebDriver driver) {
		super(driver);
	}
	
	//Page elements
	//Title "³������ ������������������"
	@FindBy(xpath = ".//*[@id='unit9-crimeSearch-1114_header-title-textEl']/div[1]")
	public WebElement titleAV;
	
	//Button "��������"
	@FindBy(id = "button-1065-btnInnerEl")
	public WebElement buttonCreateCardAV;
	
	//Input field "����� ���������"
	@FindBy(id = "textfield-1203-inputEl")
	public WebElement inputProtocolNumber;
	
	//Input field "���� ��������� ���������"
	@FindBy(id = "datefield-1204-inputEl")
	public WebElement inputProtocolCreatingDate;

	//Input field "������ �����"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., '������ �����:')]")
	public WebElement inputSectionAVLawbook;
	//First Item "��. 172-10" from drop-down list of input field "������ �����"
	@FindBy(xpath  = "//li[contains(., '��. 172-10')]")
	public WebElement itemSectionAVLawbook;
	
	//Input field "���� �������� ��������������"
	@FindBy(id = "datefield-1206-inputEl")
	public WebElement inputCommitingAVDate;
	
	//Input field "������"
	@FindBy(id = "textarea-1207-inputEl")
	public WebElement inputTheory;
	
	//Input field "ϲ� ��������������"
	@FindBy(id = "textfield-1209-inputEl")
	public WebElement inputOffenderName;
	
	//Input field "���� ����������"
	@FindBy(id = "datefield-1210-inputEl")
	public WebElement inputBirthday;
	
	//Input field "³������� ����������" 
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., '³������� ����������:')]")
	public WebElement inputMilitaryTroops;
	//First Item "������ ����" from drop-down list of input field "³������ ����������"
	@FindBy(xpath = "//li[contains(., '������ ����')]")
	public WebElement itemMilitaryTroop;
	
	//Input field "����� �������� �������, ��������"
	@FindBy(id = "textfield-1212-inputEl")
	public WebElement inputMilitaryUnitName;
	
	//Input field "³������� ������"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., '³������� ������:')]")
	public WebElement inputMilitaryRank;
	//Second Item "�������� ����������� �����" from drop-down list of input field "³������ ������"
	@FindBy(xpath = "//li[contains(., '�������� ����������� �����')]")
	public WebElement itemMilitaryRank;
	
	//Input field "�������� ������"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., '�������� ������:')]")
	public WebElement inputPostCategory;
	//First Item "�������� (���������) �������� �������" from drop-down list of input field "�������� ������"
	@FindBy(xpath = "//li[contains(., '�������� (���������) �������� �������')]")
	public WebElement itemPostCategory;
	
	//Input field "������"
	@FindBy(id = "textfield-1216-inputEl")
	public WebElement inputPost;
	
	//Input field "���� ���������� ����������� �� ����(��� ����� � ���)"
	@FindBy (id = "datefield-1218-inputEl")
	public WebElement inputReferToCourtDate;
	
	//Input field "����� ����"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., '����� ����:')]")
	public WebElement inputCourtName;
	//Third item of Courts
	@FindBy (xpath = "//span[contains(., '����� �������������� ��� ������ � �������� �������� � ����������� �����')]")
	public WebElement itemOfCourt;
	
	//CheckBox "��������� �����"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//label[contains(., '��������� �����')]")
	public WebElement returnByCourt;
	
	//Input field "���� ����������� ������ ��� ���������� ����� (��� ����� � ���)"
	@FindBy(id = "datefield-1228-inputEl")
	public WebElement inputReceivingCourtDecisionDate;
	
	//Input field "���� ���������� ����������� (��� ����� � ���)"
	@FindBy(id = "datefield-1229-inputEl")
	public WebElement inputRepeatedReferToCourtDate;
	
	//Button "������". Adding a record into grid "³������ ��� ������� ����������� ��������� �� ���� / ���������� �����"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crimeCard')]//span[contains(., '������')]")
	public WebElement buttonAdd;
	
	//Form "��������� "��� ���������""
	//Input field "���������� �� ����/��������� �����"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crime-as-sendingToCourtInfoCard')]//span[contains(., '���������� �� ����')]")
	public WebElement inputRefer_Receive;
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., '���������� �� ����')]")
	public WebElement itemRefer_Receive;
	//Input field "���� ������"
	@FindBy(xpath = "//span[contains(., '���� ������:')]")
	public WebElement inputCourtDecisionDate;
	//Saving button of record into grid "³������ ��� ������� ����������� ��������� �� ���� / ���������� �����"
	@FindBy(xpath = "//div[contains(@id, 'unit9-crime-as-sendingToCourtInfoCard')]//span[contains(., '������')]")
	public WebElement buttonAddMovingOfProtocol;
	
	
	
	//Button "��������" for saving card
	@FindBy(id = "button-1260-btnInnerEl")
	public WebElement buttonSave;
		
	//Alert button "OK" from massage about successful creating
	@FindBy (xpath = "//div[contains(@id, 'messagebox')]//span[contains(@id, 'button')]")
	public WebElement buttonSuccessfulCreating;
	
	@Override
	public void open() {
					
	}
	
	public void createCard (AdminViolCardData adminViolCard) {
		buttonCreateCardAV.click();
		type(inputProtocolNumber, adminViolCard.protocolNumber);
		type(inputProtocolCreatingDate, adminViolCard.protocolCreatingDate);
		inputSectionAVLawbook.click();
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
		returnByCourt.click();
		type(inputReceivingCourtDecisionDate, adminViolCard.receivingCourtDecisionDate);
		type(inputRepeatedReferToCourtDate, adminViolCard.repeatedReferToCourtDate);
		buttonAdd.click();
		inputRefer_Receive.click();
		itemRefer_Receive.click();
		type(inputCourtDecisionDate, adminViolCard.courtDecisionDate);
		buttonAddMovingOfProtocol.click();
		
		
		
		buttonSave.click();
		buttonSuccessfulCreating.click();
		
	}
}
