package com.pls.tests.mobile;

import com.pls.pages.mobile.HomeScreen;
import com.pls.tests.mobile.base.AndroidSetup;
import org.junit.jupiter.api.Test;

import static com.pls.pages.mobile.enums.ViewsScreenMenuItemType.WEB_VIEW;

class AndroidTest extends AndroidSetup {

    /*
    Please refer mobile test
     */

    @Test
    void testLoginAndroid() {
        HomeScreen.getHomeScreenInstance()
                .navigateToViewsScreen()
                .clickOnViewScreenElement(WEB_VIEW);
        //assertion
    }
}