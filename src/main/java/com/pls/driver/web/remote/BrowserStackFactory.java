package com.pls.driver.web.remote;

import com.pls.config.enums.BrowserType;
import com.pls.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.pls.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import org.openqa.selenium.WebDriver;

public final class BrowserStackFactory {

    private BrowserStackFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME ? BrowserStackChromeManager.getDriver() : BrowserStackFirefoxManager.getDriver();
    }
}
