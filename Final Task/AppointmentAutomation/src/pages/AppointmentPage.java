package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppointmentPage {

    WebDriver driver;

    // Constructor
    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By bookAppointmentButton = By.xpath("//a[@id='bookAppointment']");

    By facilityDropdown = By.xpath("//select[@id='facility']");

    By visitDate = By.xpath("//input[@id='visit_date']");

    By commentBox = By.xpath("//textarea[@id='comment']");

    By bookButton = By.xpath("//button[@id='btn-book-appointment']");

    By confirmationMessage = By.xpath("//h2[contains(text(),'Appointment Confirmation')]");

    // Actions

    public void clickBookAppointment() {
        driver.findElement(bookAppointmentButton).click();
    }

    public void selectFacility(String facility) {
        driver.findElement(facilityDropdown).sendKeys(facility);
    }

    public void enterVisitDate(String date) {
        driver.findElement(visitDate).sendKeys(date);
    }

    public void enterComment(String comment) {
        driver.findElement(commentBox).sendKeys(comment);
    }

    public void clickBook() {
        driver.findElement(bookButton).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }

}