package com.Testcase;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.all_data_page.BrowserFactory;
import com.all_data_page.Online_Booking;
import com.all_data_page.login_page;

public class Verify_data{
	
	@Test
	public void checkverify() throws InterruptedException, IOException {
		
		WebDriver driver=BrowserFactory.Browser("input_browser", "https://www.phptravels.net/");
				
		login_page login = PageFactory.initElements(driver, login_page.class);
		login.page("test112@gmail.com", "123456");
		System.out.println("Login class work");
		Online_Booking book = PageFactory.initElements(driver, Online_Booking.class);
		System.out.println("Online_Booking class work");
		book.booking();
		book.takeScreenshot(driver);
		
	}
	
}
