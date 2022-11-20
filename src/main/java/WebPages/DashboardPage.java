package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import static Utility.Utility.*;

public class DashboardPage extends TestSetup {
    @FindBy(xpath = "//a[contains(text(),'Dashboard')]")
    public WebElement dashboardTitle;

    @FindAll({
            @FindBy(xpath = "//a[@href]")
    })
    List<WebElement> dashboardLinks;

    @FindBy(xpath = "//button[@class='logout-btn btn-log-resp']")
    public WebElement logoutBtn;

    public void verifyDashboardTitle(){
        elementIsPresent(dashboardTitle);
    }

    public void verifyDashboardLinks(){

        for(int i=0;i<dashboardLinks.size();i++){
            WebElement E1 = dashboardLinks.get(i);
            String url = E1.getAttribute("href");
            System.out.println(url);
            checkBrokenLinks(url);
        }
    }

    public void generalMethod(){
       int[]number = new int[5];

        for(int i=number.length-1;i>=0;i--){
            System.out.println(number[i]);
        }
        }
        public void verifyLogoutBtn(){
        clickOnElement(logoutBtn);
    }
    }

