package org.boa.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.boa.pages.login.Login;
import org.boa.selenium.Base;
import org.boa.utils.PropertiesInput;
import org.boa.utils.PropertiesManager;
import org.junit.jupiter.api.AfterEach;

/**
 * Class of Hooks Steps.
 */
public class Hooks {
   private final Login login;

    /**
     * constructor.
     *
     * @param login   object.
     */
    public Hooks(final Login login) {

        this.login = login;
    }

    @After
    public void teardown() {
        login.logout();
    }

}
