package TestWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class cnnFirefox {
 
	WebDriver driver = null;
	
	
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	  driver.navigate().to("http://www.cnn.com");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void f() {
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  
  }

}
