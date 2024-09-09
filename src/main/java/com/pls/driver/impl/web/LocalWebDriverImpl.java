package com.pls.driver.impl.web;

import com.pls.driver.IWebDriver;
import com.pls.driver.entity.WebDriverData;
import com.pls.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}