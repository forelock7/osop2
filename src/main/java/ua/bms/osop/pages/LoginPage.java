package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.User;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class LoginPage extends AnyPage {
	
	public LoginPage(PageManager pages) {
		super(pages);
	}

/*------------------The Web-Elements of the page------------------------------------------------------*/	
	
	//Input field "Login" ("Логін")
	@FindBy(name = "username")
	private WebElement inputUsername;
	
	//Input field "Password" ("Пароль")
	@FindBy(name = "password")
	private WebElement inputPassword;
	
	//Button "LogIn" ("Увійти в систему")
	@FindBy(xpath = "//div[3]/input")
	private WebElement buttonLogin;
	
	//Heading "LOGIN" ("ВХІД ДО СИСТЕМИ") of login page
	@FindBy(xpath = "//body//h2")
	private WebElement linkLogIn;
	
/*------------------Methods---------------------------------------------------------------------------*/
	
	//ensuring page loading according to existence of Heading h2
	public LoginPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(linkLogIn));
		return this;
	}
	
	//filling Login Form in
	public LoginPage setLoginForm(User user) {
		type(inputUsername, user.login);
		type(inputPassword, user.password);
		return this;
	}
	
	//Clicking on button "LogIn" ("Увійти в систему")
	public void clickButtonSubmit() {
		buttonLogin.click();
	}
	
	//Accepting alert "Invalid password or username" ("Невірний пароль або логін") after failed login or password
	public void acceptFailedLoginAlert(){
		wait.until(alertIsPresent()).accept();
		//Alert faildLoginAlert = driver.switchTo().alert();
		//faildLoginAlert.accept();
	}

}

	





