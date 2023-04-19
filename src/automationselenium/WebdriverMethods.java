package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\seleniumpractice\\Drivers\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("https://www.amazon.in/");
		String currenturl = d.getCurrentUrl();
		System.out.println("current url is............" +currenturl);
		System.out.println("Pagesource is ......" +d.getPageSource());
		String Title = d.getTitle();
		
		System.out.println("Title is ............"+Title );
		//WebElement search = d.findElement(By.id("twotabsearchtextbox"));
		WebElement search = d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.clear();
		search.sendKeys("Mobile");
		
		Thread.sleep(5000);
		d.close();
		
	}

}
