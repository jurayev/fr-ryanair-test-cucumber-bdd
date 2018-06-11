package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static utils.GlobalConstants.CONFIG_PROPERTIES_PATH;

/***
 * This class reads properties from config property file
 */
public class PropertyProvider {

    private static Properties prop;

    private static void readProperties(String filePath){
        InputStream input = null;
        prop = new Properties();
        try {
            input = new FileInputStream(filePath);
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getProperty(String key){
        if(prop == null){
            readProperties(CONFIG_PROPERTIES_PATH);
        }
        return prop.getProperty(key);
    }
}
