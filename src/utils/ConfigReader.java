package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigReader {

    public static String read1(String path,String key) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(fileInputStream);

        return properties.getProperty(key);
        //getting  the value for a specific key and returning it
    }
    public static String read2(String key) throws IOException {
        return read1("Files/config.properties",key);
    }
}


