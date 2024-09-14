package testCases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteWebDriverExample {

	public static void main(String[] args) {
		
		try {
			
			//Set up desired capabilities (e.g., browser, plateform)
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setBrowserName("chrome");
			capabilities.setPlatform(Platform.ANY);
			
			URL gridUrl = new URL("http://localhost:4444/wd/hub");
			
			//create a RemoteWenDriver instance, specifying the selenium Grid URL
			
			WebDriver driver = new RemoteWebDriver(gridUrl, capabilities);
			
			//perform your test actions using the RemoteWebDriver
			
			driver.get("https://www.google.com/");
			
			System.out.println(driver.getTitle());
			
			System.out.println(driver.getCurrentUrl());
			
			driver.quit();
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}

	}

}
