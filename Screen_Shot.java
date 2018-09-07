package String;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileSystemUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;

public class Screen_Shot {

	public static void main(String[] args) throws Exception {
		WebDriver d;
		d= new FirefoxDriver();
		d.get("https://www.freecrm.com/index.html");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		File srcfile=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		String currentdir=System.getProperty("user.dir");
		org.apache.commons.io.FileUtils.copyFile(srcfile,new File("D:\\ppppp" +"/ScreenShot/" + System.currentTimeMillis()+".png"));
		
		
		
		

	}

}
