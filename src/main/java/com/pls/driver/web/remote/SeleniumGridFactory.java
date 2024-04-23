package com.pls.driver.web.remote;

import com.pls.config.enums.BrowserType;
import com.pls.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.pls.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class SeleniumGridFactory {

    private SeleniumGridFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> BROWSER_TYPE_SUPPLIER_MAP =
            new EnumMap<>(BrowserType.class);

    static {
        BROWSER_TYPE_SUPPLIER_MAP.put(BrowserType.CHROME, SeleniumGridChromeManager::getDriver);
        BROWSER_TYPE_SUPPLIER_MAP.put(BrowserType.FIREFOX, SeleniumGridFirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return BROWSER_TYPE_SUPPLIER_MAP.get(browserType).get();
    }
}
