package com.pls.driver;

import com.pls.driver.entity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
    WebDriver getDriver(MobileDriverData driverData);
}
