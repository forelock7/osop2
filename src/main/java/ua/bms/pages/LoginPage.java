package ua.bms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.model.User;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class LoginPage extends AnyPage {
	
	public LoginPage(PageManager pages) {
		super(pages);
	}

/*------------------The Web-Elements of the page------------------------------------------------------*/	
	
	//Input field "Login" ("Логін")
	@FindBy(name = "username")
	private WebElement fieldUsername;
	
	//Input field "Password" ("Пароль")
	@FindBy(name = "password")
	private WebElement fieldPassword;
	
	//Button "LogIn" ("Увійти в систему")
	@FindBy(xpath = "//div[3]/input")
	private WebElement buttonLogin;
	
	//Heading "LOGIN" ("ВХІД ДО СИСТЕМИ") of login page
	@FindBy(xpath = "//body//h2")
	private WebElement linkLogIn;
	
/*------------------Methods---------------------------------------------------------------------------*/
	
	public LoginPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(presenceOfElementLocated(By.xpath("//body//h2")));
		return this;
	}
	
	public LoginPage setLoginForm(User user) {
		type(fieldUsername, user.login);
		type(fieldPassword, user.password);
		return this;
	}
	
	public void clickSubmitButton() {
		buttonLogin.click();
	}
	
	
}
	//Setting login form by login and password
	/*public TopNavigationPage loginAs(User user) {
		type(fieldUsername, user.login);
		type(fieldPassword, user.password);
		buttonLogin.click();
		return PageFactory.initElements(driver, TopNavigationPage.class);
	}*/
	
	//Checking if user is logged out of system(have to exist the title "ВХІД ДО СИСТЕМИ" on Login Page)
	/*public boolean isLoggedOut() {
		
		if (isElementPresent(linkLogIn)) {
			return true;
		}
		else {
			return false;
		}*/
	

	/*
	//Accepting alert "Invalid password or username" ("Невірний пароль або логін") after failed login or password
	public void acceptFailedLoginAlert() {
		Alert faildLoginAlert = driver.switchTo().alert();
		faildLoginAlert.accept();
	}*/



