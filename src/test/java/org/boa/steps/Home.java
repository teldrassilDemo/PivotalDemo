package org.boa.steps;

import org.boa.selenium.Base;
import org.boa.utils.PropertiesInput;
import org.boa.utils.PropertiesManager;
import org.junit.Assert;
import io.cucumber.java.en.Given;
/**
 * Class of Home Steps.
 */
public class Home {

    @Given("User is on Home page")
    public void userIsOnHomePage() {
        String actualUrl =  PropertiesManager
                .getInstance().getProperties(PropertiesInput.URL_LOGIN);
        // String expectedUrl = driver.getCurrentUrl();
        // Assert.assertEquals(expectedUrl,actualUrl);
    }
}
