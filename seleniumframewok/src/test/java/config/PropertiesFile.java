package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.test.TestNGDEmo;

public class PropertiesFile {
	private static Properties prop = new Properties();
	static String projectPath;
	public static void getProperties() throws IOException
	{
		try{
		projectPath = System.getProperty("user.dir");
		
		InputStream input = new FileInputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println("browser name:"+browser);
		TestNGDEmo.browserName=browser;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void writeToProperties()
	{
		try{
			OutputStream output = new FileOutputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
			prop.setProperty("result", "pass");
			prop.store(output, "store to property file");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		getProperties();
		writeToProperties();
		getProperties();
	}

}
