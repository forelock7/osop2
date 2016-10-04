package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Unit2ActPICard extends AnyPage {

	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public Unit2ActPICard(PageManager pages) {
		super(pages);
	}
	
	/*------------------The Web-Elements of the Pre-Investgation Act Card------------------------------------------------------*/
	
	//Input field "Type of Act" ("Вид акту")
	@FindBy(xpath = "//div[contains(@id, 'unit23-actDRTabMain')]//span[contains(., 'Вид акту')]")
	private WebElement inputActType;
	//First item of Type of Claim
	@FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[contains(., 'Звернення (запит) іноземних установ')]") 
	private WebElement itemActType;
	
	
}
