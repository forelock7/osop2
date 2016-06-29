package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ua.bms.data.UserData;
import ua.bms.utils.ConfigProperties;

public class LoginPage extends Page {
	
	@FindBy(name = "username")
	public WebElement fieldUsername;
	
	@FindBy(name = "password")
	public WebElement fieldPassword;
	
	@FindBy(xpath = "html/body/div/form/div[3]/input")
	public WebElement buttonLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage loginAs(UserData admin) {
		type(fieldUsername, admin.name);
		type(fieldPassword, admin.password);
		buttonLogin.click();
	}
	
	@Override
	public void open() {
		driver.get(ConfigProperties.getProperty("login.url"));
	}

}
