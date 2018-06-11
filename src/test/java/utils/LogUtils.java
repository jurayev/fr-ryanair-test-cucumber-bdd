package utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import static utils.GlobalConstants.BINARY_DATA_LOGGER;

/**
 * log4j logger class
 */
public class LogUtils {

    private static final Logger LOGGER = LogManager.getLogger(BINARY_DATA_LOGGER);

    /**
     * @param message
     */
    public static void logInfo(String message) {
        LOGGER.info(message);
    }

    /**
     * @param message
     */
    public static void logDebug(String message) {
        LOGGER.debug(message);
    }

}
