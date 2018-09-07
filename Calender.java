package com.qa.calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d;
		//to launch chrome
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Priyankaaa\\chromedriver.exe");
	     d=new ChromeDriver();
         d.get("http://www.eassignments.in/ca/");
		
	  //to max win
      d.manage().window().maximize();
      //to delete cookies
      d.manage().deleteAllCookies();
      //for pageload wait
      //d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      //for implicit wait
      //d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
 
      d.findElement(By.xpath("html/body/div[1]/header/div[2]/div/nav/ul/li[2]/a")).click();
      d.findElement(By.linkText("Candidate Registration")).click();
      Thread.sleep(2000);
      
      
      
      //calender
   d.findElement(By.xpath(".//*[@id='table_client']")).sendKeys("xyz");
      
     d.findElement(By.xpath("//input[@name='bday']")).click();
     
   Select year= new Select(d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[2]")));
     year.selectByValue("1998");
     
    Thread.sleep(3000);
    Select month= new Select(d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/div/select[1]")));
     month.selectByVisibleText("Nov");
      
    Thread.sleep(3000);
    WebElement date= d.findElement(By.linkText("14"));
      date.click();
     
     
      
      //to quit browser
       //d.quit();

	}

}
