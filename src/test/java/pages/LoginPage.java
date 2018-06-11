package pages;

import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ExplicitWait;

import static utils.GlobalConstants.EXPLICIT_SLEEP_TIMEOUT_MILLIS;

/***
 * This class describes Login Page
 * PageFactory is used for Page Object
 * It adds lazy evaluation
 * which means that Page Element is initialized only when it's called by method
 * instead of instant initialization when object of page is created
 */
public class LoginPage extends BasePage{

    @FindBy(name = "emailAddress")
    private WebElement email;

    @FindBy(css = "password-input>input")
    private WebElement password;

    @FindBy(css = "button-spinner[on-click='$ctrl.doLogin()']")
    private WebElement loginButton;

    public void logIn(User user){
        email.sendKeys(user.getUsername());
        password.sendKeys(user.getPassword());
        loginButton.click();
        ExplicitWait.sleep(EXPLICIT_SLEEP_TIMEOUT_MILLIS);
    }
}
