package com.pls.driver.factory.web.remote;

import com.pls.enums.BrowserType;
import com.pls.driver.manager.web.remote.browserstack.BrowserStackChromeManager;
import com.pls.driver.manager.web.remote.browserstack.BrowserStackFirefoxManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {

    private BrowserStackFactory() {
    }

    private static final Map<BrowserType, Supplier<WebDriver>> BROWSER_TYPE_SUPPLIER_MAP =
            new EnumMap<>(BrowserType.class);

    static {
        BROWSER_TYPE_SUPPLIER_MAP.put(BrowserType.CHROME, BrowserStackChromeManager::getDriver);
        BROWSER_TYPE_SUPPLIER_MAP.put(BrowserType.FIREFOX, BrowserStackFirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return BROWSER_TYPE_SUPPLIER_MAP.get(browserType).get();
    }
}
