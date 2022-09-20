package Utils;

import java.io.*;
import java.util.Properties;

public class utility {
    static Properties prop;
    static  FileInputStream in;
    static FileOutputStream out;
    static FileReader reader;
    public static String getValue (String key) throws IOException {
       prop= new Properties();
       reader= new FileReader("data.properties");
        prop.load(reader);
        String value=prop.getProperty(key);
        reader.close();
        return value;

    }
    public static void setValue(String key, String value) throws IOException {
         in = new FileInputStream("data.properties");
        prop = new Properties();
        prop.load(in);
        in.close();

        out = new FileOutputStream("data.properties");
        prop.setProperty(key, value);
        prop.store(out, null);
        out.close();


    }

}
