package com.qa.utils;

import com.qa.pages.LoginPage;

public class PageGeneratorManager {

    public static LoginPage getLoginPage(){
        return new LoginPage();
    }
}
