package com.pls.tests.mobile.base;

import com.pls.config.factory.ConfigFactory;
import com.pls.driver.Driver;
import com.pls.enums.MobilePlatformType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class MobileSetUp {

    private final MobilePlatformType mobilePlatformType = ConfigFactory.getConfig()
            .mobilePlatformType();

    @BeforeEach
    public void setUp() {
        Driver.initDriverForMobile(mobilePlatformType);
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}