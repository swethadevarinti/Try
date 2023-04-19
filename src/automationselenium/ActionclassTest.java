package automationselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionclassTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\seleniumpractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		Actions actions1=new Actions(driver);   //action class object

		//find element
		WebElement create =driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']\r\n"));
		actions1.click(create).build().perform();
		WebElement firstname =driver.findElement(By.name("firstname"));
		//actions1.click(firstname).build().perform();
		actions1.sendKeys(firstname, "vani").build().perform();
		//actions1.contextClick().sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select sel1 = new Select(day);
		System.out.println(sel1.getOptions());
		sel1.selectByValue("4");
		sel1.selectByIndex(11);
		sel1.selectByVisibleText("25");
		sel1.deselectByIndex(10);
		sel1.deselectAll();
		
		
		
	}

}
