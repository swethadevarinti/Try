package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\seleniumpractice\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.facebook.com/");
	
	String currenturl=driver.getCurrentUrl();
	System.out.println("currenturl is:"+currenturl);
	String title=driver.getTitle();
	System.out.println("title is:"+title);
	String pagesource=driver.getPageSource();
	System.out.println("pagesource is:"+pagesource);
	
	WebElement username=driver.findElement(By.id("email"));
	username.clear();
	username.sendKeys("vaniyalavarthi134@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Vani@123");
	WebElement loginbutton=driver.findElement(By.name("login"));
	loginbutton.click();
	Thread.sleep(5000);
	driver.close();
}
}
