package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ua.bms.osop.model.Unit1ProceedingCardModel;

public class Unit1ProceedingCard extends AnyPage {
	
    /*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
    public Unit1ProceedingCard(PageManager pages) {
        super(pages);
    }
    
	/*------------------The Web-Elements of the Review Proceeding Card on Basic Statements----------------------------------------------------*/

    //Tab "Stages"("Стадії")
    @FindBy(xpath = "//div[contains(@id, 'unit1-reviewCard')]//div[contains(@id, 'tabbar')]/a[2]")
    private WebElement tabStages;

    //Title Card "Review Proceeding"("НП за позовом")
    @FindBy(xpath = "//div[contains(@id, 'unit1-reviewCard')]//div[contains(., 'НП за позовом')]")
    private WebElement titleUnit1ProceedingCard;

    //Type of justice
    @FindBy(xpath = "//div[contains(@id, 'unit1-reviewTabMain')]//span[contains(., 'Вид судочинства')]")
    private WebElement inputJusticeType;
    //First item of Type of justice
    @FindBy(xpath = "//div[contains(@id, 'boundlist')]//li[1]")
    private WebElement itemJusticeType;

    //General subject matter
    @FindBy(xpath = "//div[contains(@id, 'unit1-reviewTabMain')]//span[contains(., 'Загальна тематика питання')]")
    private WebElement inputGeneralSubject;
    //First item of General subject matter
    @FindBy(xpath = "//div[contains(@id, 'treepanel')]//span[contains(., 'В інтересах громадян')]")
    private WebElement itemGeneralSubject;

    //Input field "Plaintiff" ("Позивач(заявник в інтересах якогоподано заяву)")
    @FindBy(xpath = "//div[contains(@id, 'unit1-reviewTabMain')]//label[contains(., 'Позивач')]/following-sibling::div//input")
    private WebElement inputPlaintiff;

    //Input field "Defendant" ("Відповідач(боржник)")
    @FindBy(xpath = "//div[contains(@id, 'unit1-reviewTabMain')]//label[contains(., 'Відповідач')]/following-sibling::div//input")
    private WebElement inputDefendant;

	/*-----------------The Web-Elements of the "Proceeding" Card on "Stages" Tab-------------*/

    //Title of Grid "Creation of stages is available after saving RP"("Створення стадій доступно після збереження НП")
    @FindBy(xpath = "//div[contains(text(), 'Створення стадій доступно після збереження НП')]")
    private WebElement titleOfGrid;


    //Button "First Instance" for creating a new First Instance Card
    @FindBy(xpath = "//a[contains(@id, 'button')]//span[contains(text(), 'Перша інстанція')]")
    private WebElement buttonFirstInstance;

    /*------------------Methods of the Review Proceeding Card on Basic Statements-------------------------------------------------------------*/

    //Checks if Title of Proceeding Card exists
    public boolean isTitleOfCardIsPresent() {
        return isElementPresent(titleUnit1ProceedingCard);
    }

    public void clickOnStagesTab() {
        fluientWaitforElement(tabStages).click();
    }

    //Sets the new card with filling all fields in
    public Unit1ProceedingCard setProceedingCardUnit1(Unit1ProceedingCardModel unit1ProceedingCardModel) {
        inputJusticeType.click();
        fluientWaitforElement(itemJusticeType).click();
        inputGeneralSubject.click();
        fluientWaitforElement(itemGeneralSubject).click();
        type(inputPlaintiff, unit1ProceedingCardModel.getPlaintiff());
        type(inputDefendant, unit1ProceedingCardModel.getDefendant());
        return this;
    }

    //Getting value from input-field "Plaintiff" in formerly created card
    public String getInputPlaintiff() {
        return inputPlaintiff.getAttribute("value");
    }

    //Editing SOME field ("Defendant" ("Відповідач(боржник)"))
    public void setInputDefendant(String someText) {
        type(inputDefendant, someText);
    }

    //Getting existing value from input-field ("Defendant" ("Відповідач(боржник)"))
    public String getInputDefendant() {
        return inputDefendant.getAttribute("value");
    }

	/*------------------Methods of Proceeding Card on "Stages" Tab----------------------------------*/

    //Checks if button "Refresh" is present on "Stages" tab in "Proceeding" Card
    public boolean isTitleOfGridPresent() {
        return isElementPresent(titleOfGrid);
    }

    //Checks if button "First Instance" is present on "Stages" tab in "Proceeding" Card
    public boolean isButtonCreateFirstInstancePresent() {
        return isElementPresent(buttonFirstInstance);
    }
}
