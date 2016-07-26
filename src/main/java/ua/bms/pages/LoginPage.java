package ua.bms.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ua.bms.data.UserData;
import ua.bms.utils.ConfigProperties;

public class LoginPage extends Page {
	
	//Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}

/*------------------The Web-Elements of the page------------------------------------------------------*/	
	
	//Input field "Логін"
	@FindBy(name = "username")
	private WebElement fieldUsername;
	
	//Input field "Пароль"
	@FindBy(name = "password")
	private WebElement fieldPassword;
	
	//Button "Увійти в систему"
	@FindBy(xpath = "//div[3]/input")
	private WebElement buttonLogin;
	
	//Heading "ВХІД ДО СИСТЕМИ" of login page
	@FindBy(xpath = "//body//h2")
	private WebElement linkLogIn;
	
/*------------------Methods---------------------------------------------------------------------------*/
		
	//Setting login form by login and password
	public HomePage loginAs(UserData user) {
		type(fieldUsername, user.login);
		type(fieldPassword, user.password);
		buttonLogin.click();
		return PageFactory.initElements(driver, HomePage.class);
	}
	
	//Checking if user is logged out of system(have to exist the title "ВХІД ДО СИСТЕМИ" on Login Page)
	public boolean isLoggedOut() {
		if (isElementPresent(linkLogIn)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Putting the URL into browser
	@Override
	public void open() {
		driver.get(ConfigProperties.getProperty("login.url"));
	}
	
	//Accepting alert "Невірний пароль або логін" after failed login or password
	public void acceptFailedLoginAlert() {
		Alert faildLoginAlert = driver.switchTo().alert();
		faildLoginAlert.accept();
	}


}
