package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on Side Navigation Page in Unit 6, 8 "Consideration of claims and requests"
 * (бокове меню розділу "Розгляд звернень та запитів")
 * and the main methods with them.
 * 
 * There are to item of menu:
 * 1 - Claims(Звернення);
 * 2 - Requests(Запити).
 */
public class NavigationUnits68Page extends AnyPage {
	
	/*Constructor of this Page object which is managed by object Page Manager.*/
	public NavigationUnits68Page(PageManager pages) {
		super(pages);
	}
	
	/*Ensures page loading according to existence of Heading h2*/
	public NavigationUnits68Page ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit68));
		return this;
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "Consideration of Claims and Requests" ("Розгляд звернень та запитів")
	@FindBy(xpath = "//div[contains(@id, 'unit68Menu')]//div[contains(., 'Розгляд звернень та запитів')]")
	private WebElement titleUnit68;
	
	//Section of menu "Consideration of Claims and Requests" - Unit 6 "Claims"(Розділ 6 "Звернення")
	@FindBy (xpath = "//div[contains(@id, 'unit68Menu')]//span[contains(text(), 'Звернення')]")
	private WebElement itemMenuU6;
	
	//Section of menu "Consideration of Claims and Requests" - Unit 8 "Claims"(Розділ 8 "Запити")
	@FindBy (xpath = "//div[contains(@id, 'unit68Menu')]//span[contains(text(), 'Запити')]")
	private WebElement itemMenuU8;
	
	/*------------------Methods---------------------------------------------------------------------------*/
	
	//U6 - Moving from "Navigation Page of Units 6 and 8" to Unit 6 "Claims" page
	public Unit6ClaimPage clickUnit6MenuItem(){
		itemMenuU6.click();
		return pages.unit6ClaimPage;
	}
	
	//U8 - Moving from "Navigation Page of Units 6 and 8" to Unit 8 "Requests" page
	public Unit8RequestPage clickUnit8MenuItem(){
		itemMenuU8.click();
		return pages.unit8RequestPage;
	}

}
