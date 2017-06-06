package ua.bms.osop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.bms.osop.model.UserModel;

/**
 * Created by VChubenko on 31.05.2017.
 */
public class UserProfileCard extends AnyPage {

    /*
            * Constructor of this Page object which is managed by object Page Manager.
	 */
    public UserProfileCard(PageManager pages) {
        super(pages);
    }

	/*------------------The Web-Elements of the Pre-Investigation Act Card------------------------------------------------------*/

	//Title of User Profile Card
    @FindBy(xpath = "//div[contains(@id, 'header-title-text')]//div[contains(., 'користувача')]")
    private WebElement titleUserProfileCard;

    //Field "Login" ("Логін")
    @FindBy(xpath = "//div[contains(@id, 'administration-userTabMain')]//label[contains(., 'Логін')]/following-sibling::div//input")
    private WebElement inputLogin;

    //Field "Last Name" (Прізвище)
    @FindBy(xpath = "//div[contains(@id, 'administration-userTabMain')]//label[contains(., 'Прізвище')]/following-sibling::div//input")
    private WebElement inputLastName;

    //Field "First Name" (Ім'я)
    @FindBy(xpath = "//div[contains(@id, 'administration-userTabMain')]//label[contains(., 'Ім')]/following-sibling::div//input")
    private WebElement inputFirstName;

    //Field "Middle Name" (По батькові)
    @FindBy(xpath = "//div[contains(@id, 'administration-userTabMain')]//label[contains(., 'батькові')]/following-sibling::div//input")
    private WebElement inputMiddleName;

    //Field "Public prosecution office" (Прокуратура)
    @FindBy(xpath = "//div[contains(@id, 'administration-userTabMain')]//label[contains(., 'Прокуратура')]/following-sibling::div//a")
    private WebElement inputProsecutionOffice;
    //First item of list
    @FindBy (xpath = "//div[contains(@id, 'listcombowindow')]//table[1]//tr/td[4]")
    private WebElement itemProsecutionOffice;

    //Field "Subdivision" (Підрозділ)
    @FindBy(xpath = "//div[contains(@id, 'administration-userTabMain')]//label[contains(., 'Підрозділ')]/following-sibling::div//a")
    private WebElement inputSubdivision;
    //First item of list
    @FindBy (xpath = "//div[contains(@id, 'listcombowindow')]//table[1]//tr/td[5]")
    private WebElement itemSubdivision;

    //Field "Post" (Посада)
    @FindBy(xpath = "//div[contains(@id, 'administration-userTabMain')]//label[contains(., 'Посада')]/following-sibling::div//a")
    private WebElement inputPost;
    //First item of list
    @FindBy (xpath = "//div[contains(@id, 'listcombowindow')]//table[1]//tr/td[4]")
    private WebElement itemPost;

    //Field "Role" (Роль)
    @FindBy(xpath = "//div[contains(@id, 'administration-userTabMain')]//label[contains(., 'Роль')]/following-sibling::div//input")
    private WebElement inputRole;
    @FindBy (xpath = "//div[contains(@id, 'boundlist')]//li[1]")
    private WebElement itemRole;

    //Field "E-mail"
    @FindBy(xpath = "//div[contains(@id, 'administration-userTabMain')]//label[contains(., 'E-mail')]/following-sibling::div//input")
    private WebElement inputEmail;


    /*------------------Methods of Act of Prevetive Card-------------------------------------------------------------*/

    public UserProfileCard enterLogin(UserModel userModel) {
        type(inputLogin, userModel.getLogin());
        return this;
    }

    public UserProfileCard enterLastName(UserModel userModel) {
        type(inputLastName, userModel.getLastName());
        return this;
    }

    public UserProfileCard enterFirstName(UserModel userModel) {
        type(inputFirstName, userModel.getFirstName());
        return this;
    }

    public UserProfileCard enterMiddleName(UserModel userModel) {
        type(inputMiddleName, userModel.getMiddleName());
        return this;
    }

    public UserProfileCard enterProsecutionOffice(UserModel userModel) {
        inputProsecutionOffice.click();
        fluientWaitforElement(itemProsecutionOffice).click();
        return this;
    }

    public UserProfileCard enterSubdivision(UserModel userModel) {
        inputSubdivision.click();
        fluientWaitforElement(itemSubdivision).click();
        return this;
    }

    public UserProfileCard enterPost(UserModel userModel) {
        inputPost.click();
        fluientWaitforElement(itemPost).click();
        return this;
    }

    public UserProfileCard enterRole(UserModel userModel) {
        inputRole.click();
        fluientWaitforElement(itemRole).click();
        inputRole.click();
        return this;
    }

    public UserProfileCard enterEmail(UserModel userModel) {
        type(inputEmail, userModel.getEmail());
        return this;
    }


    public String getInputLogin() {
        return inputLogin.getAttribute("value");
    }
}
