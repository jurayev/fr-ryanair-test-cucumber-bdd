package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;
import utils.LogUtils;

import static utils.GlobalConstants.EXPLICIT_SLEEP_TIMEOUT_MILLIS;

/***
 * This class describes Flights Booking Page
 * PageFactory is used for Page Object
 * It adds lazy evaluation
 * which means that Page Element is initialized only when it's called by method
 * instead of instant initialization when object of page is created
 */
public class FlightsBookingExtrasPage extends BasePage {

    @FindBy(css = "button.btn-text")
    private WebElement checkOutButton;

    public void clickCheckOutButton(){
        LogUtils.logInfo("Click 'Check out' button");
        ExplicitWait.sleep(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
        checkOutButton.click();
    }
}
