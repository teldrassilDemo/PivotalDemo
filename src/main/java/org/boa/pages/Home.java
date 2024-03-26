package org.boa.pages;

import org.boa.selenium.Base;
import org.boa.selenium.CommonWebActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Base {
    @FindBy(css = "#tab_web_check_in")
    private WebElement tab_Check_in;

    /**
     * Click Button for create.
     */
    public final void clickCreateButton() {
        CommonWebActions.clickElement(tab_Check_in);
    }
}
