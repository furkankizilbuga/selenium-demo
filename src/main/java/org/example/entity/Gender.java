package org.example.entity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gender extends Component {

    private By maleRadio = By.id("gender-radio-1");
    private By femaleRadio = By.id("gender-radio-2");
    private By otherRadio = By.id("gender-radio-3");

    private By maleRadioLabel = new By.ByCssSelector("label[for='gender-radio-1']");
    private By femaleRadioLabel = new By.ByCssSelector("label[for='gender-radio-2']");
    private By otherRadioLabel = new By.ByCssSelector("label[for='gender-radio-3']");

    public Gender(WebDriver driver) {
        super(driver);
    }

    public void setMaleRadio() {
        WebElement radio = driver.findElement(maleRadioLabel);
        radio.click();
    }

    public void setFemaleRadio() {
        WebElement radio = driver.findElement(femaleRadioLabel);
        radio.click();
    }

    public void setOtherRadio() {
        WebElement radio = driver.findElement(otherRadioLabel);
        radio.click();
    }

    public WebElement getMaleRadio() {
        return driver.findElement(maleRadio);
    }

    public WebElement getFemaleRadio() {
        return driver.findElement(femaleRadio);
    }

    public WebElement getOtherRadio() {
        return driver.findElement(otherRadio);
    }

    public boolean isChecked(WebElement radio) {
        return radio.isSelected();
    }

}
