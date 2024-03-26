package org.boa.selenium;

import org.boa.driver.DriverFactory;
import org.boa.driver.DriverManager;
import org.boa.driver.DriverType;
import org.boa.utils.PropertiesInput;
import org.boa.utils.PropertiesManager;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class Base {
    protected WebDriver driver;
    protected WebDriverWait driverWait;

    /**
     * Method for Base for declared DriverManager.
     */
    public Base() {
        driver = DriverManager.getInstance().getDriver();
        driverWait = DriverManager.getInstance().getWaiter();
        PageFactory.initElements(driver, this);
    }

    /**
     * Navigate to pager.
     */
    public void navigate() {
        driver.navigate().to(PropertiesManager
                .getInstance().getProperties(PropertiesInput.URL_LOGIN));
    }
}
