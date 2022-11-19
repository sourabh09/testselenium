package WebPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Utility.Utility.*;

public class SignupPage extends TestSetup{

    @FindBy(tagName = "h1")
    public WebElement signUpHeading;

    @FindBy(xpath = "//a[contains(text(), 'Have an acount? Log in')]")
    public WebElement alreadyHaveAccountLoginLink;

    public void verifySignUpHeading(){
        elementIsPresent(signUpHeading);
    }

    public void verifyAlreadyHaveAccountLoginLink(){
        clickOnElement(alreadyHaveAccountLoginLink);
    }

}
