package com.pls.config;

import com.pls.config.converters.StringToBrowserTypeConverter;
import com.pls.config.converters.StringToMobileRemoteModeTypeConverter;
import com.pls.config.converters.StringToRunModeBrowserTypeConverter;
import com.pls.config.converters.StringToURLConverter;
import com.pls.enums.*;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("Chrome")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();

    @Key("runModeMobile")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType mobileRunMode();

    @Key("mobileRemoteMode")
    @ConverterClass(StringToMobileRemoteModeTypeConverter.class)
    MobileRemoteModeType mobileRemoteMode();

    @Key("seleniumGridURL")
    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://127.0.0.1:4723/wd/hub")
    URL localAppiumServerURL();
}
