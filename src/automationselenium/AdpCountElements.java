package automationselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AdpCountElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\Seleniumpractice\\Drivers\\chromedriver.exe");
		

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.adp.com/");
		List <WebElement> element=driver.findElements(By.xpath("//*"));
		System.out.println("no of elements are:  +elements.size");
		
		Thread.sleep(9000);
		
	

	}

}
