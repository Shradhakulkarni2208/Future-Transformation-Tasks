package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DashboardTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\shrad\\\\\\\\selenium webdriver\\\\\\\\ChromeDriver\\\\\\\\chromedriver-win64\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000/dashboard");

        String url = driver.getCurrentUrl();

        if(url.contains("login"))
        {
            System.out.println("Redirect Test Passed");
        }

        driver.quit();
    }
}