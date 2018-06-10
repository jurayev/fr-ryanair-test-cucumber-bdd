package utils;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import static utils.GlobalConstants.BINARY_DATA_LOGGER;

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

    /**
     * @param message
     */
    public static void logError(String message) {
        LOGGER.error(message);
    }
}
