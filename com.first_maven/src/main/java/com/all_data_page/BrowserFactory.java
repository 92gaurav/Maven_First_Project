package com.all_data_page;

import org.testng.annotations.Test;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	@Test
	public static WebDriver Browser(String browsername, String url) {
			
		String ch = "Chrome";
		String fx = "Firefox";
		
		@SuppressWarnings("resource")
		Scanner sn  = new Scanner(System.in);
		System.out.println("Enter a browser name");
		String input_browser = sn.nextLine();
		
			if(input_browser.equalsIgnoreCase(ch)){
		
				System.setProperty("webdriver.chrome.driver", "/usr/games/chromedriver");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(input_browser.equalsIgnoreCase(fx)){
			
				System.setProperty("webdriver.gecko.driver", "/usr/games/geckodriver");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();

			}
		
		driver.navigate().to(url);
		String title = driver.getTitle();
		System.out.println("Title of the page is : "+title);
		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}
	
}
