package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass{
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}	
	
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}

	public String randomAlphNumeric() {
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		String generatedNumber = RandomStringUtils.randomNumeric(3);

		return (generatedString + "@" + generatedNumber);
	}

}
