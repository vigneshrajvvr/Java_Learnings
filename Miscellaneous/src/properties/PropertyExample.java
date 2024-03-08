package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertyExample {
    public static void main(String[] args) throws Exception {
        /*
        Reading properties from file and accessing using Properties
         */
        FileReader reader = new FileReader("db.properties");

        Properties properties = new Properties();
        properties.load(reader);

        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));

        /*
        Reading system properties
         */
        Properties properties1 = System.getProperties();
        Set set = properties1.entrySet();
        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        /*
        Creating properties file
         */
        Properties newProperty = new Properties();
        newProperty.setProperty("name", "Test");
        newProperty.setProperty("email", "test@gmail.com");

        newProperty.store(new FileWriter("info.properties"), "Properties Example");

    }
}

