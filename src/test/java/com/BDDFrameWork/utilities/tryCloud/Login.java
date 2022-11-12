package com.BDDFrameWork.utilities.tryCloud;

import com.BDDFrameWork.pages.tryCloud.LoginPage;

public class Login {

    LoginPage loginPage = new LoginPage();

    public void login(String username,String password) {
        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);
        loginPage.loginBtn.click();
    }
}
