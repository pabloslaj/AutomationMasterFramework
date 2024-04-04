package com.pls.config.factory;

import com.pls.config.BrowserStackConfig;
import org.aeonbits.owner.ConfigCache;

public class BrowserStackConfigFactory {

    private BrowserStackConfigFactory() {
    }

    public static BrowserStackConfig getConfig() {
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}
