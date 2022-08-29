package Utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class utility {
    public static String getValue (String key) throws IOException {
        Properties prop= new Properties();
        FileReader reader= new FileReader("data.properties");
        prop.load(reader);
        String value=prop.getProperty(key);
        return value;
    }
}
