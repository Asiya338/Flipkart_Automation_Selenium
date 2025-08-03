package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import pages.CartPage;
import base.DriverSetup;

public class CartTest 
{
	public static WebDriver driver;
	public CartPage cartpage;
	public DriverSetup setup;
	
	@BeforeClass
	public void OpenFlipkart()
	{
		setup = new DriverSetup();
		driver = setup.initializeBrowser();
		setup.openApplication();
		cartpage = new CartPage(driver);	
	}
	
	@Test(priority=1)
	public void ClickCart()
	{
		cartpage.clickCartBtn();
	}
	
	@Test(priority=2)
	public void CartItems()
	{
		System.out.println("Cart Items : " + cartpage.getCartElmt());
	}
	
	@Test(priority=3)
	public void getTitlePage()
	{
		System.out.println("=========================< The Cart Page >=======================");
		setup.getTitle();
	}
	
	@AfterClass
	public void CloseFlipkart()
	{
		setup.closeDriver();
	}
	
}
