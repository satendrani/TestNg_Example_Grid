import com.util.JiraPolicy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
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

    @BeforeSuite
    public void setup() throws IOException, InterruptedException {
        System.out.println("making a setup");
        Runtime.getRuntime().exec(projectPath + "/resources/gridsetup/hub.bat");
        Thread.sleep(5000);
        Runtime.getRuntime().exec(projectPath + "/resources/gridsetup/node.bat");
        Thread.sleep(5000);
    }

    @JiraPolicy(logTicketReady = true)
    @Test
    public void test_1() throws MalformedURLException, InterruptedException {
        System.out.println("Test1... started");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test
    public void test_2() throws MalformedURLException, InterruptedException {
        System.out.println("Test2...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());

        Thread.sleep(5000);
        driver.quit();
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test
    public void test_3() throws MalformedURLException, InterruptedException {
        System.out.println("Test3...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test
    public void test_4() throws MalformedURLException, InterruptedException {
        System.out.println("Test4...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
        System.out.println("Test1... ended");
    }

    @JiraPolicy(logTicketReady = true)
    @Test
    public void test_5() throws MalformedURLException, InterruptedException {
        System.out.println("Test5...");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);

        driver = new RemoteWebDriver(new URL("http://192.168.29.186:4444/wd/hub"), capabilities);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println("Title of the page is " + driver.getTitle());
        Thread.sleep(5000);
        driver.quit();
        Assert.assertEquals("Ram", "Shyam");
        System.out.println("Test1... ended");

    }

    @AfterSuite
    public void teardown() {
        System.out.println("tear down");
    }
}
