package com_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class com_Navigation {

	public static void main(String[] args) {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");
		
        driver=new ChromeDriver();
		
		
		String url="https://www.facebook.com/";
		
		driver.get(url);

	}

}
