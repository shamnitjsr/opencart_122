package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastname;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;

	@FindBy(xpath = "//input[@name = 'agree']")
	WebElement chkdPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLastname.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

	public void setTelephone(String telephone) {
		txtTelephone.sendKeys(telephone);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void setConfirmPassowrd(String confirmPassword) {
		txtConfirmPassword.sendKeys(confirmPassword);
	}

	public void clickAgree() {
		chkdPolicy.click();
	}

	public void clickContinue() {

		// Sol1
		btnContinue.click();

//		//Sol2
//		btnContinue.submit();
//		
//		//Sol3
//		Actions act = new Actions(driver);
//		act.moveToElement(btnContinue).click().perform();
//		
//		//Sol4
//		btnContinue.sendKeys(Keys.RETURN);
//		
//		//Sol5
//		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
//		
//		//Sol6
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("argument[0].click();", btnContinue);

	}

	public String getConfirmationMsg() {
		try {

			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}

}
