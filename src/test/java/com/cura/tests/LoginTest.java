
package com.cura.tests;

import com.cura.base.BaseTest;
import com.cura.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {

        // Click Make Appointment
        driver.findElement(By.id("btn-make-appointment")).click();

        // Wait until login page loads
        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(10)
        );

        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.id("txt-username")
        ));

        // Perform login
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("John Doe", "ThisIsNotAPassword");

       // System.out.println("Current URL: " + driver.getCurrentUrl());
        //System.out.println("Page Title: " + driver.getTitle());

        //wait
        
        WebDriverWait waitFor = new WebDriverWait(driver, Duration.ofSeconds(10));

        waitFor.until(ExpectedConditions.urlContains("#appointment"));
        // Verify successful login
        Assert.assertTrue(
            driver.getCurrentUrl().contains("#appointment"),
            "Login failed!"
        );
    }
    
    @Test
public void verifyInvalidLogin() {

    driver.findElement(By.id("btn-make-appointment")).click();

    WebDriverWait wait = new WebDriverWait(
        driver, Duration.ofSeconds(10)
    );

    wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.id("txt-username")
    ));

    LoginPage loginPage = new LoginPage(driver);

    loginPage.login("WrongUser", "WrongPassword");

    WebElement errorMessage = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector(".text-danger")
        )
    );

    Assert.assertTrue(
        errorMessage.isDisplayed(),
        "Error message was not displayed!"
    );
}

@Test
public void verifyEmptyLogin() {

    driver.findElement(By.id("btn-make-appointment")).click();

    WebDriverWait wait = new WebDriverWait(
        driver, Duration.ofSeconds(10)
    );

    wait.until(ExpectedConditions.visibilityOfElementLocated(
        By.id("txt-username")
    ));

    LoginPage loginPage = new LoginPage(driver);

    loginPage.clickLogin();

    WebElement errorMessage = wait.until(
        ExpectedConditions.visibilityOfElementLocated(
            By.cssSelector(".text-danger")
        )
    );

    Assert.assertTrue(
        errorMessage.isDisplayed(),
        "Validation message was not displayed!"
    );
}

}
