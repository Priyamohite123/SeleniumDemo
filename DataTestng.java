package com.qa.datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataTestng {


	@Test(dataProvider="log")
	public void login(String usern, String pass ) {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.facebook.com/");
	d.manage().window().maximize();
	d.findElement(By.xpath(".//*[@id='email']")).sendKeys(usern);
	d.findElement(By.xpath(".//*[@id='pass']")).sendKeys(pass);
	}
	@DataProvider(name="log")
	public static String[][] datadriven() throws BiffException, IOException {
		Properties prop=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\try.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		Sheet s= wb.getSheet(0);
		int r=s.getRows();
		int c=s.getColumns();
		
		String [][]data= new String[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{	
				data[i][j]=s.getCell(j, i).getContents();
						
		}
	}
	return data;
	}}
