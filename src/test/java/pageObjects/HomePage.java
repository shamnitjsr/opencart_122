package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;

	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;

	@FindBy(linkText = "Login")
	WebElement linkLogin;

	@FindBy(xpath = "//input[@placeholder='Search']") // For Search Product Test
	WebElement txtSearchbox;

	@FindBy(xpath = "//div[@id='search']//button[@type='button']") // For Search Product Test
	WebElement btnSearch;

	public void clickMyAccount() {
		lnkMyaccount.click();
	}

	public void clickRegister() {
		lnkRegister.click();
	}

	public void clickLogin() {
		linkLogin.click();
	}

	// For Search Product Test
	public void enterProductName(String pName) {

		txtSearchbox.sendKeys(pName);
	}

	// For click search element
	public void clickSearch() {

		btnSearch.click();
	}
}
