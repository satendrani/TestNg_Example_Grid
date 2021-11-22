import com.util.JiraPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class GridDemo_GoogleHomePageTest {

    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

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
    public void test_1() throws MalformedURLException, InterruptedException {
        System.out.println("Test1... started");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "sanity")
    public void test_2() throws MalformedURLException, InterruptedException {
        System.out.println("Test2...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "sanity")
    public void test_3() throws MalformedURLException, InterruptedException {
        System.out.println("Test3...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "sanity")
    public void test_4() throws MalformedURLException, InterruptedException {
        System.out.println("Test4...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");
        driver.quit();
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "sanity")
    public void test_5() throws MalformedURLException, InterruptedException {
        System.out.println("Test5...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Google");

        driver.quit();
//        Assert.assertEquals("Ram", "Shyam");
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test(enabled = true, groups = "regression")
    public void runOnSauceLabs() throws MalformedURLException, InterruptedException {
        System.out.println("Sauce Lab test... started");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platform", "Windows 10");
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("version", "96");
        capabilities.setCapability("name", "LinkedinLoginTest");
        capabilities.setCapability("extendedDebugging", "true");

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);

//        driver = new RemoteWebDriver(new URL(URL_), capabilities);
//        System.setProperty("webdriver.chrome.driver", projectPath+"/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.linkedin.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        driver.findElement(By.name("session_key")).sendKeys("satendra@gmail.com");
        driver.findElement(By.name("session_password")).sendKeys("ndskjiGskjfrm");
        driver.findElement(By.name("session_password")).sendKeys(Keys.ENTER);
        System.out.println("Title of the page is " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Security Verification | LinkedIn");

        driver.quit();
        System.out.println("Sauce Lab test... ended");
    }


    @AfterSuite
    public void teardown() {
        System.out.println("tear down");
//        driver.quit();
    }
}
