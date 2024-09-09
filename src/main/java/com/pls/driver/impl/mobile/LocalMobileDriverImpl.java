package com.pls.driver.impl.mobile;

import com.pls.driver.IMobileDriver;
import com.pls.driver.entity.MobileDriverData;
import com.pls.driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
    }
}
