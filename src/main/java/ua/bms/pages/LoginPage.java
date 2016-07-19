package ua.bms.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ua.bms.data.UserData;
import ua.bms.utils.ConfigProperties;

public class LoginPage extends Page {
	
	//Input field "Логін"
	@FindBy(name = "username")
	public WebElement fieldUsername;
	
	//Input field "Пароль"
	@FindBy(name = "password")
	public WebElement fieldPassword;
	
	//Button "Увійти в систему"
	@FindBy(xpath = "html/body/div/form/div[3]/input")
	public WebElement buttonLogin;
	
	//
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	public HomePage loginAs(UserData user) {
		type(fieldUsername, user.login);
		type(fieldPassword, user.password);
		buttonLogin.click();
		return PageFactory.initElements(driver, HomePage.class);
	}
	
	//Putting the url into browser
	@Override
	public void open() {
		driver.get(ConfigProperties.getProperty("login.url"));
	}

}
