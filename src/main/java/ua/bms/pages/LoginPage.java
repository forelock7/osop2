package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	public HomePage loginAs(UserData user) {
		type(fieldUsername, user.login);
		type(fieldPassword, user.password);
		buttonLogin.click();
		return PageFactory.initElements(driver, HomePage.class);
	}
	
	@Override
	public void open() {
		driver.get(ConfigProperties.getProperty("login.url"));
	}

}
