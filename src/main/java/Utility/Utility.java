package Utility;

import WebPages.TestSetup;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Utility extends TestSetup {

    public static void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static String getJsonValue(String value){
        String returnedValue = null;
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("TestData.json"));
            JSONObject jsonObject = (JSONObject) obj;
            returnedValue = (String) jsonObject.get(value);
        } catch (IOException | ClassCastException | ParseException e) {
            e.printStackTrace();
        }
        return returnedValue;
    }

    public static String getPageTitle(){
      return driver.getTitle();

    }

    public static void clickOnElement(WebElement element){
        waitForElement(element);
        element.click();
    }

    public static void elementIsPresent(WebElement element){
        waitForElement(element);
        element.isDisplayed();
    }

    public static void enterTextInField(WebElement element, String text){
        waitForElement(element);
        element.clear();
        element.sendKeys(text);
    }

    public static Boolean isElementEnabled(WebElement element){
        waitForElement(element);
        if(element.isEnabled()){
            return true;
        }
        return false;
    }


    public static void checkBrokenLinks(String url){
        try {
            URL url1 = new URL(url);
            HttpURLConnection huc = (HttpURLConnection) url1.openConnection();
            huc.setConnectTimeout(5000);
            huc.connect();

            //Assert.assertEquals(huc.getResponseCode(),400);
            if(huc.getResponseCode()>=400){
                System.out.println("Link is broken "+huc.getResponseCode());
            }else{
                System.out.println("Link is fine "+huc.getResponseCode());
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
