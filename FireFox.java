package com.qa.launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
	WebDriver d;
////	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\Priyankaaa\\geckodriver.exe");
//	d=new FirefoxDriver();
//	d.get("https://www.youtube.com/watch?v=8oWElXB3XQU");
//	d.manage().window().maximize();
//	d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Priyankaaa\\chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://www.youtube.com/watch?v=8oWElXB3XQU");
	d.manage().window().maximize();
	d.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
