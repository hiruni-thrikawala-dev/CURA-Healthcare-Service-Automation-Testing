
package com.cura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class HistoryPage {

    private WebDriver driver;

    private By historyLink = By.linkText("History");
    private By appointmentDetails = By.id("history");

    public HistoryPage(WebDriver driver) {
        this.driver = driver;
    }

  public void openHistory() {
    driver.findElement(historyLink).click();
}

    public boolean isHistoryDisplayed() {
        return driver.findElement(appointmentDetails).isDisplayed();
    }
}
