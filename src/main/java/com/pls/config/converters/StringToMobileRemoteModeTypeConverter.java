package com.pls.config.converters;

import com.pls.enums.MobileRemoteModeType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobileRemoteModeTypeConverter implements Converter<MobileRemoteModeType> {

    @Override
    public MobileRemoteModeType convert(Method method, String mobileRemoteMode) {
        return MobileRemoteModeType.valueOf(mobileRemoteMode.toUpperCase());
    }
}