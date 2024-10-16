package com.pls.pages.web;

import com.pls.pages.web.pagecomponents.homepage.TopMenuComponent;
import com.pls.pages.web.topmenucomponent.MenuType;
import com.pls.pages.web.topmenucomponent.SubMenuType;
import com.pls.pages.web.validator.HomePageValidator;
import com.pls.utils.PageActionsHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final TopMenuComponent topMenuComponent;
    private static final By HEADER = By.xpath("//h1");

    public HomePage() {
        this.topMenuComponent = new TopMenuComponent();
    }

    public SystemUserPage navigateToSystemUsersPage() {
        topMenuComponent.clickMenuItem(MenuType.ADMIN)
                .clickSubMenuItem(SubMenuType.USER_MANAGEMENT)
                .clickSubMenuItem(SubMenuType.USERS);
        return new SystemUserPage();
    }

    public HomePageValidator getHomePageValidator() {
        return HomePageValidator.builder()
                .isMarketplaceLinkPresent(topMenuComponent.isMarketPlaceLinkPresent())
                .logoSourceText(topMenuComponent.getLogoSourceString())
                .headerName(PageActionsHelper.getAttribute(HEADER, WebElement::getText))
                .build();
    }
}