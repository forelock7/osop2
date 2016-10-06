package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit3CriminalProceedingCardModel;

/*
 * Declare all Web-elements on 1 - "Criminal proceedings"("Кримінальні провадження");
 * Unit 3: "Public prosecution"("Держобвинувачення");
 * and the main methods with them
 */
public class Unit3CriminalProceedingCard extends AnyPage {

    /*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
    public Unit3CriminalProceedingCard(PageManager pages) {
        super(pages);
    }
    
	/*------------------The Web-Elements of the Card on Basic Statements----------------------------------------------------*/
    
    //Tab "Stages"("Стадії")
    @FindBy(xpath = "//div[contains(@id, 'unit23-crimeCard')]//div[contains(@id, 'tabbar')]/a[2]")
    private WebElement tabStages;
    
    //Title Card "Criminal Proceeding"("Кримінальне провадження")
    @FindBy(xpath = "//div[contains(@id, 'unit23-crimeCard')]//div[contains(., 'Кримінальне провадження')]")
    private WebElement titleUnit3CriminalProceedingCard;
    
	//Input field "Number of Criminal Proceeding" ("Номер кримінального провадження")
	@FindBy(xpath = "//div[contains(@id, 'unit23-crimeTabMain')]/div[1]//div[3]//input")
	private WebElement inputCriminalProceedingNumber;
    
	//Input field "Investigation Beginning Date" ("Дата початку досудового розслідування")
    @FindBy(xpath = "//div[contains(@id, 'unit23-crimeTabMain')]/div[1]//div[4]//input")
    private WebElement inputInvestigationBeginningDate;
    
    //Input field with drop-down list "Pretrial Investigation Agency" ("Орган досудового розслідування")
    @FindBy(xpath = "//div[contains(@id, 'unit23-crimeTabMain')]/div[2]//div[1]//input")
    private WebElement inputInvestigationAgency;
    //First item of "Pretrial Investigation Agency"
    @FindBy(xpath = "(//div[contains(@id, 'boundlist')]//li[1])[1]")
    private WebElement itemInvestigationAgency;
    
	//Input field "Offense Qualification" ("Кваліфікація правопорушення")
	@FindBy(xpath = "//div[contains(@id, 'unit23-crimeTabMain')]/div[5]//div[1]//input")
	private WebElement inputOffenseQualification;
	
	//Button "Add" ("Додати"). Adding a record into grid "Sent to Court" "Направлено до суду"
	@FindBy(xpath = "//div[contains(@id, 'unit23-crimeAsSendingToCourtGrid')]/div[1]//a")
	private WebElement buttonAddSentToCourt;
	
	/*"Sent to Court" Form*/
	//Input field "Sent to Court" "Направлено до суду"
	@FindBy(xpath = "//div[contains(@id, 'unit23-crime-as-SendingToCourtCard')]/div[contains(@id, 'form')]//div[3]//input")
	private WebElement inputSentToCourt;
	//First item of "Sent to Court"
    @FindBy(xpath = "(//div[contains(@id, 'boundlist')]//li[1])[2]")
    private WebElement itemSentToCourt;
    
	//Input field "Sent To Court Date" ("Дата надіслання до суду")
    @FindBy(xpath = "//div[contains(@id, 'unit23-crime-as-SendingToCourtCard')]//input[contains(@id, 'datefield')]")
    private WebElement inputSentToCourtDate;
	
	//Input field "Court Name" ("Назва до суду")
	@FindBy(xpath = "//div[contains(@id, 'unit23-crime-as-SendingToCourtCard')]/div[contains(@id, 'form')]//div[5]//input")
	private WebElement inputCourtName;
	//Third item of Type of Claim
	@FindBy (xpath = "//div[contains(@id, 'treepanel')]//table[3]//span") 
	private WebElement itemCourtName;
	
	//Saving button for recording into grid "Sent to Court" Form" ("Направлено до суду")
	@FindBy(xpath = "//div[contains(@id, 'unit23-crime-as-SendingToCourtCard')]/div[contains(@id, 'toolbar')]//a[1]")
	private WebElement buttonAddCourtForm;
	
	//Exit button for recording into grid "Sent to Court" Form" ("Направлено до суду")
	@FindBy(xpath = "//div[contains(@id, 'unit23-crime-as-SendingToCourtCard')]/div[contains(@id, 'toolbar')]//a[2]")
	private WebElement buttonExitCourtForm;
	
	//First record in column "Sent to Court" Sent to Court Grid
	@FindBy (xpath = "//div[contains(@id, 'unit23-crimeAsSendingToCourtGrid')]//td[2]/div")
	private WebElement cellSentToCourtGrid;
	
	/*-----------------The Web-Elements of the "Proceeding" Card on "Stages" Tab-------------*/

    //Title of Grid "Creation of stages is available after saving CP"("Створення стадій доступно після збереження КП")
    @FindBy(xpath = "//div[contains(text(), 'Створення стадій доступно після збереження КП')]")
    private WebElement titleOfGrid;

    //Button "First Instance" for creating a new First Instance Card
    @FindBy(xpath = "//a[contains(@id, 'button')]//span[contains(text(), 'Перша інстанція')]")
    private WebElement buttonFirstInstance;
    
    /*------------------Methods of the Review Proceeding Card on Basic Statements-------------------------------------------------------------*/

    //Checks if Title of Proceeding Card exists
    public boolean isTitleOfCardIsPresent() {
        return isElementPresent(titleUnit3CriminalProceedingCard);
    }

    public void clickOnStagesTab() {
        fluientWaitforElement(tabStages).click();
    }

    //Sets the new card with filling all fields in
    public Unit3CriminalProceedingCard setCriminalProceedingCardUnit3(Unit3CriminalProceedingCardModel unit3CriminalProceedingCardModel) {
    	type(inputCriminalProceedingNumber, unit3CriminalProceedingCardModel.getCriminalProceedingNumber());
    	type(inputInvestigationBeginningDate, unit3CriminalProceedingCardModel.getInvestigationBeginningDate());
    	inputInvestigationAgency.click();
    	fluientWaitforElement(itemInvestigationAgency).click();
    	type(inputOffenseQualification, unit3CriminalProceedingCardModel.getOffenseQualification());
    	buttonAddSentToCourt.click();
    	setSentToCourtForm(unit3CriminalProceedingCardModel);
    	buttonAddCourtForm.click();
    	return this;
    }
    
    private Unit3CriminalProceedingCard setSentToCourtForm(Unit3CriminalProceedingCardModel unit3CriminalProceedingCardModel) {
    	inputSentToCourt.click();
    	fluientWaitforElement(itemSentToCourt).click();
    	type(inputSentToCourtDate, unit3CriminalProceedingCardModel.getSentToCourtDate());
    	inputCourtName.click();
    	fluientWaitforElement(itemCourtName).click();
    	return this;
    } 

    
    //Getting value from input-field "Criminal Proceeding Number" in formerly created card
    public String getInputCriminalProceedingNumber() {
        return inputCriminalProceedingNumber.getAttribute("value");
    }

    //Editing SOME field ("Defendant" ("Відповідач(боржник)"))
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

	/*------------------Methods of Proceeding Card on "Stages" Tab----------------------------------*/

    //Checks if button "First Instance" is present on "Stages" tab in "Proceeding" Card
    public boolean isButtonCreateFirstInstancePresent() {
        return isElementPresent(buttonFirstInstance);
    }
    
    //Checks if button  is present on "Stages" tab in "Proceeding" Card
    public boolean isTitleOfGridPresent() {
        return isElementPresent(titleOfGrid);
    }
}
