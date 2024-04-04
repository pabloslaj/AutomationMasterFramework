package com.pls.driver.web.remote;

import com.pls.config.enums.BrowserRemoteModeType;
import com.pls.config.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {

        if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM) {
            return SeleniumGridFactory.getDriver(browserType);
        } else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID) {
            return SelenoidFactory.getDriver(browserType);
        } else if (browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK) {
            return BrowserStackFactory.getDriver(browserType);
        }
        return null;
    }
}
