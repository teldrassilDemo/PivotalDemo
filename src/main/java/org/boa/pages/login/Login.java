package org.boa.pages.login;

import org.boa.selenium.Base;
import org.boa.selenium.CommonWebActions;
import org.boa.utils.PropertiesInput;
import org.boa.utils.PropertiesManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * Class Login for start the Project.
 */
public class Login extends Base {
    @FindBy(xpath = "//div[@class='header__lg']/a[@class='header__link header__link-signin']")
    private WebElement loginButton;

    @FindBy(id = "credentials_username")
    private WebElement userNameField;

    @FindBy(id = "credentials_password")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@value='SIGN IN']")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@value='NEXT']")
    private WebElement nextButton;

    @FindBy(xpath = "//button[@aria-label='Profile Dropdown']")
    private WebElement profileButton;
    @FindBy(xpath = "//button[contains(@class, 'Dropdown__option--button')]")
    private WebElement signOutButton;
    /**
     * Click login button.
     */
    public final void clickLoginButton() {
        CommonWebActions.clickElement(loginButton);
    }

    /**
     * Set UserName
     */
    public final void setUserName() {
        CommonWebActions.setTextElement(userNameField, PropertiesManager
                .getInstance().getProperties(PropertiesInput.USER));
    }

    /**
     * Set password.
     */
    public final void setPassword() {
        CommonWebActions.setTextElement(passwordField, PropertiesManager
                .getInstance().getProperties(PropertiesInput.PASSWORD));
    }

    /**
     * Click sign in button.
     */
    public final void clickSignIn() {
        CommonWebActions.clickElement(signInButton);
    }

    /**
     * Click next button.
     */
    public final void clickNextButton() {
        CommonWebActions.clickElement(nextButton);
    }

    /**
     * Click next button.
     *
     * @return url
     */
    public final String getUrl() {
        return driver.getCurrentUrl();
    }

    /**
     * get user name.
     *
     * @return user name
     */
    public final String getUserName() {
        return userNameField.getText();
    }

    /**
     * Close test.
     */
    public final void logout() {
        CommonWebActions.clickElement(profileButton);
        CommonWebActions.clickElement(signOutButton);
    }
}
