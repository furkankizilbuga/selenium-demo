package org.example.entity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameEmail {

    private WebDriver driver;

    private By firstName = By.id("firstName");
    private By lastName = By.id("lastName");
    private By userEmail = By.id("userEmail");

    public NameEmail(WebDriver driver) {
        this.driver = driver;
    }

    public void setFirstName(String input) {
        WebElement field = driver.findElement(firstName);
        field.click();
        field.sendKeys(input);
    }

    public void setLastName(String input) {
        WebElement field = driver.findElement(lastName);
        field.click();
        field.sendKeys(input);
    }

    public void setEmail(String input) {
        WebElement field = driver.findElement(userEmail);
        field.click();
        field.sendKeys(input);
    }

    public String getFirstName() {
        WebElement field = driver.findElement(firstName);
        return field.getAttribute("value");
    }

    public String getLastName() {
        WebElement field = driver.findElement(lastName);
        return field.getAttribute("value");
    }

    public String getUserEmail() {
        WebElement field = driver.findElement(userEmail);
        return field.getAttribute("value");
    }

}
