package com.all_data_page;

import org.testng.annotations.Test;


import Reader.Xls_Reader;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_page extends BrowserFactory {
		
	WebDriver driver;
	
	@Test
	public void firstpage(WebDriver ldriver) {
		
		this.driver = ldriver;
		
	}
		
		static String url_link;
	
		@FindBy (how=How.XPATH, using="//a[@title='Log in to your customer account']")
		@CacheLookup
		WebElement myaccount;
		
		@FindBy (how=How.ID, using="email")
		@CacheLookup
		WebElement clickemail;
		
		@FindBy (how=How.NAME,using="username")
		@CacheLookup
		private WebElement user;
		
		@FindBy (how=How.ID, using="passwd")
		@CacheLookup
		WebElement clickpass;

		@FindBy (how=How.NAME,using="password")
		@CacheLookup
		private WebElement pass;
		
		@FindBy (how=How.XPATH,using="//button[@id='SubmitLogin']//span")
		WebElement login_button;
		
	@Test
	public void sheet(String name, String passwds) throws InterruptedException, IOException {
			
			Thread.sleep(2000);
			myaccount.click();	
			System.out.println("my account clicked");
			Thread.sleep(4000);
			Xls_Reader reader = new Xls_Reader("/home/oci/Documents/selenium/data_driven_framework.xlsx");
			
			System.out.println("Printing Xls_Reader : "+reader);
			
			for(int i=2; i<=7; i++) {
				
			//	for(int j=2; j<=i; j++) {				
				
				
				name = reader.getCellData("Sheet1", "user", i);		
				
				System.out.println("List of names : "+name);
				clickemail.sendKeys(name);	
				
//			for(int k=2; k<=7; k++) {
				
				//for(int p=2; p<=i; p++) {
					
				
					
					passwds = reader.getCellData("Sheet1", "password", i);			
					System.out.println("List of Passwords : "+passwds);
					clickpass.sendKeys(passwds);
					System.out.println();
					Thread.sleep(2000);
					
					if (i!= 7) {
						
					Thread.sleep(1000);
					clickemail.clear();
					clickpass.clear();
					}
			//	}
					
//				}		
					
			
		//		}
			}			login_button.click();
			System.out.println("Click login button");

			
//					URL link = new URL(url_link);
//					HttpURLConnection http_Conn =(HttpURLConnection)link.openConnection();
//					http_Conn.setConnectTimeout(1000);
//					http_Conn.connect();
//					 
//					 if(http_Conn.getResponseCode()== 200) { 
//					
//						 System.out.println(url_link+" -- "+http_Conn.getResponseMessage());
//						 System.out.println("You have Successfully login");
//					 
//					 }
//					 
//					 else {
//						 System.out.println("Invalid Credentials ! Try again ");
//				
//					 }		
	}
			}	
			
		
//		@Test
//		public void page(String user_key, String pass_key) throws InterruptedException{
//			
//			Thread.sleep(4000);
//			myaccount.click();	
//			clickemail.sendKeys(user_key);
//			
//			clickpass.sendKeys(pass_key);
//			Thread.sleep(4000);
//			login_button.click();
//			
//		}
