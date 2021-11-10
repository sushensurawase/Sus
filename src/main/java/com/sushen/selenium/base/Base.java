package com.sushen.selenium.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebDriver;

public class Base {

	public static WebDriver driver = null;
	private static FileInputStream fis = null;

	public static void main(String... args) throws IOException {
		String propFilePath = System.getProperty("user.dir")
				+ "\\src\\main\\java\\com\\sushen\\selenium\\config\\cofig.properties";
		fis = new FileInputStream(propFilePath);
		Properties prop = new Properties();
		prop.load(fis);
		if (driver == null) {
			switch (prop.getProperty("browserName")) {
			case "chrome": {
				{
					System.out.println("chrome");
					break;
				}
			}

			case "firefox": {
				{
					System.out.println("firefox");
					break;
				}
			}

			}
		}

	}

}
