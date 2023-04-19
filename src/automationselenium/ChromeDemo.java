package automationselenium;

import javax.swing.text.PasswordView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\Seleniumpractice\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
		String title =driver.getTitle();
		System.out.println("title is: "+title);
		
		String currenturl=driver.getCurrentUrl();
		System.out.println("currenturl is:"+currenturl);
		
		String windowhandle =driver.getWindowHandle();
		System.out.println("current window name is:"+windowhandle  );

		
		WebElement username=driver.findElement(By.id("identifierId"));
		
		username.clear();
		username.sendKeys("vanichowdary0610@gmail.com");
		
		
		 WebElement nextEle =driver.findElement(By.id("identifierNext"));
		 nextEle.click();
		 
		WebElement Enterpassword=driver.findElement(By.name("Enterpassword"));
		Enterpassword.clear();
		Enterpassword.sendKeys("9908933630");
		
		WebElement next=driver.findElement(By.id("identifierNext"));
		
		next.click();
	
		
		
	}

}
