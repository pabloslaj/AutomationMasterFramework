package com.pls.driver.impl.mobile;

import com.pls.driver.IMobileDriver;
import com.pls.driver.entity.MobileDriverData;
import com.pls.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {

    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(), driverData.getMobilePlatformType());
    }
}
