package com.pls.pages.mobile;

import com.pls.driver.DriverManager;
import com.pls.pages.mobile.enums.ViewsScreenMenuItemType;
import com.pls.utils.PageActionsHelper;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ViewsScreen {

    public ViewsScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(accessibility = "WebView")
    private WebElement textboxEmail;

    private static final String VIEW_SCREEN_ELEMENT = "%s";

    public void clickOnViewScreenElement(ViewsScreenMenuItemType element) {
        By accessibilityId = AppiumBy.accessibilityId(String.format(VIEW_SCREEN_ELEMENT, element.getName()));
        PageActionsHelper.scrollForMobile(textboxEmail);
        PageActionsHelper.waitAndClick(accessibilityId);
    }

}