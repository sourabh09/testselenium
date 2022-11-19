package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static Utility.Utility.*;

public class LoginPage extends TestSetup {

    @FindBy(tagName = "h1")
    public WebElement loginPageTitle;

    @FindBy(id = "inputEmail")
    public WebElement emailField;

    @FindBy(id = "inputPassword")
    public WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(),'LOG IN')]")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[contains(text(),'Wrong email or password')]")
    public WebElement wrongCredentialsErrorMsg;

    @FindBy(xpath = "//span[contains(text(), 'Login')]")
    public WebElement homepageLoginBtn;

    public void verifyLoginPageTitle(){
        elementIsPresent(loginPageTitle);
    }

    public void verifyEmailField(String email){
        enterTextInField(emailField,email);
    }

    public void verifyPasswordField(String password){
        enterTextInField(passwordField,password);
    }

    public void verifyLoginBtn(){
        clickOnElement(loginBtn);
    }

    public void verifyWrongCredentialsErrorMsg(){
        elementIsPresent(wrongCredentialsErrorMsg);
    }

    public void verifyHomepageLoginBtn(){
        clickOnElement(homepageLoginBtn);
    }

    public void loginFunctionality(){
        verifyHomepageLoginBtn();
        String validUsername = getJsonValue("validUsername");
        String validPassword = getJsonValue("validPassword");
        enterTextInField(emailField,validUsername);
        enterTextInField(passwordField,validPassword);
        clickOnElement(loginBtn);

    }

}
