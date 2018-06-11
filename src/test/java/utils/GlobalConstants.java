package utils;

/***
 * This class contains project constants in one place
 * Class declared as abstract to prevent class instance creation
 */
public abstract class GlobalConstants {

    static final String BINARY_DATA_LOGGER = "binary_data_logger";

    static final String CONFIG_PROPERTIES_PATH = "src/test/resources/config.properties";

    public static final int PAGE_LOAD_TIMEOUT = 60;
    public static final int IMPLICIT_WAIT_TIMEOUT = 15;
    public static final int EXPLICIT_WAIT_TIMEOUT = 15;
    public static final int EXPLICIT_SLEEP_TIMEOUT_MILLIS = 1500;

    public static final String FIREFOX_DRIVER = "firefox_driver";
    public static final String FIREFOX_DRIVER_EXE_WIN = "firefox_driver_exe_win";
    public static final String FIREFOX_DRIVER_EXE_MAC = "firefox_driver_exe_mac";
    public static final String CHROME_DRIVER = "chrome_driver";
    public static final String CHROME_DRIVER_EXE_WIN = "chrome_driver_exe_win";
    public static final String CHROME_DRIVER_EXE_MAC = "chrome_driver_exe_mac";

}
