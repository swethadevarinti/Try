package com.cleartripfw.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class DriverEngine extends DriverUtilities{

	 static WebDriver d;
	@Parameters("browser")
	@BeforeSuite
	public void openbrowser(@Optional("firefoxdriver")String browser){
		if(browser.equalsIgnoreCase("firefoxdriver")){
			System.setProperty("Drivers.firefox.driver", "D:\\selenium Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			d=new FirefoxDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		}
		else if(browser.equalsIgnoreCase("chrome")){
			d=new ChromeDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
			
		}
		else if(browser.equalsIgnoreCase("ie")){
			d=new InternetExplorerDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		}else {
			d=new HtmlUnitDriver();
		}}
	
	
		@AfterSuite
		public void closeBrowser(){
			d.close();
		}
       
		public static WebDriver getDriver() {
			return d;
		}
	
}
