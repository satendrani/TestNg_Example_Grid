package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.logs.Log;

public class HomePage extends BasePage {
    /**
     * Constructor
     */
    public HomePage(WebDriver driver) {
        super(driver);
    }

    /**
     * Variables
     */
    String baseURL = "https://www.flipkart.com/";

    /**
     * Web Elements
     */
    By signInButtonClass = By.xpath("//a[@href=\"/account/login?ret=/\"]");

    /**
     * Page Methods
     */
    //Go to Homepage
    public HomePage goToFlipkart() {
        Log.info("Opening Flipkart Website.");
        driver.get(baseURL);
        return this;
    }

    //Go to LoginPage
    public LoginPage goToLoginPage() {
        Log.info("Going to Login Page..");
        click(signInButtonClass);
        return new LoginPage(driver);
    }
}