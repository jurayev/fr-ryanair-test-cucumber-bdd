package pages;

import driver.FactoryDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.GlobalConstants;
import utils.LogUtils;

/***
 * This class is used to initialize PageFactory elements
 * And to store shared methods
 */
public class BasePage {

    public BasePage(){
        PageFactory.initElements(FactoryDriver.getInstance(), this);
    }

    @FindBy(css = "a[ui-sref='login']")
    private WebElement loginLink;

    @FindBy(css = "div.avatar-user")
    private WebElement userAvatar;

    public void clickLoginLinkFromMainPage() {
        loginLink.click();
    }

    public WebElement getUserAvatar() {
        return userAvatar;
    }

    public String getCurrentUrl(){
        return FactoryDriver.getInstance().getCurrentUrl();
    }

}
