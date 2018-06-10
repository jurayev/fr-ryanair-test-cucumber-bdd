package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.LogUtils;

import static utils.GlobalConstants.EXPLICIT_SLEEP_TIMEOUT_MILLIS;

public class FlightsBookingExtrasPage extends BasePage {

    @FindBy(css = "button.btn-text")
    private WebElement checkOutButton;

    @FindBy(css = "div.basket-message__popup ng-hide")
    private WebElement overlay;

    public void clickCheckOutButton(){
        LogUtils.logInfo("Click 'Check out' button");
        ExplicitWait.explicitWait(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
        checkOutButton.click();
    }
}
