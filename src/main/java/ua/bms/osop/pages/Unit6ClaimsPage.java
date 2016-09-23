package ua.bms.osop.pages;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ua.bms.osop.model.Unit6Card;

/*
 * Declare all Web-elements on Claims Page - Unit 6("Звернення")
 * and the main methods with them
 */
public class Unit6ClaimsPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit6ClaimsPage(PageManager pages) {
		super(pages);
	}
		
	/*-------------------The Web-Elements of Claim Page----------------------------------------------------*/

	//Title "Claims" ("Звернення")
	@FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'Звернення')]")
	private WebElement titleUnit6;
	
	//Button "Edit"("Редагувати") for the first record in the main grid on the main UNIT's page(row-1; column-14).
	@FindBy(xpath = "//table[1]//td[14]/div/img")
	private WebElement buttonEdit;
	
	//Button "Remove"("Видалити") for the first record in the main grid on the main UNIT's page(row-1; column-15).
	@FindBy(xpath = "//table[1]//td[15]/div/img")
	private WebElement buttonRemove;
	
	//Button "Restore" ("Відновити") for the first record in the main grid on the main UNIT's page(row-1; column-14).
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestGridDeleted')]//table[1]//td[14]/div/img")
	private WebElement buttonRestore;
	
	/*------------------The Web-Elements of the Claim Card------------------------------------------------------*/
	
	//Input field "Number of Claim" ("№ звернення")
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestTabMain')]//label[contains(., '№ звернення:')]/following-sibling::div//input")
	private WebElement inputClaimNumber;
	
	//Input field "Type of Claim" ("Вид звернення")
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestTabMain')]//span[contains(., 'Вид звернення:')]")
	private WebElement inputClaimType;
	//Third item of Type of Claim
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., 'Первинне')]") 
	private WebElement itemClaimType;
	
	//Input field "Form of applicant" ("Вид заявника")
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestTabMain')]//span[contains(., 'Вид заявника:')]")
	private WebElement inputApplicantForm;
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., 'Фізична особа')]")
	private WebElement itemApplicantForm;
	
	//Button "Add" ("Додати"). Adding a record into grid "Відомості про заявника, підписанта організації заявника та про співскаржників"
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestAsApplicantGrid')]//span[contains(., 'Додати')]")
	private WebElement buttonAddFacts;
	
	//Form "Creating applicant, signatory of applicant, complainant" ("Створення заявник, підписант організації заявника, співскаржник")
	//Input field "Form of applicant" ("Вид заявника")
	@FindBy(xpath = "//div[contains(@id, 'unit68-request-as-applicantCard')]//span[contains(., 'Вид заявника:')]")
	private WebElement inputApplicantFormGrid;
	@FindBy (xpath = "//div[contains(@id, 'unit68-request-as-applicantCard')]/following-sibling::div[2]/div[contains(@id, 'boundlist')]//li[contains(.,'Фізична особа')]")
	private WebElement itemApplicantFormGrid;	
	//Input field "Type of applicant"  ("Тип заявника")
	@FindBy(xpath = "//div[contains(@id, 'unit68-request-as-applicantCard')]//span[contains(., 'Тип заявника:')]")
	private WebElement inputApplicantType;
	@FindBy (xpath = "//div[contains(@id, 'unit68-request-as-applicantCard')]/following-sibling::div[4]//ul[contains(@id, 'boundlist')]//li[contains(.,'Заявник')]")
	private WebElement itemApplicantType;
	//Input field "" ("П.І.Б/Назва")
	@FindBy(xpath = "//div[contains(@id, 'unit68-request-as-applicantCard')]//span[contains(., 'П.І.Б./Назва:')]/../following-sibling::div[1]//input")
	private WebElement inputApplicantName;
	//Saving button for recording into grid "Info about repeated ref/ret" ("Відомості про повторні направлення протоколу до суду / повернення судом")
	@FindBy(xpath = "//div[contains(@id, 'unit68-request-as-applicantCard')]//span[contains(text(), 'Додати')]")
	private WebElement buttonAddApplicantInForm;
	
	//Input field "Summary" ("Стислий зміст")
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestTabMain')]//textarea")
	private WebElement inputSummary;
	
	//Input field "Date of Repeated Refering to the Court" ("Дата надходження до прокуратури")
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestTabMain')]//label[contains(., 'Дата надходження до прокуратури:')]/following-sibling::div//input")
	private WebElement inputReceivingProsecutorDate;
	
	//Input field "Establish in Unit" ("Заведено у підрозділі")
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestTabMain')]//label[contains(., 'Заведено у підрозділі:')]/following-sibling::div//div[contains(@id, 'trigger-picker')]")
	private WebElement inputArrowEstablishInUnit;
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//tr[2]/td[1]/div")
	private WebElement itemEstablishInUnit;
	
	//Input field "Category of Claim" ("Категорія звернення")
	@FindBy(xpath = "//div[contains(@id, 'unit68-requestTabMain')]//span[text() = 'Категорія звернення:']")
	private WebElement inputClaimCategory;
	//Third item of Type of Claim
	@FindBy (xpath = "//div[contains(@id, 'treepanel')]//span[contains(., 'З питань надання правової допомоги')]") 
	private WebElement itemClaimCategory;
	
	
	/*------------------Methods of Claim Page---------------------------------------------------------------------------*/

	/*
	 * Determines loading of Page
	 */
	public Unit6ClaimsPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit6));
		return this;
	}
	
	//Click on "Edit" button for the first record in the main grid
	public void clickButtonEditCardUnit6() {
		for (int i=0; i<3; ++i) {
			try{
				wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[1]//td[14]/div/img")));
				buttonEdit.click();
				break;
			}catch (WebDriverException e) {
				System.out.println("exception");
			}
		}
	}
	
	//Removing Card with getting registration number of the card that will be removed
	public void removeCardFromGridUnit6(Unit6Card unit6Card){
		buttonRemove.click();
		unit6Card.regNumberRemovedCard = super.confirmationOfRemoving();
	}
	
	//Restoring card with getting registration number of the card that will be restored
	public void restoreCardFromGridUnit6(Unit6Card unit6Card) {
		buttonRestore.click();
		unit6Card.regNumberRestoredCard = confirmRestoring();
	}
	
	/*------------------------------Methods of Claim Card------------------------------------------------*/
	
	//Setting the new card with filling all fields in
	public Unit6ClaimsPage setCardUnit6(Unit6Card unit6Card){
		type(inputClaimNumber, unit6Card.claimNumber);
		inputClaimType.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[contains(., 'Первинне')]"))).click();
		inputApplicantForm.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'boundlist')]//li[contains(., 'Фізична особа')]"))).click();
		clickButtonAddFacts();
		setApplicantFacts(unit6Card);
		clickButtonAddApplicantInForm();
		type(inputSummary, unit6Card.summary);
		type(inputReceivingProsecutorDate, unit6Card.receivingProsecutorDate);
		inputArrowEstablishInUnit.click();
		wait.until(presenceOfElementLocated(By.xpath("//div[contains(@id, 'boundlist')]//tr[2]/td[1]/div"))).click();
		inputClaimCategory.click();
		wait.until(presenceOfElementLocated(By.xpath("//div[contains(@id, 'treepanel')]//span[contains(., 'З питань надання правової допомоги')]"))).click();
		return this;
	}
	
	private void clickButtonAddFacts() {
		buttonAddFacts.click();
	}
	
	//Adding a record into grid "Відомості про заявника, підписанта організації заявника та про співскаржників"
	private Unit6ClaimsPage setApplicantFacts(Unit6Card claimCard) {
		inputApplicantFormGrid.click();
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'unit68-request-as-applicantCard')]/following-sibling::div[2]/div[contains(@id, 'boundlist')]//li[contains(.,'Фізична особа')]"))).click();
		inputApplicantType.click();
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@id, 'unit68-request-as-applicantCard')]/following-sibling::div[4]//ul[contains(@id, 'boundlist')]//li[contains(.,'Заявник')]"))).click();
		//inputApplicantName.click();
		//inputApplicantName.sendKeys(claimCard.applicantName);
		type(inputApplicantName, claimCard.applicantName);
		return this;
	}
	
	private void clickButtonAddApplicantInForm() {
		buttonAddApplicantInForm.click();
	}
			
	//Getting value from input-field "Claim Number" in formerly created card
	public String getInputClaimNumberUnit6() {
		return inputClaimNumber.getAttribute("value");
	}
	
	//Editing SOME field ("Summary" ("Стислий зміст"))
	public void setInputSummaryUnit6(String someText){
		type(inputSummary, someText);
	}
	
	//Getting existing value from input-field ("Summary" ("Стислий зміст"))
	public String getInputSummaryUnit6() {
		return inputSummary.getAttribute("value");
	}
	
}
