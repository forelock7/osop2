package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on Navigation Unit 1 Page (side Menu)
 * Unit 1 "Presentetion" ("Представництво")
 * and the main methods with them
 * 
 * There are fives items of menu:
 * 1 - "Review proceedings on a claim"("НП за позовом");
 * 2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
 * 3 - "Started Crime Proceedings"("Розпочато кримінальних проваджень");
 * 4 - "Viewing of claims, statements"("Перегляд позовів, заяв");
 * 5 - "Viewing of claims to Procuracy authorities"("Перегляд позовів до органів прокуратури");
 */
public class NavigationUnit1Page extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public NavigationUnit1Page(PageManager pages) {
		super(pages);
	}
	
	/*-------------------The Web-Elements of Navigation Unit1 Page----------------------------------------------------*/
	
	//Title "Representation" ("Представництво")
	@FindBy(xpath = "//div[contains(@id, 'unit1Menu')]//div[contains(., 'Представництво')]")
	private WebElement titleUnit1;
	
	//Section of menu "Presentetion" (Unit 1) -  1 - "Review proceedings on a claim"("НП за позовом");
	@FindBy (xpath = "//div[contains(@id, 'unit1Menu')]/div[1]//span")
	private WebElement itemReviewMenuU1;
	
	//Section of menu "Presentetion" (Unit 1) -  2 - "Review proceedings on a claim to Procuracy authorities"("НП за позовом до органів прокуратури");
	@FindBy (xpath = "//div[contains(@id, 'unit1Menu')]/div[3]//span")
	private WebElement itemReviewToPrcMenuU1;
	
	//Section of menu "Presentetion" (Unit 1) -  3 - "Started Crime Proceedings"("Розпочато кримінальних проваджень");
	@FindBy (xpath = "//div[contains(@id, 'unit1Menu')]/div[5]//span")
	private WebElement itemCrimeMenuU1;
	
	//Section of menu "Presentetion" (Unit 1) -  4 - "Viewing of claims, statements"("Перегляд позовів, заяв");
	@FindBy (xpath = "//div[contains(@id, 'unit1Menu')]/div[7]//span")
	private WebElement itemClaimsMenuU1;
	
	//Section of menu "Presentetion" (Unit 1) -  5 - "Viewing of claims to Procuracy authorities"("Перегляд позовів, заяв до органів прокуратури");
	@FindBy (xpath = "//div[contains(@id, 'unit1Menu')]/div[9]//span")
	private WebElement itemClaimsToPrcMenuU1;
	
	/*------------------Methods of Navigation Unit1 Page-------------------------------------------------------------*/
	
	/*
	 * Determines loading of Page
	 */
	public NavigationUnit1Page ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit1));
		return this;
	}
	
	//Goes from "Navigation Page in Unit 1" to Unit 1 "Review proceedings on a claim" page
	public Unit1ReviewPage clickReviewMenuItem(){
		itemReviewMenuU1.click();
		return pages.unit1ReviewPage;
	}
	
	//Goes from "Navigation Page in Unit 1" to Unit 1 "Review proceedings on a claim to Procuracy authorities" page
	public Unit1ReviewToPrcPage clickReviewToPrcMenuItem(){
		itemReviewToPrcMenuU1.click();
		return pages.unit1ReviewToPrcPage;
	}
	
	//Goes from "Navigation Page in Unit 1" to Unit 1 "Started Crime Proceedings" page
	public Unit1CrimePage clickCrimeMenuItem(){
		itemCrimeMenuU1.click();
		return pages.unit1CrimePage;
	}
	
	//Goes from "Navigation Page in Unit 1" to Unit 1 "Viewing of claims, statements" page
	public Unit1ClaimsPage clickClaimsMenuItem(){
		itemClaimsMenuU1.click();
		return pages.unit1ClaimsPage;
	}
	
	//Goes from "Navigation Page in Unit 1" to Unit 1 "Viewing of claims to Procuracy authorities" page
	public Unit1ClaimsToPrcPage clickClaimsToPrcMenuItem(){
		itemClaimsToPrcMenuU1.click();
		return pages.unit1ClaimsToPrcPage;
	}

	
}
