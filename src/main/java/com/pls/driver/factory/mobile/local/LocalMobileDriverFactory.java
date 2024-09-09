package com.pls.driver.factory.mobile.local;

import com.pls.driver.manager.web.local.ChromeManager;
import com.pls.driver.manager.web.local.FirefoxManager;
import com.pls.enums.BrowserType;
import com.pls.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class LocalMobileDriverFactory {

    private LocalMobileDriverFactory() {
    }

    private final static Map<MobilePlatformType, Supplier<WebDriver>> MOBILE_PLATFORM_TYPE_MAP = new EnumMap<>(MobilePlatformType.class);

    static {
        MOBILE_PLATFORM_TYPE_MAP.put(MobilePlatformType.ANDROID, ChromeManager::getDriver);
        MOBILE_PLATFORM_TYPE_MAP.put(MobilePlatformType.IOS, FirefoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType) {
        return MOBILE_PLATFORM_TYPE_MAP.get(browserType).get();
    }
}
