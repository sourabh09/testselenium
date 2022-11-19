import WebPages.TestSetup;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLoginPage extends TestSetup {

    @DataProvider(name = "valid_credentials_provider")
    public Object[][] validData(){
         return new Object[][] {{"mike9890@mailinator.com","Mike123"}};
    }

    @DataProvider(name = "invalid_credentials_provider")
    public Object[][] invalidData(){
        return new Object[][] {{"mike9890@mailinator.com","Tests123"}};
    }

    @Test(enabled = false)
    public void testLoginPageFunctionality(){
        homepage.verifyStartForFreeBtn();
    }

    @Test(description = "Testing login functionality with valid credentials",dataProvider = "valid_credentials_provider")
    public void testLoginFunctionalityWithValidCredentials(String username, String validpassword){
        loginpage.verifyEmailField(username);
        loginpage.verifyPasswordField(validpassword);
        loginpage.verifyLoginBtn();
        dashboardpage.verifyDashboardTitle();
    }

    @Test(description = "Testing login functionality with invalid credentials",dataProvider = "invalid_credentials_provider")
    public void testLoginFunctionalityWithInvalidCredentials(String username, String invalidpassword){
        homepage.verifyStartForFreeBtn();
        signuppage.verifyAlreadyHaveAccountLoginLink();
        loginpage.verifyEmailField(username);
        loginpage.verifyPasswordField(invalidpassword);
        loginpage.verifyLoginBtn();
        loginpage.verifyWrongCredentialsErrorMsg();

    }
}
