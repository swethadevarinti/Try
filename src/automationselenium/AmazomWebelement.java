package automationselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class AmazomWebelement {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\seleniumpractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		
	WebElement search =driver.findElement(By.id("twotabsearchtextbox"));
	search.click();
	search.sendKeys("Toys");
	

		driver.findElement(By.id("nav-search-submit-button")).click();
//List mobiles =driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div"));
//System.out.println(mobiles.size());

		List toys =driver.findElements(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div"));
		System.out.println(toys.size());

	}

}
