package automationselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Seleniumbasics {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium-practice\\seleniumpractice\\src\\automationselenium\\Seleniumbasics.java");

		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
       WebElement userName= driver.findElement(By.id("indentifierId"));
        
       if (userName.isDisplayed()&&userName.isEnabled()) {
    	   userName.clear();
           userName.sendKeys("vaniyalavarthi134@gmail.com");
	}
       else {
		System.out.println("sytem name is not displayed");
	}
       String idvalue=userName.getAttribute("id");
       System.out.println("usernameidvalueis:"+idvalue);
           
       String typevalue=userName.getAttribute("type");
       System.out.println("usernametypevalueis:"+typevalue);
       
       String namevalue=userName.getAttribute("name");
       System.out.println("usernamenamevalueis:"+namevalue);
       
       String classvalue=userName.getAttribute("class");
       System.out.println("usernameclassvalueis:"+classvalue);
       
       
       
       
       
	
        
		
	}

}
