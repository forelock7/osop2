package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
 * Declare all Web-elements on Side Navigation Page in Unit 5 "Supervision of the observance of laws in the execution of judgments."
 * (бокове меню розділу "Нагляд за додержанням законів при виконанні судових рішень.")
 * and the main methods with them.
 * 
 * There are to item of menu:
 * 1 - "List Inspections"("Перелік перевірок");
 * 2 - "List of Response Documents"("Перелік документів реагування");
 * 3 - "List of Charged Person"("Перелік осіб, притягнутих до відповідальності").
 */
public class NavigationUnit5Page extends AnyPage {
	
	/*Constructor of this Page object which is managed by object Page Manager.*/
	public NavigationUnit5Page(PageManager pages) {
		super(pages);
	}
	
	/*Ensures page loading according to existence of Heading*/
	public NavigationUnit5Page ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(titleUnit5));
		return this;
	}
	
	/*-------------------The Web-Elements of Main Page----------------------------------------------------*/

	//Title "Supervision of the observance of laws in the execution of judgments." ("Нагляд за додержанням законів при виконанні судових рішень")
	@FindBy(xpath = "//div[contains(@id, 'unit5Menu')]//div[contains(., 'Нагляд за додержанням законів при виконанні судових рішень')]")
	private WebElement titleUnit5;
	
	//Section of menu "Supervision of the observance of laws in the execution of judgments." - Unit 5 "List Inspections"(Розділ 5 "Перелік перевірок")
	@FindBy (xpath = "//div[contains(@id, 'unit5Menu')]//span[contains(text(), 'Перелік перевірок')]")
	private WebElement itemInspectionMenuU5;
	
	//Section of menu "Supervision of the observance of laws in the execution of judgments." - Unit 5 "List of Response Documents"(Розділ 5 "Перелік документів реагування")
	@FindBy (xpath = "//div[contains(@id, 'unit5Menu')]//span[contains(text(), 'Перелік документів реагування')]")
	private WebElement itemResponsesMenuU5;
	
	//Section of menu "Supervision of the observance of laws in the execution of judgments." - Unit 5 "List of Charged Person"(Розділ 5 "Перелік осіб, притягнутих до відповідальності")
	@FindBy (xpath = "//div[contains(@id, 'unit5Menu')]//span[contains(., 'Перелік осіб')]")
	private WebElement itemChargedMenuU5;
	
	/*------------------Methods---------------------------------------------------------------------------*/
	
	//U5 - Moving from "Navigation Page in Unit 5" to Unit 5 "List Inspections" page
	public Unit5InspectionsPage moveToUnit5InspectionPage(){
		itemInspectionMenuU5.click();
		return pages.unit5InspectionsPage;
	}
	
	//U5 - Moving from "Navigation Page in Unit 5" to Unit 5 "List of Response Documents" page
	public Unit5DocumentsPage moveToUnit5DocumentPage(){
		itemResponsesMenuU5.click();
		return pages.unit5DocumentsPage;
	}
	
	//U5 - Moving from "Navigation Page in Unit 5" to Unit 5 "List of Charged Person" page
	public Unit5ChargedPage moveToUnit5ChargedPage(){
		itemChargedMenuU5.click();
		return pages.unit5ChargedPage;
	}

}
