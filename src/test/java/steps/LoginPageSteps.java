package steps;

import cucumber.api.java.en.When;
import model.User;
import pages.LoginPage;
import utils.PropertyProvider;

/***
 * This class contains Login steps
 */
public class LoginPageSteps {

    @When("^I log in to personal account$")
    public void iLogInToPersonalAccount() {
        LoginPage page = new LoginPage();
        page.clickLoginLinkFromMainPage();
        page.logIn(new User(PropertyProvider.getProperty("username"),PropertyProvider.getProperty("password")));
    }
}
