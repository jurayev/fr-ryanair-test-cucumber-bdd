package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import driver.FactoryDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import utils.PropertyProvider;

public class BasePageSteps {


    @Given("^I am on main page$")
    public void userIsOnMainPage()  {
        String baseUrl = PropertyProvider.getProperty("base_url");
        WebDriver instance = FactoryDriver.getInstance();
        if(!instance.getCurrentUrl().equals(baseUrl)) {
            instance.get(baseUrl);
        }
    }

    @Then("^I should be logged in$")
    public void iShouldBeLoggedIn() {
        Assert.assertTrue("I'm not logged in", new BasePage().getUserAvatar().isDisplayed());
    }
}
