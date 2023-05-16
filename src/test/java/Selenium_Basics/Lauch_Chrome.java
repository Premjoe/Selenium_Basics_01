package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauch_Chrome {

	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver", "/Users/prem/Documents/Automation/Driver/chromedriver_mac_arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
		

	}

}
