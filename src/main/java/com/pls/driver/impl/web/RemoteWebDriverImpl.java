package com.pls.driver.impl.web;

import com.pls.driver.IWebDriver;
import com.pls.driver.entity.WebDriverData;
import com.pls.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
    }
}
