package test_runners;

import driver.FactoryDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import utils.PropertyProvider;

public class BaseTestRunner {

    @BeforeClass
    public static void setUp(){
        FactoryDriver.setBrowserName(PropertyProvider.getProperty("browser_name"));
    }

    @AfterClass()
    public static void tearDown(){
        FactoryDriver.closeDriver();
    }
}
