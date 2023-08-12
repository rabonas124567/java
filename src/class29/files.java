package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class files {
    public static void main(String[] args) throws IOException {

        String path="Files/config.properties";
        //location of file inide our project

        FileInputStream fileInputStream=new FileInputStream(path);
        //creating a connection to that file or navigating to that file

        Properties properties=new Properties();
        //that special program that help to read that file

        properties.load(fileInputStream);
        //loading the data inside properties object from the file

        System.out.println(properties.get("Password"));
        System.out.println(properties.get("UserId"));
        //getting the values for corresponding keys
        fileInputStream.close();










    }
}
