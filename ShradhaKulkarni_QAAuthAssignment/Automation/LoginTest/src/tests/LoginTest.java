package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shrad\\\\selenium webdriver\\\\ChromeDriver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000/login");

        driver.findElement(By.id("email")).sendKeys("john@test.com");

        driver.findElement(By.id("password")).sendKeys("Pass12345678");

        driver.findElement(By.id("loginBtn")).click();

        String url = driver.getCurrentUrl();

        if(url.contains("dashboard"))
        {
            System.out.println("Login Test Passed");
        }

        driver.quit();
    }
}