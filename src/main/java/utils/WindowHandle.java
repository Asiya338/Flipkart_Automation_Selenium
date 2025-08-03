package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandle 
{
	public static WebDriver driver;
	
	public WindowHandle(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public static void windowHandle()
	{
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window : " + driver.getTitle());
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String window : allWindows)
		{
			driver.switchTo().window(window);
			String childWindow = window;
			System.out.println("Child Window : " + driver.getTitle());
		}
		
		driver.switchTo().window(parentWindow);
	}
	
}
