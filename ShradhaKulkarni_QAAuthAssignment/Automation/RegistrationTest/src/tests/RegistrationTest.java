package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shrad\\\\selenium webdriver\\\\ChromeDriver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:3000/register");

        driver.findElement(By.id("name")).sendKeys("JohnSmith");

        driver.findElement(By.id("email")).sendKeys("johnsmith@test.com");

        driver.findElement(By.id("password")).sendKeys("Pass12345678");

        driver.findElement(By.id("confirmPassword")).sendKeys("Pass12345678");

        driver.findElement(By.id("registerBtn")).click();

        System.out.println("Registration Test Executed");

//        driver.quit();
    }
}