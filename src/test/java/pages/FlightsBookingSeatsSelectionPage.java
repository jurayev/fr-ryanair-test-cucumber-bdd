package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import utils.ExplicitWait;
import utils.LogUtils;
import utils.ScrollUtils;
import java.util.List;

/***
 * This class describes Seats Selection Page
 * PageFactory is used for Page Object
 * It adds lazy evaluation
 * which means that Page Element is initialized only when it's called by method
 * instead of instant initialization when object of page is created
 */
public class FlightsBookingSeatsSelectionPage extends BasePage{

    @FindBy(css = "button.same-seats")
    private WebElement selectSeatsConfirmButton;

    @FindBys (@FindBy(css = "span.standard span.seat-click"))
    private List<WebElement> selectSeatButtonList;

    @FindBy(css = "button-spinner")
    private WebElement confirmButton;

    @FindBy(css = "a.priority-boarding-with-bags-popup__close")
    private WebElement declineBagsPriorityButton;

    @FindBy(css = "div.confirm-seats-table")
    private WebElement confirmSeatsTable;

    @FindBy(css = "div.seat-map-scrolling-body")
    private WebElement seatMap;

    public void clickSelectSeatsConfirmButton(){
        LogUtils.logInfo("Confirm seats selection information message");
        ExplicitWait.elementToBeClickable(selectSeatsConfirmButton);
        selectSeatsConfirmButton.click();
    }

    /***
     * Use JavascriptExecutor to scroll top seat selection pop up
     */
    public void selectSeats(int numberOfSeats){
        ExplicitWait.visibilityOfElements(selectSeatButtonList);
        LogUtils.logInfo("Scroll top seat map page");
        ScrollUtils.scrollTopWithinWebElement(seatMap, 100);
        for(int i=0; i<numberOfSeats; i++){
            LogUtils.logInfo("Select seat for passenger");
            selectSeatButtonList.get(i).click();
        }
    }

    public void clickReviewSeatsButton(){
        LogUtils.logInfo("Click 'Review Seats' button");
        confirmButton.click();
    }

    public void clickConfirmButton(){
        LogUtils.logInfo("Click 'Confirm' seats button");
        ExplicitWait.visibilityOfElement(confirmSeatsTable);
        confirmButton.click();

    }

    public void declineBagsPriority(){
        LogUtils.logInfo("Decline 'Bags Priority' offer");
        ExplicitWait.elementToBeClickable(declineBagsPriorityButton);
        declineBagsPriorityButton.click();
    }
}
