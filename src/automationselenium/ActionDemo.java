package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\seleniumpractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
          driver.manage().deleteAllCookies();
          driver.manage().window().maximize();
          driver.get("https://www.gmail.com");
          
          WebElement username=driver.findElement(By.id("identifierId"));
          //username.sendKeys("vaniyalavarthi134@gmail.com");
          
          Actions actions=new Actions(driver);
          //actions.sendkeys(username,"vaniyalavarthi134@gmail.com").buid().perform();
	
          actions.click(username).sendKeys("vaniyalavarthi134@gmail.com").build().perform();
          
          actions.sendKeys(Keys.chord(Keys.CONTROL),"t").build().perform();
          
          
         
          Thread.sleep(5000);
          driver.close();
	}
}