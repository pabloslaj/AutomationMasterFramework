package com.pls.driver;

import com.pls.config.ConfigFactory;
import com.pls.config.enums.BrowserType;
import com.pls.driver.manager.ChromeManager;
import com.pls.driver.manager.FirefoxManager;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    public static WebDriver getDriver() {
        WebDriver driver = null;
        if (ConfigFactory.getConfig().browser() == BrowserType.CHROME) {
            driver = ChromeManager.getDriver();
        } else {
            driver = FirefoxManager.getDriver();
        }
        return driver;
    }
}
