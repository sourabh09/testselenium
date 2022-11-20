import WebPages.TestSetup;
import org.testng.annotations.Test;

public class TestEditProfile extends TestSetup {


@Test(description = "Verify user should able to see email address pre filled on edit profile page")
public void testEmailAddressEditProfile(){
loginpage.loginFunctionality();
leftmenutabs.verifyUserProfileTab();
editprofilepage.verifyEmailAddressField();
dashboardpage.verifyLogoutBtn();
}

}
