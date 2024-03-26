package org.boa.driver;

import org.boa.utils.PropertiesInput;
import org.boa.utils.PropertiesManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public final class DriverManager {
    private static DriverManager driverManager;
    private WebDriver driver;
    private WebDriverWait wait;

    /**
     * Constructor, private to apply singleton pattern.
     */
    private DriverManager() {
        DriverType driverType = DriverType.valueOf(PropertiesManager
                .getInstance().getProperties(PropertiesInput.BROWSER));
        driver = DriverFactory.getDriverManager(driverType);
        wait = new WebDriverWait(driver, Duration.parse("PT30S"));
    }

    /**
     * Initialize Properties object.
     */
    private void init() {
        driverManager = new DriverManager();
        DriverType driverType = DriverType.valueOf(PropertiesManager
                .getInstance().getProperties(PropertiesInput.BROWSER));
        driver = DriverFactory.getDriverManager(driverType);
        wait = new WebDriverWait(driver, Duration.parse("PT30S"));
    }

    /**
     * Static method to get a class instance.
     *
     * @return instance.
     */
    public static DriverManager getInstance() {
        if (driverManager == null) {
            driverManager = new DriverManager();
        }
        return driverManager;
    }

    /**
     * Getter of WebDriver object.
     *
     * @return WebDriver instance.
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Setter of driver manager.
     */
    public void restart() {
        driverManager = null;
    }

    /**
     * Getter of WebDriverWait object.
     *
     * @return WebDriverWait instance.
     */
    public WebDriverWait getWaiter() {
        return wait;
    }

    /**
     * Set time implicit wait.
     *
     * @param implicitTimeWait time for wait.
     */
    public void setImplicitTime(int implicitTimeWait) {
        driver.manage().timeouts().implicitlyWait(implicitTimeWait, TimeUnit.SECONDS);
    }

    /**
     * Set update waits.
     *
     * @param time time for implicit and explicit.
     */
    public void setUpdateWait(int time) {
        this.setImplicitTime(time);
    }

    /**
     * Back previous set default times.
     */
    public void backPreviousWait() {
        this.setImplicitTime(0);
    }
}
