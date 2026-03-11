package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\shrad\\\\\\\\\\\\\\\\selenium webdriver\\\\\\\\\\\\\\\\ChromeDriver\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver-win64\\\\\\\\\\\\\\\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://example-medical-app.com");
    }

    @AfterClass
    public void tearDown() {

        driver.quit();
    }
}