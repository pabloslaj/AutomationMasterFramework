package com.pls.driver.web.remote;

import com.pls.config.enums.BrowserRemoteModeType;
import com.pls.config.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {

    private RemoteDriverFactory() {
    }

    private static final Map<BrowserRemoteModeType, Function<BrowserType, WebDriver>> BROWSER_REMOTE_MODE_TYPE_WEB_DRIVER_MAP = new EnumMap<>(BrowserRemoteModeType.class);

    static {
        BROWSER_REMOTE_MODE_TYPE_WEB_DRIVER_MAP.put(BrowserRemoteModeType.SELENIUM, SeleniumGridFactory::getDriver);
        BROWSER_REMOTE_MODE_TYPE_WEB_DRIVER_MAP.put(BrowserRemoteModeType.SELENOID, SelenoidFactory::getDriver);
        BROWSER_REMOTE_MODE_TYPE_WEB_DRIVER_MAP.put(BrowserRemoteModeType.BROWSER_STACK, BrowserStackFactory::getDriver);
    }

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType) {
        return BROWSER_REMOTE_MODE_TYPE_WEB_DRIVER_MAP.get(browserRemoteModeType).apply(browserType);
    }
}
