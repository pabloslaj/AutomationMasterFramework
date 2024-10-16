package com.pls.pages.web;

import com.pls.pages.web.pagecomponents.adduserpage.SearchComponent;
import com.pls.pages.web.pagecomponents.adduserpage.UserListComponent;

public class SystemUserPage {

    private final SearchComponent searchComponent;
    private final UserListComponent userListComponent;

    public SystemUserPage() {
        this.userListComponent = new UserListComponent();
        this.searchComponent = new SearchComponent();
    }

    public UserListComponent getUserListComponent() {
        return userListComponent;
    }

}