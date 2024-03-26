package org.boa.steps.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.boa.pages.dashboard.Dashboard;
import org.boa.pages.login.Login;
import org.boa.selenium.Base;
import org.junit.Assert;

public class LoginSteps {
    /**
     * Class of Login Steps.
     */
    private Login login;
    private Dashboard dashboard;

    /**
     * Constructor for LoginSteps class.
     *
     * @param login object.
     * @param dashboard object.
     */
    public LoginSteps(final Login login, final Dashboard dashboard) {
        this.login = login;
        this.dashboard = dashboard;
    }

    @Given("User is located on Login page")
    public void userIsLocatedOnLoginPage() {
        login.navigate();
        login.clickLoginButton();
        String actualUrl =  "https://www.pivotaltracker.com/signin?source=navbar";
        String expectedUrl = login.getUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @When("User sets username and password")
    public void userSetsUsernameAndPassword() {
        if (login.getUserName() != "" ) {
            login.setUserName();
            login.clickNextButton();
        }
        login.setPassword();
    }

    @And("Press Sign In button")
    public void pressSignInButton() {
        login.clickSignIn();
    }

    @And("The user will be redirected to dashboard")
    public void theUserWillBeRedirectedToDashboard() {
        //verify URL
        String actualUrl =  "https://www.pivotaltracker.com/dashboard";
        String expectedUrl = login.getUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        // wait for element from dashboard
        Assert.assertTrue(dashboard.displayCreateButton());

    }

    @Given("The user is logged in the app")
    public void theUserIsLoggedInTheApp() {
        login.navigate();
        userIsLocatedOnLoginPage();
        login.setUserName();
        login.clickNextButton();
        login.setPassword();
        login.clickSignIn();

    }


}
