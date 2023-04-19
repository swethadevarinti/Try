package com.clear.test;

import java.io.IOException;
import java.util.Properties;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.cleartrip.utilities.PropertiesReusable;
import com.cleartripfw.base.DriverEngine;
import com.cleartripfw.base.SeleniumActionsEngine;

public class ClearTripFrame extends DriverEngine {
  
	@Test
	public void clear() throws IOException, InterruptedException{
		PropertiesReusable pr =new PropertiesReusable(ClearTripConstants.getconfigFilePath());
		String url=pr.getPropertyValue("url");
		System.out.println(url);
	     getDriver().get(url);
	    
	   PropertiesReusable pr1=new PropertiesReusable(ClearTripConstants.getorFilePath());
	    String round_trip=pr1.getPropertyValue("round_trip");
	    String fromtag =pr1.getPropertyValue("fromtag");
	    String fromtext=pr1.getPropertyValue("fromtext");
	    String  hyd =pr1.getPropertyValue("hyd");
	    String totag=pr1.getPropertyValue("totag");
	    String totext=pr1.getPropertyValue("totex");
	    String bang=pr1.getPropertyValue("bang");
	    String departdate=pr1.getPropertyValue("departdate");
	    String depart=pr1.getPropertyValue("depart");
	    String returndate=pr1.getPropertyValue("returndate");
	    String retrn =pr1.getPropertyValue("retrn");
	    Thread.sleep(3000);
	    SeleniumActionsEngine.clickById(round_trip);
	   // s.enterTextById(fromtag, "hyd");
	    //s.clickById(round_trip);
	   System.out.println(round_trip);
	}
	
	
}
