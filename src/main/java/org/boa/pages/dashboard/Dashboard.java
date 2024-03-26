package org.boa.pages.dashboard;

import org.boa.selenium.Base;
import org.boa.selenium.CommonWebActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard  extends Base {
    @FindBy(css = "#create-project-button")
    private WebElement createPButton;

    /**
     * Method for wait create button.
     *
     * @return messageDeleted is Displayed.
     */
    public boolean displayCreateButton() {
        return createPButton.isDisplayed();
    }

}
