package com.pls.config.factory;

import com.pls.config.ApiConfig;
import org.aeonbits.owner.ConfigCache;

public final class ApiConfigFactory {

    private ApiConfigFactory() {
    }

    public static ApiConfig getConfig() {
        return ConfigCache.getOrCreate(ApiConfig.class);
    }
}
