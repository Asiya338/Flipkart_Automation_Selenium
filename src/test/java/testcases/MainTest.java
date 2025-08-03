package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import pages.MainPage;
import base.DriverSetup;
import org.testng.Assert;

public class MainTest
{
	public static WebDriver driver;
	public MainPage mainpage;
	public DriverSetup setup;
	
	@BeforeClass
	public void OpenFlipkart()
	{   setup = new DriverSetup();
		driver = setup.initializeBrowser();
		setup.openApplication();
		mainpage = new MainPage(driver);	
	}
	
	@Test(priority=1)
	public void TestMainPage()
	{
		String tooltip = mainpage.getTooltip();
		System.out.println("Main search Tooltip : "  + tooltip);
		Assert.assertEquals(tooltip , "Search for Products, Brands and More");
	}
	
	@Test(priority=2)
	public void getTitlePage()
	{
		System.out.println("=========================< The Main Page >=======================");
		setup.getTitle();
	}
	
	@Test(priority=3)
	public void getElectronicsTitle()
	{
		mainpage.clickElectronics();
		System.out.println("=========================< The Electronics Page >======================");
		System.out.println(mainpage.getElectronics());
	}
	
	@AfterClass
	public void CloseFlipkart()
	{
		setup.closeDriver();
	}
}
