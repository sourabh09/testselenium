import WebPages.TestSetup;
import org.testng.annotations.Test;

public class TestDashboardPage extends TestSetup {

    @Test
    public void verifyAllLinksOnDashboard(){
        loginpage.loginFunctionality();
        dashboardpage.verifyDashboardTitle();
    }
}
