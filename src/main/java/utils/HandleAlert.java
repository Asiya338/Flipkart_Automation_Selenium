package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class HandleAlert 
{
	public static Alert alert; 
	public static String handleAlert(WebDriver driver)
	{
		alert  = driver.switchTo().alert();
		return alert.getText();
	}
	
	public static void acceptAlert()
	{
		alert.accept();
	}
	
	public static void cancelAlert()
	{
		alert.dismiss();
	}
	
	public static void sendMessage(String msg)
	{
		alert.sendKeys(msg);
	}
}
