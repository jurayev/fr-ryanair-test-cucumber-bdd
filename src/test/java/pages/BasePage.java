package pages;

import driver.FactoryDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.LogUtils;

/***
 * This class is used to initialize PageFactory elements
 * And to store shared methods
 */
public class BasePage {

    protected BasePage(){
        PageFactory.initElements(FactoryDriver.getInstance(), this);
    }

    @FindBy(css = "a[ui-sref='login']")
    private WebElement loginLink;

    public void clickLoginLinkFromMainPage() {
        LogUtils.logInfo("Click 'Log in' link");
        loginLink.click();
    }


}
