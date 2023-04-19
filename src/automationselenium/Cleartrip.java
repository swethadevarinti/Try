package automationselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium-practice\\seleniumpractice\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS );
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.xpath("//*[@width=\"22\"]")).click();
		//driver.findElement(By.linkText("//*[text()='Flights']")).click();
		Actions action=new Actions(driver);
		WebElement flights=driver.findElement(By.xpath("//div[@class='ml-4 mr-2 c-secondary-500 fs-4 fw-500 flex flex-1'][text()='Flights']"));
		action.moveToElement(flights).build().perform();
		Thread.sleep(4000);
		
		WebElement oneway =driver.findElement(By.xpath("//span[@class='fw-500 fs-4 ml-2'][text()='One way']"));
		
		action.moveToElement(oneway).build().perform();
		oneway.click();
		driver.findElement(By.xpath("//span[text()='Round trip']")).click();
		driver.findElement(By.xpath("//span[contains(text(),' Adult, Economy')]")).click();   //adult economy
		WebElement adultselect=driver.findElement(By.xpath("//div[@value='travellerAndClass']/div/div[1]/ul/li[3]"));
		action.doubleClick(adultselect).build().perform();
	//driver.findElement(By.xpath("//input[@class='w-100p fs-4 fw-500 c-neutral-500']")).click();   //where
		WebElement childselect=driver.findElement(By.xpath("//div[@value='travellerAndClass']/*/div[2]//ul/li[3]"));  //children
		action.doubleClick(childselect).build().perform();
		WebElement infantselect=driver.findElement(By.xpath("//div[@value='travellerAndClass']/div/div[3]/ul/li[3]"));  //infant
		action.doubleClick(infantselect).build().perform();
		
		WebElement from = driver.findElement(By.xpath("//input[@class='w-100p fs-4 fw-500 c-neutral-500']"));  //where from
		from.click();   
		from.sendKeys("hyd");
		
		WebElement fromcity=driver.findElement(By.xpath("//*[text()='Hyderabad, IN - Rajiv Gandhi International (HYD)']"));
		Thread.sleep(10000);
		action.moveToElement(fromcity).build().perform();
		Thread.sleep(5000);
		//fromcity.clear();
		
			Thread.sleep(5000);
			
			driver.close();

		
		
				
		
				
		
		
		
		
		
		
	
		
		

	} 

}
