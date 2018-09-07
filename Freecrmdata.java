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

public class Freecrmdata {

	@Test(dataProvider="login")
	public void login(String name, String Pass) {
		WebDriver d=new FirefoxDriver();
		d.get("https://www.freecrm.com/index.html");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='loginForm']/div/input[1]")).sendKeys(name);
		d.findElement(By.xpath(".//*[@id='loginForm']/div/input[2]")).sendKeys(Pass);
	}
	@DataProvider(name="login")
	public String[][] data() throws BiffException, IOException {
		Properties p=new Properties();
		FileInputStream f=new FileInputStream("D:\\Pradeep\\Vt\\WebDriver\\PriyankaAll\\src\\com\\data\\try.xls");
		Workbook w=Workbook.getWorkbook(f);
		int r=w.getSheet(0).getRows();
		int c=w.getSheet(0).getColumns();
		String[][]data=new String[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				data[i][j]=w.getSheet(0).getCell(j, i).getContents();
			}
		}
		return data;
	}
}
