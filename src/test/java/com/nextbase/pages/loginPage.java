package com.nextbase.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMe;

    @FindBy(className = "login-btn" )
    public WebElement loginButton;

    @FindBy(linkText = "Forgot your password?")
    public WebElement forgotYourPassword;

//gdsff
}
