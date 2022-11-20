package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Utility.Utility.*;

public class leftMenuTabs extends  TestSetup{

@FindBy(xpath = "//div[@class='sidebar-wrapper']//p[contains(text(),'User Profile')]")
    public WebElement userProfileTab;


public void verifyUserProfileTab(){
    clickOnElement(userProfileTab);
}

}
