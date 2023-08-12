package class29;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class createfile {
    public static void main(String[] args) throws IOException {

         String path="Files/Trump.properties";
        //location of file

        Properties properties=new Properties();
        //creating properties object

        properties.put("USERNAME","bc200416975");
        properties.put("PASSWORD","sysipus*2S");
        //putting the data init

        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //creating the connection to the folder or simply creating thge file

        properties.store(fileOutputStream,"This is second file");
        //storing the data inside the file
        fileOutputStream.close();










    }
}
