package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;

public class TC004_SearchProductTest extends BaseClass {

	@Test(groups= {"Master"})
	public void verify_productSearch()  throws InterruptedException{
		
		logger.info(" Starting TC004_SearchProductTest ");

		try {

			HomePage hm = new HomePage(driver);

			//hm.enterProductName("iPhone");
			hm.enterProductName("mac");

			hm.clickSearch();

			SearchPage sp = new SearchPage(driver);
			sp.isProductExits("MacBook");

			Assert.assertEquals(sp.isProductExits("MacBook"), true);

		} catch (Exception e) {
			Assert.fail();
		}
		
		logger.info(" Finished TC004_SearchProductTest ");

	}

}
