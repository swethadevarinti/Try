package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webpageinsideanotherelement {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\seleniumpractice\\Drivers\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/autocomplete/");
		 driver.findElement(By.linkText("Autocomplete")).click();
		  Thread.sleep(1000);
		  //driver.switchTo().frame(0);
		 TargetLocator targetlocator= driver.switchTo();
		 targetlocator.frame(0);
		  
		  driver.findElement(By.id("tags")).sendKeys("vani");
		  Thread.sleep(5000);
		 
		  driver.switchTo().defaultContent();
		  driver.findElement(By.linkText("Draggable")).click();
		  driver.switchTo().frame(0);
		  
		  WebElement drag =driver.findElement(By.id("draggable"));
		  Actions actions=new Actions(driver);
		  
		  
		  actions.dragAndDropBy(drag, 240, 240);
		 // driver.close();
		  
		  
		  

	
	}}


