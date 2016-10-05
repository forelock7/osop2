package ua.bms.osop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.Unit5ChargedCardModel;

public class Unit5ChargedCard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit5ChargedCard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the Charged Person Card------------------------------------------------------*/
	
	//Button "Save" ("Зберегти") for saving card
	@FindBy(xpath = "//div[contains(@id, 'actAsChargedPersonCard')]/div[4]//a[1]")
	private WebElement buttonSaveCard;
	
	//Button "Exit" ("Вихід") for exit from card
	@FindBy (xpath = "//div[contains(@id, 'actAsChargedPersonCard')]/div[4]//span[contains(., 'Вихід')]")
	private WebElement buttonExitFromCard;
	
	//Name of charged person
	@FindBy(xpath = "(//div[contains(@id, 'unit5-actAsChargedPersonCard')]//input)[1]")
	private WebElement inputName;
	
	//Input field "Post" ("Посада")
	@FindBy(xpath = "(//div[contains(@id, 'unit5-actAsChargedPersonCard')]//input)[3]")
	private WebElement inputPost;
	
	//Input field "Type of Supervision, Type of Agency" ("Вид нагляду, Тип установи(доповнення)")
	@FindBy(xpath = "(//div[contains(@id, 'unit5-actAsChargedPersonCard')]//input)[5]")
	private WebElement inputSuperAgencyTypeAdd;
	@FindBy (xpath = "//div[contains(@id, 'unit5-actAsChargedPersonCard')]/following-sibling::div//li[1]")
	private WebElement itemSuperAgencyTypeAdd;
	
	/*------------------Methods of Charged Person Card------------------------------------------------*/
	
	//Clicking on "Save"("Зберегти") button in Card
	@Override
	public void clickButtonSaveCard() {
		buttonSaveCard.click();
	}
	
	//Clicking on "Exit"("Вихід") button in Card
	@Override
	public void clickButtonExitFromCardForm() {
		buttonExitFromCard.click();
	}
		
	//Fills several fields in Document Card
	public Unit5ChargedCard setChargedCard(Unit5ChargedCardModel unit5ChargedCardModel) {
		type(inputName, unit5ChargedCardModel.getName());
		type(inputPost, unit5ChargedCardModel.getPost());
		inputSuperAgencyTypeAdd.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'unit5-actAsChargedPersonCard')]/following-sibling::div//li[1]"))).click();
		return this;
	}
	
	//Fills Post field
	public void setInputPost(String someNewText) {
		type(inputPost, someNewText);
	}

	//Gets value from Name field in Charged Person Card
	public String getInputName() {
		return inputName.getAttribute("value");
	}
	
	//Gets value from Post field in Charged Person Card
	public String getInputPost() {
		return inputPost.getAttribute("value");
	}
	
	public String getNameFromChargedPersonGrid() {
		return  wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@id, 'unit5-actAsChargedPersonGrid')]//table[1]//td[2]/div"))).getText();
	}
}
