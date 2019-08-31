package com.all_data_page;

import org.testng.annotations.Test;
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
		
	
		@FindBy (how=How.XPATH, using="//ul[@class='nav navbar-nav navbar-right hidden-sm go-left']//b[@class='lightcaret mt-2 go-left']")
		@CacheLookup
		WebElement myaccount;
		
		@FindBy (how=How.XPATH, using="//nav[@class='navbar navbar-default']//ul[@class='dropdown-menu']//li[1]//a[1]")
		@CacheLookup
		WebElement loginlink;
		
		@FindBy (how=How.NAME,using="username")
		@CacheLookup
		private WebElement user;

		@FindBy (how=How.NAME,using="password")
		@CacheLookup
		private WebElement pass;
		
		@FindBy (how=How.XPATH,using="//*[@id=\"loginfrm\"]/button")
		WebElement login_button;
		
		@Test
		public void page(String user_key, String pass_key) throws InterruptedException{
			
			Thread.sleep(4000);
			myaccount.click();
			loginlink.click();
			user.sendKeys(user_key);
			pass.sendKeys(pass_key);
			Thread.sleep(4000);
			login_button.click();
			
		}

}
