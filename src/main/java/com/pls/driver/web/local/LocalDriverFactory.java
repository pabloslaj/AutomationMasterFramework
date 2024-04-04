package com.pls.driver.web.local;

import com.pls.config.enums.BrowserType;
import com.pls.driver.manager.web.local.ChromeManager;
import com.pls.driver.manager.web.local.FirefoxManager;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    public static WebDriver getDriver(BrowserType browserType) {
        WebDriver driver;
        if (browserType == BrowserType.CHROME) {
            driver = ChromeManager.getDriver();
        } else {
            driver = FirefoxManager.getDriver();
        }
        return driver;
    }
}
