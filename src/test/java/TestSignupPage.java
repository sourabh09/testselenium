import WebPages.TestSetup;
import org.testng.annotations.Test;

public class TestSignupPage extends TestSetup {
    @Test
    public void verifySignupPage(){
        homepage.verifyStartForFreeBtn();
        signuppage.verifySignUpHeading();
        signuppage.verifyAlreadyHaveAccountLoginLink();
        loginpage.verifyLoginPageTitle();
    }
}
