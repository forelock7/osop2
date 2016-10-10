package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ua.bms.osop.model.Unit3CriminalCaseCardModel;

/*
 * Declare all Web-elements on 4 - "Criminal Cases" ("Кримінальні справи");
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * and the main methods with them
 */
public class Unit3CriminalCaseCard extends AnyPage {

    /*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
    public Unit3CriminalCaseCard(PageManager pages) {
        super(pages);
    }
    
	/*------------------The Web-Elements of the Card on Basic Statements----------------------------------------------------*/
    
    //Tab "Stages"("Стадії")
    @FindBy(xpath = "//div[contains(@id, 'unit23-criminalCaseCard')]//div[contains(@id, 'tabbar')]/a[2]")
    private WebElement tabStages;
    
    //Title Card "Criminal Caes"("Кримінальне справа")
    @FindBy(xpath = "//div[contains(@id, 'unit23-criminalCaseCard')]//div[contains(., 'Кримінальна справа')]")
    private WebElement titleUnit3CriminalCaseCard;
    
	//Input field "Number of Criminal Case" ("Номер кримінальної справи")
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCaseTabMain')]/div[1]//div[3]//input")
	private WebElement inputCriminalCaseNumber;
    
	//Input field "Investigation Beginning Date" ("Дата початку досудового розслідування")
    @FindBy(xpath = "//div[contains(@id, 'unit23-criminalCaseTabMain')]/div[1]//div[4]//input")
    private WebElement inputInvestigationBeginningDate;
    
    //Input field with drop-down list "Pretrial Investigation Agency" ("Орган досудового розслідування")
    @FindBy(xpath = "//div[contains(@id, 'unit23-criminalCaseTabMain')]/div[2]//div[1]//input")
    private WebElement inputInvestigationAgency;
    //First item of "Pretrial Investigation Agency"
    @FindBy(xpath = "(//div[contains(@id, 'boundlist')]//li[1])[1]")
    private WebElement itemInvestigationAgency;
    
	//Input field "Offense Qualification" ("Кваліфікація правопорушення")
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCaseTabMain')]/div[4]//div[1]//input")
	private WebElement inputOffenseQualification;
	
	//Button "Add" ("Додати"). Adding a record into grid "Sent to Court" "Направлено до суду"
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCaseAsSendingToCourtCCGrid')]/div[1]//a")
	private WebElement buttonAddSentToCourt;
	
	/*"Sent to Court" Form*/
	//Input field "Sent to Court" "Направлено до суду"
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]/div[contains(@id, 'form')]//div[3]//input")
	private WebElement inputSentToCourt;
	//First item of "Sent to Court"
    @FindBy(xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]")
    private WebElement itemSentToCourt;
    
	//Input field "Sent To Court Date" ("Дата надіслання до суду")
    @FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]//input[contains(@id, 'datefield')]")
    private WebElement inputSentToCourtDate;
	
	//Input field "Court Name" ("Назва до суду")
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]/div[contains(@id, 'form')]//div[5]//input")
	private WebElement inputCourtName;
	//Third item of Type of Claim
	@FindBy (xpath = "//div[contains(@id, 'treepanel')]//table[3]//span") 
	private WebElement itemCourtName;
	
	//Saving button for recording into grid "Sent to Court" Form" ("Направлено до суду")
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]/div[contains(@id, 'toolbar')]//a[1]")
	private WebElement buttonAddCourtForm;
	
	//Exit button for recording into grid "Sent to Court" Form" ("Направлено до суду")
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]/div[contains(@id, 'toolbar')]//a[2]")
	private WebElement buttonExitCourtForm;
	
	//First record in column "Sent to Court" Sent to Court Grid
	@FindBy (xpath = "//div[contains(@id, 'unit23-criminalCaseAsSendingToCourtCCGrid')]//td[2]/div")
	private WebElement cellSentToCourtGrid;
	
	/*-----------------The Web-Elements of the "Case" Card on "Stages" Tab-------------*/

    //Title of Grid "Creation of stages is available after saving CС"("Створення стадій доступно після збереження КС")
    @FindBy(xpath = "//div[contains(text(), 'Створення стадій доступно після збереження КC')]")
    private WebElement titleStageCreatingIsUnable;

    //Button "First Instance" for creating a new First Instance Card
    @FindBy(xpath = "//a[contains(@id, 'button')]//span[contains(text(), 'Перша інстанція')]")
    private WebElement buttonFirstInstance;
    
    /*------------------Methods of the Review Case Card on Basic Statements-------------------------------------------------------------*/

    //Checks if Title of Proceeding Card exists
    public boolean isTitleOfCardIsPresent() {
        return isElementPresent(titleUnit3CriminalCaseCard);
    }

    public void clickOnStagesTab() {
        fluientWaitforElement(tabStages).click();
    }

    //Sets the new Case card with filling all fields in
    public Unit3CriminalCaseCard setCriminalCaseCardUnit3(Unit3CriminalCaseCardModel unit3CriminalCaseCardModel) {
    	type(inputCriminalCaseNumber, unit3CriminalCaseCardModel.getCriminalCaseNumber());
    	type(inputInvestigationBeginningDate, unit3CriminalCaseCardModel.getInvestigationBeginningDate());
    	inputInvestigationAgency.click();
    	fluientWaitforElement(itemInvestigationAgency).click();
    	type(inputOffenseQualification, unit3CriminalCaseCardModel.getOffenseQualification());
    	buttonAddSentToCourt.click();
    	setSentToCourtForm(unit3CriminalCaseCardModel);
    	buttonAddCourtForm.click();
    	return this;
    }
    
  //Sets the "Sent to Court" Form in Case Card with filling all fields in
    private Unit3CriminalCaseCard setSentToCourtForm(Unit3CriminalCaseCardModel unit3CriminalCaseCardModel) {
    	inputSentToCourt.click();
    	fluientWaitforElement(itemSentToCourt).click();
    	type(inputSentToCourtDate, unit3CriminalCaseCardModel.getSentToCourtDate());
    	inputCourtName.click();
    	fluientWaitforElement(itemCourtName).click();
    	return this;
    } 

    
    //Getting value from input-field "Criminal Case Number" in formerly created card
    public String getInputCriminalCaseNumber() {
        return inputCriminalCaseNumber.getAttribute("value");
    }

    //Editing SOME field "Offense Qualification" ("Кваліфікація правопорушення")
    public void setInputOffenseQualification(String someText) {
        type(inputOffenseQualification, someText);
    }

    //Getting existing value from input-field ("Defendant" ("Відповідач(боржник)"))
    public String getInputOffenseQualification() {
        return inputOffenseQualification.getAttribute("value");
    }
    
	public String getSentToCourtFromGrid() {
		return  fluientWaitforElement(cellSentToCourtGrid).getText();
	}

	/*------------------Methods of Case Card on "Stages" Tab----------------------------------*/

    //Checks if button "First Instance" is present on "Stages" tab in "Proceeding" Card
    public boolean isButtonCreateFirstInstancePresent() {
        return isElementPresent(buttonFirstInstance);
    }
    
    //Checks if button  is present on "Stages" tab in "Proceeding" Card
    public boolean isTitleOfGridStageCreatingIsUnablePresent() {
        return isElementPresent(titleStageCreatingIsUnable);
    }
	
}
