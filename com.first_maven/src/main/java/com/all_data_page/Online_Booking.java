package com.all_data_page;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Online_Booking extends login_page {
	
	

	@Test
	public void booking() throws IOException {
		
		System.out.println("Booking Page");
//		WebElement logo_text = driver.findElement(By.xpath("/html[1]/body[1]/nav[1]/div[1]/div[2]/ul[2]/ul[1]/li[1]/a[1]"));
//		String username = logo_text.getText();
//		System.out.println("Login user name is : "+username);
//		System.out.println("You have successfully logged in : "+logo_text);
//		
		
		
		
	}
	@Test
	public void takeScreenshot(WebDriver webDriver) {

	    try {
	       File source = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

	       FileUtils.copyFile(source, new File ("/home/oci/git/Maven_First_Project/com.first_maven/Screen_Shots.png"));
	       System.out.println("Screenshot Taken!!!!");

	    	} catch (IOException e) {
	        e.printStackTrace();
	    } 
	}

}
