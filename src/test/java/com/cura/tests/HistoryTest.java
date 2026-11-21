
package com.cura.tests;

import com.cura.base.BaseTest;
import com.cura.pages.LoginPage;
import com.cura.pages.HistoryPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HistoryTest extends BaseTest {

    @Test
    public void verifyAppointmentHistory() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(10)
        );

        // Login
        driver.findElement(By.id("btn-make-appointment")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("txt-username")
        ));
        

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("John Doe", "ThisIsNotAPassword");
        
       

        // Wait for appointment page
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("combo_facility")
        ));

       
        
        // Open navigation menu
        driver.findElement(By.id("menu-toggle")).click();



        // Wait for History link
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.linkText("History")
));

        // Open history
        HistoryPage historyPage = new HistoryPage(driver);
        

        historyPage.openHistory();
        
     
       

        // Verify history page
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("history")
        ));

        Assert.assertTrue(
            historyPage.isHistoryDisplayed(),
            "Appointment history was not displayed!"
        );

        System.out.println("Appointment history displayed successfully!");
        
        
    }
}
