package test_runners;

import driver.FactoryDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import utils.LogUtils;
import utils.PropertyProvider;

public class BaseTestRunner {

    @BeforeClass
    public static void setUp(){
        LogUtils.logInfo("----------------------------Starting the test----------------------------------------------");
        FactoryDriver.setBrowserName(PropertyProvider.getProperty("browser_name"));
    }

    @AfterClass()
    public static void tearDown(){
        LogUtils.logInfo("---------------------------The test is completed-------------------------------------------");
        FactoryDriver.closeDriver();

    }
}
