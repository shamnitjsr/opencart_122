package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass {

//	@Test(enabled = false)
//	void verify_account_registration_01() {
//
//		HomePage hp = new HomePage(driver);
//		hp.clickMyAccount();
//		hp.clickRegister();
//
//		AccountRegistrationPage regPage = new AccountRegistrationPage(driver);
//		regPage.setFirstName("Shambhu");
//		regPage.setLastName("Kumar");
//		regPage.setEmail("Sham@gmail.com");
//		regPage.setTelephone("7687546789");
//		regPage.setPassword("1234");
//		regPage.setConfirmPassowrd("1234");
//		regPage.setPrivacyPolicy();
//		regPage.clickContinue();
//
//		String confmsg = regPage.getConfirmationMsg();
//
//		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
//	}

	@Test(groups={"Regression","Master"})
	void verify_account_registration() {

		logger.info("***** Starting TC001_AccountRegistrationTest *****");

		try {
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link...");

			hp.clickRegister();
			logger.info("Clicked on Register Link...");

			AccountRegistrationPage regPage = new AccountRegistrationPage(driver);

			logger.info("Providing Customer details...");

			regPage.setFirstName(randomString().toUpperCase());
			regPage.setLastName(randomString().toUpperCase());
			regPage.setEmail(randomString() + "@gmail.com"); // Random generated the email
			regPage.setTelephone("7687546789");

			String password = randomAlphNumeric();
			regPage.setPassword(password);
			regPage.setConfirmPassowrd(password);

			regPage.setPrivacyPolicy();
			regPage.clickContinue();

			logger.info("Validating expected message...");
			String confmsg = regPage.getConfirmationMsg();

			if (confmsg.equals("Your Account Has Been Created!")) {
				Assert.assertTrue(true);
			} else {

				logger.error("Test Failed...");
				logger.debug("Debug logs...");
				Assert.assertTrue(false);

			}

		} catch (Exception e) {

			Assert.fail();

		}

		logger.info("***** Finished TC001_AccountRegistrationTest *****");

	}

}
