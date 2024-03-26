package com.pls.driver.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class FirefoxManager {

    private FirefoxManager() {
    }

    public static WebDriver getDriver() {
        return new FirefoxDriver();
    }

}
