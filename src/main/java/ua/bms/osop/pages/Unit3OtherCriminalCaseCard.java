package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.Unit3OtherCriminalCaseCardModel;

public class Unit3OtherCriminalCaseCard extends AnyPage {

    /*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
    public Unit3OtherCriminalCaseCard(PageManager pages) {
        super(pages);
    }
    
	/*------------------The Web-Elements of the Card on Basic Statements----------------------------------------------------*/
	
    //Tab "Stages"("Стадії")
    @FindBy(xpath = "//div[contains(@id, 'unit23-otherSubjectsCCCard')]//div[contains(@id, 'tabbar')]/a[2]")
    private WebElement tabStages;
    
    //Title Card "Other Criminal Proceeding"("Інші питання кримінальної справи")
    @FindBy(xpath = "//div[contains(@id, 'unit23-otherSubjectsCCCard')]//div[contains(., 'Інші питання кримінальної справи')]")
    private WebElement titleUnit3OtherCriminalCaseCard;
    
	//Input field "Number of Case" ("Номер справи / судової справи")
	@FindBy(xpath = "//div[contains(@id, 'unit23-otherSubjectsCCTabMain')]/div[1]//div[3]//input")
	private WebElement inputCaseNumber;
    
	//Input field "Registration Date" ("Дата реєстрації")
    @FindBy(xpath = "//div[contains(@id, 'unit23-otherSubjectsCCTabMain')]/div[1]//div[4]//input")
    private WebElement inputRegistrationDate;
    
	//Input field "Short Story" ("Коротка фабула")
	@FindBy(xpath = "//div[contains(@id, 'unit23-otherSubjectsCCTabMain')]/div[5]//textarea")
	private WebElement inputShortStory;
	
	//Button "Add" ("Додати"). Adding a record into grid "The essence of the raised question" ("Суть порушеного питання")
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCaseAsSendingToCourtCCGrid')]/div[1]//a")
	private WebElement buttonAddQuestionEssence;
	
	/*"The essence of the raised question" Form*/
	//Input field "The essence of the raised question" "Суть порушеного питання"
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]/div[contains(@id, 'form')]//div[3]//input")
	private WebElement inputQuestionEssence;
	//First item of "The essence of the raised question"
    @FindBy(xpath = "//div[contains(@id, 'boundlist')]//li[1]")
    private WebElement itemQuestionEssence;
    
	//Input field "Sent To Court Date" ("Дата надіслання до суду")
    @FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]//input[contains(@id, 'datefield')]")
    private WebElement inputSentToCourtDate;
	
	//Input field "Court Name" ("Назва до суду")
    @FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]/div[contains(@id, 'form')]//div[5]//input")
	private WebElement inputCourtName;
	//Third item of Type of Claim
	@FindBy (xpath = "//div[contains(@id, 'treepanel')]//table[3]//span") 
	private WebElement itemCourtName;
	
	//Saving button for recording into grid "The essence of the raised question" ("Суть порушеного питання")
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]/div[contains(@id, 'toolbar')]//a[1]")
	private WebElement buttonAddQuestionEssenceForm;
	
	//Exit button for recording into grid "The essence of the raised question" ("Суть порушеного питання")
	@FindBy(xpath = "//div[contains(@id, 'unit23-criminalCase-as-SendingToCourtCCCard')]/div[contains(@id, 'toolbar')]//a[2]")
	private WebElement buttonExitQuestionEssenceForm;
	
	//First record in column "The essence of the raised question" ("Суть порушеного питання") Sent to Court Grid
	@FindBy (xpath = "//div[contains(@id, 'unit23-criminalCaseAsSendingToCourtCCGrid')]//td[2]/div")
	private WebElement cellQuestionEssenceGrid;
	
	/*-----------------The Web-Elements of the "Proceeding" Card on "Stages" Tab-------------*/

    //Title of Grid "Creation of stages is available after saving CP"("Створення стадій доступно після збереження КП")
    @FindBy(xpath = "//div[contains(., 'Створення стадій доступно після збереження картки')]")
    private WebElement titleStageCreatingIsUnable;

    //Button "First Instance" for creating a new First Instance Card
    @FindBy(xpath = "//a[contains(@id, 'button')]//span[contains(text(), 'Перша інстанція')]")
    private WebElement buttonFirstInstance;
    
    /*------------------Methods of the Proceeding Card on Basic Statements-------------------------------------------------------------*/

    //Checks if Title of Proceeding Card exists
    public boolean isTitleOfCardIsPresent() {
        return isElementPresent(titleUnit3OtherCriminalCaseCard);
    }

    public void clickOnStagesTab() {
        fluientWaitforElement(tabStages).click();
    }

    //Sets the new card with filling all fields in
    public Unit3OtherCriminalCaseCard setOtherCriminalCaseCardUnit3(Unit3OtherCriminalCaseCardModel unit3OtherCriminalCaseCardModel) {
    	type(inputRegistrationDate, unit3OtherCriminalCaseCardModel.getRegistrationDate());
    	type(inputCaseNumber, unit3OtherCriminalCaseCardModel.getCaseNumber());
    	type(inputShortStory, unit3OtherCriminalCaseCardModel.getShortStory());
    	buttonAddQuestionEssence.click();
    	setSentToCourtForm(unit3OtherCriminalCaseCardModel);
    	buttonAddQuestionEssenceForm.click();
    	return this;
    }
    
    private Unit3OtherCriminalCaseCard setSentToCourtForm(Unit3OtherCriminalCaseCardModel unit3OtherCriminalCaseCardModel) {
    	inputQuestionEssence.click();
    	fluientWaitforElement(itemQuestionEssence).click();
    	type(inputSentToCourtDate, unit3OtherCriminalCaseCardModel.getSentToCourtDate());
    	inputCourtName.click();
    	fluientWaitforElement(itemCourtName).click();
    	return this;
    } 

    
    //Getting value from input-field "Criminal Proceeding Number" in formerly created card
    public String getInputCaseNumber() {
        return inputCaseNumber.getAttribute("value");
    }

    //Editing SOME field "Short Story" ("Коротка фабула")
    public void setInputShortStory(String someText) {
        type(inputShortStory, someText);
    }

    //Getting existing value from input-field ("Defendant" ("Відповідач(боржник)"))
    public String getInputShortStory() {
        return inputShortStory.getAttribute("value");
    }
    
	public String getSentToCourtFromGrid() {
		return  fluientWaitforElement(cellQuestionEssenceGrid).getText();
	}

	/*------------------Methods of Proceeding Card on "Stages" Tab----------------------------------*/

    //Checks if button "First Instance" is present on "Stages" tab in "Proceeding" Card
    public boolean isButtonCreateFirstInstancePresent() {
        return isElementPresent(buttonFirstInstance);
    }
    
    //Checks if button  is present on "Stages" tab in "Proceeding" Card
    public boolean isTitleOfGridStageCreatingIsUnablePresent() {
        return isElementPresent(titleStageCreatingIsUnable);
    }
    
    
	
}
