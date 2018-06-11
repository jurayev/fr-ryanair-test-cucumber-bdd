package steps;

import cucumber.api.java.en.Given;
import driver.FactoryDriver;
import org.openqa.selenium.WebDriver;
import utils.LogUtils;
import utils.PropertyProvider;

/***
 * This class contains Shared Main Page steps
 */
public class BasePageSteps {


    @Given("^I am on main page$")
    public void iAmOnMainPage()  {
        String baseUrl = PropertyProvider.getProperty("base_url");
        WebDriver instance = FactoryDriver.getInstance();
        if(!instance.getCurrentUrl().equals(baseUrl)) {
            instance.get(baseUrl);
        }
        LogUtils.logInfo(String.format("I'm on '%s' page", baseUrl));
    }

}
