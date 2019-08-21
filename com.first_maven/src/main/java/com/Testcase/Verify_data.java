package com.Testcase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.all_data_page.BrowserFactory;

import com.all_data_page.login_page;

public class Verify_data{
	
	@Test
	public void checkverify() throws InterruptedException {
		
		WebDriver driver=BrowserFactory.Browser("input_browser", "https://www.phptravels.net/");
				
		login_page login = PageFactory.initElements(driver, login_page.class);
		
		login.page("admin111@yopmail.com", "123456");
		
	}
	
	
}
