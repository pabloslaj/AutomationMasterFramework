package com.pls.tests.mobile.base;

import com.pls.driver.Driver;
import com.pls.enums.MobilePlatformType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class AndroidSetup {

    /*
    Please check MobileSetup
     */

    @BeforeEach
    public void setUp() {
        Driver.initDriverForMobile(MobilePlatformType.ANDROID);
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
