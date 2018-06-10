package utils;

import driver.FactoryDriver;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static utils.GlobalConstants.EXPLICIT_WAIT_TIMEOUT;


public class ExplicitWait {

    private static WebDriverWait wait = new WebDriverWait(FactoryDriver.getInstance(), EXPLICIT_WAIT_TIMEOUT);

    public static void explicitWaitVisibilityOfElement(WebElement webElement) {
        wait.ignoring(StaleElementReferenceException.class, WebDriverException.class).until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void explicitWaitVisibilityOfElements(List<WebElement> webElements) {
        wait.ignoring(StaleElementReferenceException.class, WebDriverException.class).until(ExpectedConditions.visibilityOfAllElements(webElements));
    }

    public static void explicitWaitUntilElementToBeClickable( WebElement webElement) {
        wait.ignoring(StaleElementReferenceException.class, WebDriverException.class).until(ExpectedConditions.elementToBeClickable(webElement));
    }
    public static void explicitWaitUntilElementToBeInvisible( WebElement webElement) {
        wait.ignoring(StaleElementReferenceException.class, WebDriverException.class).until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static void explicitWaitUrlToBe( String url) {
        wait.ignoring(StaleElementReferenceException.class, WebDriverException.class).until(ExpectedConditions.urlToBe(url));
    }

    public static void explicitWait(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
