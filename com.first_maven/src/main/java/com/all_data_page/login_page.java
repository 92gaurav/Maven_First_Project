package com.all_data_page;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login_page extends BrowserFactory {
	
	
	WebDriver driver;
	
	@Test
	public void firstpage(WebDriver ldriver) {
		
		this.driver = ldriver;
		
	}
	
		@FindBy (how=How.ID,using="user-name")
		@CacheLookup
		private WebElement user;

		@FindBy (how=How.ID,using="password")
		@CacheLookup
		private WebElement pass;
		
		@FindBy (how=How.XPATH,using="/html/body/div[2]/div[1]/div[1]/div/form/input[3]")
		WebElement login_button;
		
		@Test
		public void page(String user_key, String pass_key) throws InterruptedException{
			
			user.sendKeys(user_key);
			pass.sendKeys(pass_key);
			Thread.sleep(2000);
			login_button.click();
			
		}
		
		
	

}
