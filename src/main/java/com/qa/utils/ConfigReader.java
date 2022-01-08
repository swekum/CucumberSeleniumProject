package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public Properties init_prop() {
    FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\SHWETA KUMAR\\IdeaProjects\\CuucumberProject\\src\\test\\resources\\config\\config.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return properties;
}
}
