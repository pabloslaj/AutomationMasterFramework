package com.pls.driver.web.remote;

import com.pls.config.enums.BrowserType;
import com.pls.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.pls.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class SeleniumGridFactory {

    private SeleniumGridFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ? SeleniumGridChromeManager.getDriver() : SeleniumGridFirefoxManager.getDriver();
    }
}
