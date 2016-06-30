package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrativeViolationsPage extends Page {
	
	public AdministrativeViolationsPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(xpath = ".//*[@id='unit9-crimeSearch-1114_header-title-textEl']/div[1]")
	public WebElement titleAV;


	@Override
	public void open() {
	
			
	}
}
