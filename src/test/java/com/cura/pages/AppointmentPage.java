
package com.cura.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {

    private WebDriver driver;

    private By facilityDropdown = By.id("combo_facility");
    private By readmissionCheckbox = By.id("chk_hospotal_readmission");
    private By medicaidRadio = By.id("radio_program_medicaid");
    private By visitDateField = By.id("txt_visit_date");
    private By commentField = By.id("txt_comment");
    private By bookButton = By.id("btn-book-appointment");

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFacility(String facility) {
        Select select = new Select(driver.findElement(facilityDropdown));
        select.selectByVisibleText(facility);
    }

    public void selectReadmission() {
        driver.findElement(readmissionCheckbox).click();
    }

    public void selectMedicaidProgram() {
        driver.findElement(medicaidRadio).click();
    }

    public void enterVisitDate(String date) {
        driver.findElement(visitDateField).sendKeys(date);
    }

    public void enterComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    public void bookAppointment() {
        driver.findElement(bookButton).click();
    }

    public void completeAppointment(
            String facility, String date, String comment) {

        selectFacility(facility);
        selectReadmission();
        selectMedicaidProgram();
        enterVisitDate(date);
        enterComment(comment);
        bookAppointment();
    }
}
