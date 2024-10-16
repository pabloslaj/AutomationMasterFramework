package com.pls.tests.web.base.homepage;

import com.pls.pages.web.LoginPage;
import com.pls.pages.web.validator.HomePageValidator;
import com.pls.tests.web.base.WebSetup;
import org.junit.jupiter.api.Test;

class HomePageTest extends WebSetup {

    @Test
    void testHomePageComponents() {
        HomePageValidator homepage = new LoginPage()
                .loginToApplication("Admin", "admin123")
                .getHomePageValidator();

        HomePageAssert.assertThat(homepage)
                .isMarketPlaceLinkPresent()
                .headerNameEquals("Dashboard")
                .logoSourceStringContains("/webres_62dc2eaf175ba1.37872590/themes/default/images/logo.png")
                .assertAll();
    }
}
