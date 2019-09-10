package AssertionExample;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class com_Assertion {
	WebDriver driver=null;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		
        driver=new ChromeDriver();
		
		
		String url="https://opensource-demo.orangehrmlive.com";
		
		driver.get(url);
	}
	
	@Test
	public void logoTest() {
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
		Assert.assertTrue(logo.isDisplayed() );
	}
	
	@Test
	public void homePageTitle() {
	    String	title=driver.getTitle();
	    Assert.assertEquals("OrangeHRM", title);
	
	}

}
