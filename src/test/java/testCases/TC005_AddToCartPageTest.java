package testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;

public class TC005_AddToCartPageTest extends BaseClass {
	
	@Test(groups= {"Master"})
	public void verify_addCart() {

		logger.info(" Starting TC005_AddToCartPageTest ");
		try {
			
			HomePage hp = new HomePage(driver);
			
			hp.enterProductName("iPhone");
			hp.clickSearch();
			
			SearchPage sp = new SearchPage(driver);
			
			if(sp.isProductExits("iPhone")) {
				sp.selectProduct("iPhone");
				sp.setQuantity("2");
				sp.addToCart();
			}
			
			Assert.assertEquals(sp.checkConfMsg(), true);
			
		} catch(Exception e) {
			Assert.fail();
		}
		
		logger.info(" Finished TC005_AddToCartPageTest ");
	}

}
