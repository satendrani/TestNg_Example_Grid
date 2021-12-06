package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.jiraaccess.JiraPolicy;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import static utils.extentreports.ExtentTestManager.startTest;

public class GridDemo_GoogleHomePageTest extends BaseTest {

    public static String USER_NAME = "oauth-satendrani-63d14";
    public static String ACCESS_KEY = "b878f0fb-41b1-4359-a133-81aedfdfcdcd";
    public static String URL_ = "https://" + USER_NAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

    @BeforeSuite
    public void setup() throws IOException, InterruptedException {
        System.out.println("making a setup");
        Runtime.getRuntime().exec(projectPath + "/resources/gridsetup/hub.bat");
        Thread.sleep(5000);
        Runtime.getRuntime().exec(projectPath + "/resources/gridsetup/node.bat");
        Thread.sleep(5000);
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "sanity")
    public void test_1(Method method) throws MalformedURLException, InterruptedException {
        startTest(method.getName(), "validate test_1");
        System.out.println("Test1... started");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");

        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "sanity")
    public void test_2(Method method) throws MalformedURLException, InterruptedException {
        startTest(method.getName(), "validate test_2");
        System.out.println("Test2...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Google");

        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "sanity")
    public void test_3(Method method) throws MalformedURLException, InterruptedException {
        startTest(method.getName(), "validate test_3");
        System.out.println("Test3...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");

        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "sanity")
    public void test_4(Method method) throws MalformedURLException, InterruptedException {
        startTest(method.getName(), "validate test_4");
        System.out.println("Test4...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");

        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "sanity")
    public void test_5(Method method) throws MalformedURLException, InterruptedException {
        startTest(method.getName(), "validate test_5");
        System.out.println("Test5...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");

//        Assert.assertEquals("Ram", "Shyam");
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "regression")
    public void runOnSauceLabs(Method method) throws MalformedURLException, InterruptedException {
        //ExtentReports Description
        startTest(method.getName(), "Sauce Lab test");
        System.out.println("Sauce Lab test... started");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "96");
        capabilities.setCapability("name", "LinkedinLoginTest");
        capabilities.setCapability("extendedDebugging", "true");

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);

//        DriverConfiguration = new RemoteWebDriver(new URL(URL_), capabilities);
//        System.setProperty("webdriver.chrome.DriverConfiguration", projectPath+"/resources/drivers/chromedriver.exe");
//        DriverConfiguration = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.linkedin.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        driver.findElement(By.name("session_key")).sendKeys("satendra@gmail.com");
        driver.findElement(By.name("session_password")).sendKeys("ndskjiGskjfrm");
        driver.findElement(By.name("session_password")).sendKeys(Keys.ENTER);
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Security Verification | LinkedIn");


        System.out.println("Sauce Lab test... ended");
    }

    @AfterSuite
    public void teardown() {
        System.out.println("tear down");
//        DriverConfiguration.quit();
    }
}
