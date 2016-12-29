package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit3AccusedModel;

/**
 * Created by ChubenkoV on 29.12.2016.
 */
public class Unit3AccusedCard extends AnyPage {

    /*
    * Constructor of this Page object which is managed by object Page Manager.
    */
    public Unit3AccusedCard(PageManager pages) {
        super(pages);
    }

    /*-------------------The Web-Elements of Card----------------------------------------------------*/
    //Title of "Accused Card"("Обвинувачений");
    @FindBy(xpath = "//div[contains(@id, 'as-AccusedCard')]//div[contains(@id, 'header-title-text')]")
    private WebElement titleAccusedFormUnit3;

    //Field "Accused Name"("ПІБ");
    @FindBy(xpath = "//div[contains(@id, 'as-AccusedCard')]//label[contains(., 'ПІБ')]/following-sibling::div//input")
    private WebElement inputName;

    //Input field "Сitizenship" ("Громадянство")
    @FindBy(xpath = "//div[contains(@id, 'AccusedCard')]//span[contains(., 'Громадянство')]")
    private WebElement inputСitizenship;
    //First item of "Сitizenship"
    @FindBy (xpath = "(//div[contains(@id, 'boundlist')]//li[1])[1]")
    private WebElement itemСitizenship;

    //Button "Save" ("Зберегти") for saving card
    @FindBy(xpath = "//div[contains(@id, 'as-AccusedCard')]//span[contains(., 'Зберегти')]")
    private WebElement buttonSaveCard;

    //Button "Exit" ("Вихід") for exit from card
    @FindBy (xpath = "//div[contains(@id, 'as-AccusedCard')]//span[contains(., 'Вихід')]")
    private WebElement buttonExitFromCard;

    /*-------------------Methods of Card-------------------------------------------------------------*/

    /*
     * Determines loading of Page
     */
    public Unit3AccusedCard ensurePageLoaded() {
        super.ensurePageLoaded();
        wait.until(ExpectedConditions.visibilityOf(titleAccusedFormUnit3));
        return this;
    }

    //Sets the new card with filling all fields in
    public Unit3AccusedCard setAccusedCardUnit3(Unit3AccusedModel unit3AccusedModel){
        type(inputName, unit3AccusedModel.getName());
        inputСitizenship.click();
        fluientWaitforElement(itemСitizenship).click();
        return this;
    }

    //Clicking on "Save"("Зберегти") button in Card
    public void clickButtonSaveCard() {
        buttonSaveCard.click();
    }

    //Clicking on "Exit"("Вихід") button in Card
    public void clickButtonExitFromCardForm() {
        buttonExitFromCard.click();
    }
}
