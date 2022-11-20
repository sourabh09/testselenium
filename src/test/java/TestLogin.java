import WebPages.TestSetup;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static Utility.Utility.getJsonValue;

public class TestLogin extends TestSetup {

 /*   @DataProvider(name = "valid_credentials_provider")
    public Object[][] validData(){
         return new Object[][] {{"mike9890@mailinator.com","Mike123"}};
    }

    @DataProvider(name = "invalid_credentials_provider")
    public Object[][] invalidData(){
        return new Object[][] {{"mike9890@mailinator.com","Tests123"}};
    }*/

    public String username = getJsonValue("validUsername");
    public String validpassword = getJsonValue("validPassword");

    @Test(description = "Testing login functionality with valid credentials")
    public void testLoginFunctionalityWithValidCredentials(){
      loginpage.loginFunctionality();
    }

}
