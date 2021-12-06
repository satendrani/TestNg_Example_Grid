package pages;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.logs.JSErrorLogs;
import utils.logs.Log;

public class LoginPage extends BasePage {
    /**
     * Constructor
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Web Elements
     */
    By userNameId = By.xpath("//form/div/input[@type=\"text\"]");
    By passwordId = By.xpath("//form/div/input[@type=\"password\"]");
    By loginButtonId = By.xpath("//button[@type=\"submit\"]/div");
    By errorMessageUsernameXpath = By.xpath("//div/span/span[text()=\"Please enter valid Email ID/Mobile number\"]");
    By errorMessagePasswordXpath = By.xpath("//span[text()='Please enter Password']");

    /**
     * Page Methods
     */
    public LoginPage loginToN11(String username, String password) {
        Log.info("Trying to login the N11.");
        writeText(userNameId, username);
        writeText(passwordId, password);
        click(loginButtonId);
        return this;
    }

    //Verify Username Condition
    public LoginPage verifyLoginUserName(String expectedText) {
        Log.info("Verifying login username.");
        waitVisibility(errorMessageUsernameXpath);
        assertEquals(readText(errorMessageUsernameXpath), expectedText);
        return this;
    }

    //Verify Password Condition
    public LoginPage verifyLoginPassword(String expectedText) {
        Log.info("Verifying login password.");
        waitVisibility(errorMessagePasswordXpath);
        assertEquals(readText(errorMessagePasswordXpath), expectedText);
        return this;
    }

    //Verify Password Condition
    public LoginPage verifyLogError() {
        Log.info("Verifying javascript login errors.");
        assertTrue(JSErrorLogs.isLoginErrorLog(driver));
        return this;
    }
}