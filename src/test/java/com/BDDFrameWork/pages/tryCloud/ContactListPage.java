package com.BDDFrameWork.pages.tryCloud;

import com.BDDFrameWork.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactListPage {

    public ContactListPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[6]/a")
    public WebElement contactsMenu;

    @FindBy(xpath = "//*[@id=\"everyone\"]/div")
    public WebElement numberOfContacts;
}
