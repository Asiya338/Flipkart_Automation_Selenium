package base;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader 
{
	public static ConfigReader reader;
	public static String configPath= System.getProperty("user.dir") + "/src/test/resources/config/configuration.properties";
	public Properties props;
	
	public ConfigReader()
	{
		try {
		FileInputStream fis = new FileInputStream(configPath);
		props = new Properties();
		props.load(fis);
		fis.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getBrowser()
	{
		return props.getProperty("browser");
	}
	
	public String getBaseUrl()
	{
		return props.getProperty("baseurl");
	}
	
	public int getWaitTime()
	{
		return Integer.parseInt(props.getProperty("waittime"));
	}
	
}
