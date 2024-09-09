package com.pls.driver.entity;

import com.pls.enums.MobilePlatformType;
import com.pls.enums.MobileRemoteModeType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {
    private MobilePlatformType mobilePlatformType;
    private MobileRemoteModeType mobileRemoteModeType;
}
