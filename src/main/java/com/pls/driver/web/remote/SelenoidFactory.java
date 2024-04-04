package com.pls.driver.web.remote;

import com.pls.config.enums.BrowserType;
import com.pls.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.pls.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {

    private SelenoidFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ? SelenoidChromeManager.getDriver() : SelenoidFirefoxManager.getDriver();
    }
}
