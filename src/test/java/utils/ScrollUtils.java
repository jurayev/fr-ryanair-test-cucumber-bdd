package utils;

import driver.FactoryDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/***
 * Class describes methods to scroll a web page
 */
public class ScrollUtils {

    private static JavascriptExecutor js = ((JavascriptExecutor) FactoryDriver.getInstance());

    public static void scrollTopWithinWebElement(WebElement webElement, int pixel){
        js.executeScript("arguments[0].scrollTop = arguments[1];",webElement, pixel);
    }

    public static void scrollDown(int yOffSet){
        js.executeScript(String.format("scroll(0,%s)", yOffSet));

    }

}
