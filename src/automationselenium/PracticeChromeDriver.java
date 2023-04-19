package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeChromeDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium-practice\\seleniumpractice\\Drivers\\chromedriver.exe");
		
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String currenturl=driver.getCurrentUrl();
		System.out.println("currenturlis:"+currenturl);
		
		String windowhandle=driver.getWindowHandle();
		System.out.println("windowhandleis:"+windowhandle);
		
		driver.get("https://www.gmail.com");
	
		WebElement username=driver.findElement(By.id("identifierid"));
		username.clear();
		username.sendKeys("vaniyalavarthi134@gmail.com");
		
		
		WebElement nextEle =driver.findElement(By.id("identifierNext"));
		 nextEle.click();
		
		 driver.close();
		
		
		
	}

}
