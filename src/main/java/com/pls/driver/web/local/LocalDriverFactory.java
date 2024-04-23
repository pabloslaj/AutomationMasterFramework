package com.pls.driver.web.local;

import com.pls.config.enums.BrowserType;
import com.pls.driver.manager.web.local.ChromeManager;
import com.pls.driver.manager.web.local.FirefoxManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    private final static Map<BrowserType, Supplier<WebDriver>> BROWSER_TYPE_SUPPLIER_MAP = new EnumMap<>(BrowserType.class);

    static {
        BROWSER_TYPE_SUPPLIER_MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
        BROWSER_TYPE_SUPPLIER_MAP.put(BrowserType.FIREFOX, FirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return BROWSER_TYPE_SUPPLIER_MAP.get(browserType).get();
    }
}
