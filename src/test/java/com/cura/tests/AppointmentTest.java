
package com.cura.tests;

import com.cura.base.BaseTest;
import com.cura.pages.LoginPage;
import com.cura.pages.AppointmentPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AppointmentTest extends BaseTest {

    @Test
    public void verifyAppointmentBooking() {

        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(10)
        );

        // Navigate to login page
        driver.findElement(By.id("btn-make-appointment")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("txt-username")
        ));

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("John Doe", "ThisIsNotAPassword");

        // Wait for appointment form
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("combo_facility")
        ));

        // Complete appointment
        AppointmentPage appointmentPage =
            new AppointmentPage(driver);

        appointmentPage.completeAppointment(
            "Hongkong CURA Healthcare Center",
            "30/11/2026",
            "Automation testing appointment"
        );

        // Verify confirmation page
        wait.until(ExpectedConditions.urlContains("summary.php"));

        Assert.assertTrue(
            driver.getCurrentUrl().contains("summary.php"),
            "Appointment booking failed!"
        );

        Assert.assertTrue(
            driver.getPageSource().contains("Appointment Confirmation"),
            "Confirmation message not displayed!"
        );
    }
}
