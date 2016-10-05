package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ua.bms.osop.model.UserModel;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

/*
 * Declare all Web-elements on Login Page and the main methods with them
 */
public class LoginPage extends AnyPage {
	
	/*
	 * Constructor of this Page object which is managed by object Page Manager.
	 */
	public LoginPage(PageManager pages) {
		super(pages);
	}
	
	//Ensures page loading according to existence of Heading h2
	public LoginPage ensurePageLoaded() {
		super.ensurePageLoaded();
		wait.until(ExpectedConditions.visibilityOf(linkLogIn));
		return this;
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
	
	//Fills Login Form in
	public LoginPage setLoginForm(UserModel userModel) {
		type(inputUsername, userModel.getLogin());
		type(inputPassword, userModel.getPassword());
		return this;
	}
	
	//Clicks on button "LogIn" ("Увійти в систему")
	public void clickButtonSubmit() {
		buttonLogin.click();
	}
	
	//Accepts alert "Invalid password or username" ("Невірний пароль або логін") after failed login or password
	public void acceptFailedLoginAlert(){
		wait.until(alertIsPresent()).accept();
		//Alert faildLoginAlert = driver.switchTo().alert();
		//faildLoginAlert.accept();
	}

}

	





