package com.google.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googletitle {

	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium course\\Browser driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.get("http://www.google.com");
		String title=dr.getTitle();
		System.out.println(title);
	}
}
