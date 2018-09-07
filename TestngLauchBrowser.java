package com.qa.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestngLauchBrowser {

	WebDriver d;
	
	@BeforeSuite
	public void setup() {
		}
	@BeforeClass
	public void deletecookies() {
	}
	@BeforeMethod
	public void launch() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Priyankaaa\\chromedriver.exe");
//		d=new ChromeDriver();
//		d.get("https://www.facebook.com/");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\Priyankaaa\\geckodriver.exe");
		d=new FirefoxDriver();
		d.get("https://www.facebook.com/");
	}
	@Test
	public void lauchchromenff() {	
	}
	@AfterMethod
	public void teardown() {
		d.manage().deleteAllCookies();
	}
	@AfterClass
	public void delet() {
		d.navigate().refresh();
	}
	@AfterSuite
	public void refresh()
	{
		d.quit();
	}
}
