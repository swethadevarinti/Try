package com.clear.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClearTest {
 
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new FirefoxDriver();
		//System.setProperty("Drivers.chrome.driver", "D:\\workspace\\ClearTrip\\Drivers\\env.properties");
		//WebDriver d=new ChromeDriver();
		d.get("https://www.cleartrip.com/?gclid=EAIaIQobChMIgJzJnJ6p1wIVTSUrCh05BAH7EAAYASAAEgJqdPD_BwE");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(89, TimeUnit.SECONDS);
		d.findElement(By.id("RoundTrip")).click();
		WebElement fromtag=d.findElement(By.id("FromTag"));
		fromtag.sendKeys("hyd");
		Thread.sleep(3000);
		Actions a=new Actions(d);
		List<WebElement> hyd=d.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		System.out.println(hyd.size());
		
		WebElement hyd1=d.findElement(By.id("ui-id-7"));
		a.moveToElement(hyd1).click().build().perform();
		
		WebElement to=d.findElement(By.id("ToTag"));
		to.sendKeys("bang");
		Thread.sleep(3000);
		WebElement bang =d.findElement(By.linkText("Bangalore, IN - Kempegowda International Airport (BLR)"));
		a.moveToElement(bang).click().build().perform();
		
		d.findElement(By.id("DepartDate")).click();
		WebElement depart=d.findElement(By.linkText("15"));
		a.moveToElement(depart).click().build().perform();
		
		d.findElement(By.id("ReturnDate")).click();
		WebElement retn=d.findElement(By.linkText("30"));
		a.moveToElement(retn).click().build().perform();

		WebElement adult =d.findElement(By.id("Adults"));
		org.openqa.selenium.support.ui.Select s= new org.openqa.selenium.support.ui.Select(adult);
		List<WebElement> elements=s.getOptions();
		System.out.println(elements);
		s.selectByVisibleText("2");
		

		WebElement child =d.findElement(By.id("Childrens"));
		org.openqa.selenium.support.ui.Select s1= new org.openqa.selenium.support.ui.Select(child);
		s1.selectByVisibleText("1");
		
		WebElement infant =d.findElement(By.id("Infants"));
		org.openqa.selenium.support.ui.Select s2= new org.openqa.selenium.support.ui.Select(infant);
		s2.selectByVisibleText("1");
		
		d.findElement(By.id("SearchBtn")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
