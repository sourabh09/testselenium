import WebPages.TestSetup;
import org.testng.annotations.Test;

public class TestHomePage extends TestSetup {

    @Test
    public void testHomePage(){

        homepage.verifyPageTitle();
        homepage.verifyFreePlanIcon();
        homepage.verifyPageTitle();
        homepage.verifyStartForFreeBtn();
        signuppage.verifySignUpHeading();

    }
}

