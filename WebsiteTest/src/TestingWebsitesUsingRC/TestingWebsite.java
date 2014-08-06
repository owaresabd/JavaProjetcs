package TestingWebsitesUsingRC;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestingWebsite {
	
	String title = "CNN.com - Breaking News, U.S., World, Weather, Entertainment & Video News";
	Selenium browser = null;
	
	@Before
	public void setUp() throws Exception {
		browser = new DefaultSelenium("localhost",4444, "firefox", "http://www.cnn.com");
		browser.start();
		browser.windowMaximize();
	}
	
	@Test
	public void test() throws InterruptedException {
		browser.open("/");
		System.out.println(browser.getTitle());
		String titlepage = browser.getTitle();
		Assert.assertEquals(title, titlepage, "matched");
		browser.click("id=nav-politics");
		Thread.sleep(4000);
		
	}

	@After
	public void tearDown() throws Exception {
		browser.close();
		
	}

	

}
