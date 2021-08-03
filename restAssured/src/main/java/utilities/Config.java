package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static Properties prop = new Properties();
    private static FileInputStream file;

    private static String getValue(FileInputStream file, String key) {
        String value = null;
        try {
            prop.load(file);
            value = prop.getProperty(key);

        } catch (IOException e) {
            System.out.println("Error in File...");
            System.exit(-1);
        }
        return value;
    }

    private static FileInputStream getFile(String fileName) {
        try {
            file = new FileInputStream("./src/main/resources/filesPath.properties");
        } catch (FileNotFoundException e) {
            System.out.println("File not Found...");
            System.exit(-1);
        }
        return file;
    }

    private static String getFilePath(String fileName) {
        FileInputStream file = getFile(fileName);
        return getValue(file, fileName);
    }

    public static String getValue(String fileName, String keyValue) {
        String value = null;
        String filePath = getFilePath(fileName);
        try {
            file = new FileInputStream(filePath);
            prop.load(file);
            value = prop.getProperty(keyValue);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
