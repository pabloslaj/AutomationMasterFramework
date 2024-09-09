package com.pls.driver.manager.web.remote.selenium;

import com.pls.config.factory.ConfigFactory;
import com.pls.enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class SeleniumGridChromeManager {

    private SeleniumGridChromeManager() {
    }

    public static WebDriver getDriver() {
        ChromeOptions options = new ChromeOptions();
        return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(), options);
    }
}
