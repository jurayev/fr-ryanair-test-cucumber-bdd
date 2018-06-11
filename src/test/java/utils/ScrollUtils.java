package utils;

import driver.FactoryDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/***
 * Class describes methods to scroll a web page
 */
public class ScrollUtils {

    public static void scrollTopWithinWebElement(WebElement webElement, int pixel){
        ((JavascriptExecutor) FactoryDriver.getInstance()).
                executeScript("arguments[0].scrollTop = arguments[1];",webElement, pixel);
    }

    public static void scrollDown(int yOffSet){
        ((JavascriptExecutor) FactoryDriver.getInstance()).executeScript(String.format("scroll(0,%s)", yOffSet));

    }

}
