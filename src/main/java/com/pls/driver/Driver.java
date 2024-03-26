package com.pls.driver;

import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver(){

    }
    private static WebDriver driver = null;

    public static void initDriver() {
        driver = LocalDriverFactory.getDriver();
    }

    public static void quitDriver() {
        // WIP
    }
}
