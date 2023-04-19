package basicjava;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium-practice\\Seleniumpractice\\Drivers\\chromedriver.exe");
		
		//ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		//RemoteWebDriver driver=new ChromeDriver();
	SearchContext sc=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.close();
		Thread.sleep(5000);

	}

}
