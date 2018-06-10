package pages;

import model.User;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    }
}
