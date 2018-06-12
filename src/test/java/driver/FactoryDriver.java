package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.LogUtils;
import utils.PropertyProvider;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import static utils.GlobalConstants.*;

/***
 * This class creates WebDriver instance
 * It designed through Singletone pattern which aimed to avoid duplicates of WebDriver instances
 */
public class FactoryDriver {

    private static WebDriver driver;

    private static String browserName;

    /***
     *
     * @param browserName passed from config property
     * System param browserNameInSystemSettings is used to override browserName in case of passed browser name from maven goal
     */
    public static void setBrowserName(String browserName) {
        String browserNameInSystemSettings = System.getProperty("browser");
        if(Objects.nonNull(browserNameInSystemSettings)) {
            FactoryDriver.browserName = browserNameInSystemSettings;
        } else {
            FactoryDriver.browserName = browserName;
        }
    }

    /***
     *
     * @return valid WebDriver instance
     */
    public static WebDriver getInstance() {
        if (Objects.isNull(driver)) {
            createNewDriver();
        }
        return driver;
    }
    public static void closeDriver() {
        driver.quit();
        driver = null;
    }

    /***
     * Factory method
     * This one adds cross-browser functionality to tests
     */
    private static void createNewDriver(){
        BrowserTypes browser;
        try{
            browser = BrowserTypes.valueOf(browserName.toUpperCase());
        }catch (IllegalArgumentException e){
            LogUtils.logError(e.getMessage());
            LogUtils.logDebug("Set default browser: FireFox");
            browser = BrowserTypes.FIREFOX;
        }
        String platform = System.getProperty("os.name").toLowerCase();
        switch (browser){
            case CHROME:
                driver = createChromeDriver(platform);
                LogUtils.logDebug("Chrome driver is created");
                break;
            case FIREFOX:
                driver = createFirefoxDriver(platform);
                LogUtils.logDebug("FireFox driver is created");
                break;
        }
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /***
     * Set system properties for target platform
     * @param platform passes platform name
     * @return ChromeDriver instance
     */
    private static ChromeDriver createChromeDriver(String platform){
        if(platform.startsWith("windows")) {
            System.setProperty(PropertyProvider.getProperty(CHROME_DRIVER), PropertyProvider.getProperty(CHROME_DRIVER_EXE_WIN));
        }else {
            System.setProperty(PropertyProvider.getProperty(CHROME_DRIVER), PropertyProvider.getProperty(CHROME_DRIVER_EXE_MAC));
        }
        return new ChromeDriver();
    }

    private static FirefoxDriver createFirefoxDriver(String platform){
        if(platform.startsWith("windows")) {
            System.setProperty(PropertyProvider.getProperty(FIREFOX_DRIVER), PropertyProvider.getProperty(FIREFOX_DRIVER_EXE_WIN));
        }else {
            System.setProperty(PropertyProvider.getProperty(FIREFOX_DRIVER), PropertyProvider.getProperty(FIREFOX_DRIVER_EXE_MAC));
        }
        return new FirefoxDriver();
    }
}
