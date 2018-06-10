package test_runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"steps"},
        tags = { "@flights_booking" },
        features={ "src/test/resources/features/flightsBooking.feature" },
        plugin = { "pretty", "html:target/cucumber-reports/FlightsBookingTest/"}
)
public class FlightsBookingTest extends BaseTestRunner {
}
