package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\seleniumpractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		Actions actions=new Actions(driver);
		WebElement electronics= driver.findElement(By.xpath("//div[@class='xtXmba'][text()='Electronics']"));
		actions.moveToElement(electronics).build().perform();
		
	driver.close();

	}

}
