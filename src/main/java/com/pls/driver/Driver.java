package com.pls.driver;

import com.pls.config.factory.ConfigFactory;
import com.pls.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver(){

    }
    private static WebDriver driver = null;

    public static void initDriver() {
        driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
    }

    public static void quitDriver() {
        // WIP
    }
}
