package WebPages;

import InterFaces.ClassObjects;
import Utility.ITestListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestSetup extends ITestListener implements ClassObjects  {
    public static WebDriver driver;
    public String baseURL = "https://gnews.io/";

    public TestSetup(){
        PageFactory.initElements(driver,this);
    }

    @BeforeSuite(enabled = true)
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @AfterSuite(enabled = true)
    public void tearDown(){
        driver.quit();
    }
}
