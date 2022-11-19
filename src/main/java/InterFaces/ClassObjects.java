package InterFaces;

import Utility.Utility;
import WebPages.DashboardPage;
import WebPages.HomePage;
import WebPages.LoginPage;
import WebPages.SignupPage;

public interface ClassObjects {
    HomePage homepage = new HomePage();
    Utility utility = new Utility();
    SignupPage signuppage = new SignupPage();
    LoginPage loginpage = new LoginPage();
    DashboardPage dashboardpage = new DashboardPage();

}
