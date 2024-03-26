import org.boa.pages.Home;
import org.boa.selenium.Base;
import org.junit.Assert;
import org.junit.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestExample extends Base {
    @Test
    public void login() {
        //System.setProperty("webdriver.chrome.driver", "path of driver");
        //WebDriver driver=new ChromeDriver();
        //driver.manage().window().maximize();
        //driver.get("https://www.browserstack.com/users/sign_in");
        //driver.get("https://www.boa.bo/BoAWebsite");

        //pageLogin.setUrl(PropertiesManager.getInstance().getProperties(PropertiesInput.URL_LOGIN));

        driver.navigate().to("https://www.pivotaltracker.com/");

        Home h = new Home();
        h.clickCreateButton();


        String actualUrl =  "https://www.boa.bo/BoAWebsite?AspxAutoDetectCookieSupport=1";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
