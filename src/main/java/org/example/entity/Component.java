package org.example.entity;

import org.openqa.selenium.WebDriver;

public class Component {

    protected WebDriver driver;

    public Component(WebDriver driver) {
        this.driver = driver;
    }
}
