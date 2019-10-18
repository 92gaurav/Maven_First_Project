package com.all_data_page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Switch_tabs extends Online_Booking {
	
	@Test
	public void tabs() {
		
		System.out.println("Start Working on Tabs");
		
//		Actions act = new Actions(driver);
//		act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
//		
//		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
//		String tab_title = driver.getTitle();
//		System.out.println("Actions Class first Page title : "+tab_title);
//		
			
		   // driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");	
			
		System.out.println("First Page tab Done");		
		
	}

}
