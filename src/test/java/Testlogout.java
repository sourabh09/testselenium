import WebPages.TestSetup;
import org.testng.annotations.Test;

public class Testlogout extends TestSetup {

    @Test(description = "Verify logout functionality from app")
    public void verifyLogoutFunctionality(){
        loginpage.loginFunctionality();
        dashboardpage.verifyLogoutBtn();
        homepage.verifyLoginBtn();
    }
}
