package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import pages.SearchPage;
import base.DriverSetup;
import org.testng.Assert;

public class SearchTest 
{
	public static WebDriver driver;
	public SearchPage searchpage;
	public DriverSetup setup;
	
	@BeforeClass
	public void OpenFlipkart()
	{
		setup = new DriverSetup();
		driver = setup.initializeBrowser();
		setup.openApplication();
		searchpage = new SearchPage(driver);	
	}
	
	@DataProvider(name="SearchData")
	public Object[][] getSearchData()
	{
		return new Object[][] {
			{"Mobiles under 15000"},
			{"Refrigerator"},
			{"Washing Machine"}
		};
	}
	
	
	@Test(priority=1, dataProvider="SearchData")
	public void searchMobile(String searchItem)
	{
		//String searchItem = "Mobiles";
		searchpage.enterSearch(searchItem);
		//String title = driver.getTitle();
		//Assert.assertTrue(title.toLowerCase().contains(searchItem.toLowerCase().split(" ")[0]) , ""
			//	+ "Search title doesn't contains as expected : " + searchItem);
		
		searchpage.clickSearch();
		System.out.println("=========================< The Search Page >=======================");
		setup.getTitle();
	}

	
	@AfterClass
	public void CloseFlipkart()
	{
		setup.closeDriver();
	}
}
