package com.sourcedemo.testing.utils;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    private Properties properties;
    public PropertyReader() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("confing.properties"));
            String currentAny = properties.getProperty("user");
            Properties userProps = new Properties();
            userProps.load(getClass().getClassLoader().getResourceAsStream(currentAny + ".properties"));
            properties.putAll(userProps);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getProperty(String key) {return properties.getProperty(key);}
    public String getUserName() {return getProperty("username");}
    public String getPassword() {return getProperty("password");}
}
