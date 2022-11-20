package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import static Utility.Utility.*;


public class HomePage extends TestSetup {

    @FindBy(xpath = "//h6[contains(text(),'Free')]/preceding::img[1]")
    public WebElement freePlanIcon;

    @FindBy(xpath = "//h6[contains(text(),'Free')]")
    public WebElement freeTitle;

    @FindBy(xpath = "//a[contains(text(), 'Start for free')]")
    public WebElement startForFreeBtn;

    @FindBy(css = ".btn-inner--icon")
    public WebElement loginBtn;

    public void verifyPageTitle() {
        Assert.assertEquals(getPageTitle(), getJsonValue("homePageTitle"));
    }

    public void verifyFreePlanIcon() {
        elementIsPresent(freePlanIcon);
    }

    public void verifyFreeTitle() {
        elementIsPresent(freeTitle);
    }

    public void verifyStartForFreeBtn() {
        clickOnElement(startForFreeBtn);
    }

    public void verifyLoginBtn() {
        clickOnElement(loginBtn);
    }



}
