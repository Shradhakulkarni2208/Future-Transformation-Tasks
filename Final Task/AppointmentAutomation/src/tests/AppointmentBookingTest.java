package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.AppointmentPage;

public class AppointmentBookingTest extends BaseTest {

    @Test
    public void verifySuccessfulAppointmentBooking() {

        // Login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("JohnDoe", "Password123");

        // Appointment booking
        AppointmentPage appointmentPage = new AppointmentPage(driver);

        appointmentPage.clickBookAppointment();

        appointmentPage.selectFacility("Tokyo CURA Healthcare Center");

        appointmentPage.enterVisitDate("30/03/2026");

        appointmentPage.enterComment("Regular health checkup");

        appointmentPage.clickBook();

        // Verification
        String confirmation = appointmentPage.getConfirmationMessage();

        Assert.assertEquals(confirmation, "Appointment Confirmation");
    }
}