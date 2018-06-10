package pages;

import driver.FactoryDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import utils.ExplicitWait;

import java.util.List;

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

    public void clickSelectSeatsConfirmButton(){
        ExplicitWait.explicitWaitUntilElementToBeClickable(selectSeatsConfirmButton);
        selectSeatsConfirmButton.click();
    }
    public void selectSeats(int numberOfSeats){
        ExplicitWait.explicitWaitVisibilityOfElements(selectSeatButtonList);
        for(int i=0; i<numberOfSeats; i++){
            selectSeatButtonList.get(i).click();
        }
    }

    public void clickReviewSeatsButton(){
        confirmButton.click();
    }

    public void clickConfirmButton(){
        ExplicitWait.explicitWaitVisibilityOfElement(confirmSeatsTable);
        confirmButton.click();

    }

    public void declineBagsPriority(){
        ExplicitWait.explicitWaitUntilElementToBeClickable(declineBagsPriorityButton);
        declineBagsPriorityButton.click();
    }
}
