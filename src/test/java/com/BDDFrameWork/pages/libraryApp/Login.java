package com.BDDFrameWork.pages.libraryApp;

import com.BDDFrameWork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='inputEmail']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@id='inputPassword']")
    private WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginBtn;

    public void login(String username,String password) {
        inputUsername.sendKeys(username2);
        inputPassword.sendKeys(password2);
        loginBtn.click();
    }
}
