package com.pls.config;

import com.pls.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/browser-stack.properties"
})
public interface BrowserStackConfig extends Config {

    @Key("username")
    String userName();

    String key();

    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/hd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();

}
