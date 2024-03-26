package org.boa.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Class to return the ChromeDriver for Chrome browser.
 */
public class ChromeBrowser implements Browser {
    /**
     * @return the ChromeDriver.
     */
    @Override
    public WebDriver getBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        return new ChromeDriver(options);
    }
}
