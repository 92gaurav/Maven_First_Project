package Testcase;

import org.testng.annotations.Test;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.all_data_page.BrowserFactory;
import com.all_data_page.Data_sheet;
import com.all_data_page.Online_Booking;
import com.all_data_page.Switch_tabs;
import com.all_data_page.login_page;

public class Verify_data{
	
	@Test
	public void checkverify() throws InterruptedException, IOException {
		
		WebDriver driver=BrowserFactory.Browser("input_browser", "http://automationpractice.com/index.php");
				
		login_page login = PageFactory.initElements(driver, login_page.class);
		login.sheet("test003@yopmail.com", "test123456789");
		System.out.println("Login class work");
		Online_Booking book = PageFactory.initElements(driver, Online_Booking.class);
		System.out.println("Online_Booking class work");
		book.booking();
		book.takeScreenshot(driver);
		
		//Switch_tabs tab = PageFactory.initElements(driver, Switch_tabs.class);
		//tab.tabs();
		
		//Data_sheet data = PageFactory.initElements(driver, Data_sheet.class);
		//data.sheet();
		
		
	}
	
}
