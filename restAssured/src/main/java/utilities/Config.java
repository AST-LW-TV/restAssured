package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties prop = new Properties();
    private static FileInputStream file;

    static {
        try {
            file = new FileInputStream("./src/main/resources/config.properties");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found...");
            System.exit(-1);
        }
    }

    // returns the value of the matched key
    public static String getValue(String key) {
        try {
            prop.load(file);
        } catch (IOException e) {
            System.out.println("Error in File...");
            System.exit(-1);
        }
        return prop.getProperty(key);
    }
}
