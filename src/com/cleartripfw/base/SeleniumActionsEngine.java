package com.cleartripfw.base;
  
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class SeleniumActionsEngine  extends DriverEngine{
			private static  WebElement element;
			Select select;
			 public void enterTextById(String id,String testData){
				element = getDriver().findElement(By.id(id));
				if (element.isDisplayed()&&element.isEnabled()) {
					element.clear();
					element.sendKeys(testData);
				}
				else
				{
					System.out.println("unable to perform DATA TYPING ACTION using id methopd");
				}
			}
			
			 public void enterTextByXpath(String xpath,String testData){
					element = getDriver().findElement(By.xpath(xpath));
					if (element.isDisplayed()&&element.isEnabled()) {
						element.clear();
						element.sendKeys(testData);
					}
					else
					{
						System.out.println("unable to perform DATA TYPING ACTION using xpath methopd");
					}
				}
			
			 public void enterTextByCss(String css,String testData){
					element = getDriver().findElement(By.cssSelector(css));
					if (element.isDisplayed()&&element.isEnabled()) {
						element.clear();
						element.sendKeys(testData);
					}
					else
					{
						System.out.println("unable to perform DATA TYPING ACTION using css methopd");
					}
				}
			 
			 public static void clickById(String id)
			 {
				 element = getDriver().findElement(By.id(id));
				 if (element.isDisplayed()&&element.isEnabled()) {
					element.click();
				}
				 else
				 {
					 System.out.println("unable to click by using id method");
				 }
			 }
			 
			 public void clickByXpath(String xpath)
			 {
				 element = getDriver().findElement(By.xpath(xpath));
				 if (element.isDisplayed()&&element.isEnabled()) {
					element.click();
				}
				 else
				 {
					 System.out.println("unable to click by using xpath method");
				 }
			 }
			 
			 public void clickByCss(String css)
			 {
				 element = getDriver().findElement(By.cssSelector(css));
				 if (element.isDisplayed()&&element.isEnabled()) {
					element.click();
				}
				 else
				 {
					 System.out.println("unable to click by using css method");
				 }
			 }
			 public void mouseHover(WebElement element){
				 Actions actions = new Actions(getDriver());
				 actions.moveToElement(element).build().perform();
			 }
			 public void selectByIndex(WebElement element,int index){
				 select = new Select(element);
				 if (element.getTagName().equalsIgnoreCase("select")) {
					 select.selectByIndex(index);
				}
				 else
				 {
					 selectCommon(element);
				 }
			 }
			 
			 public void selectCommon(WebElement element){
				 element.click();
			 }
			 
			 
			 public void selectByValue(WebElement element,String value){
				 select = new Select(element);
				 if (element.getTagName().equalsIgnoreCase("select")) {
					 select.selectByValue(value);;
				}
				 else
				 {
					 selectCommon(element);
				 }
			 }
			 
			 public void selectByVisibleText(WebElement element,String text){
				 select = new Select(element);
				 if (element.getTagName().equalsIgnoreCase("select")) {
					 select.selectByVisibleText(text);;
				}
				 else
				 {
					 selectCommon(element);
				 }
			 }
			 
			 
		}




