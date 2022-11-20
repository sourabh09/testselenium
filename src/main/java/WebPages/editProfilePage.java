package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Utility.Utility.*;

public class editProfilePage extends TestSetup {

    @FindBy(id = "email")
    public WebElement emailAddressField;

    public void verifyEmailAddressField(){

        elementIsPresent(emailAddressField);
    }
}
