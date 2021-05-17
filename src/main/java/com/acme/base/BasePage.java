package com.acme.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.acme.util.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	 //Fields

	WebDriver driver;
	Properties prop;
	public static String flash;
    //initialize_driver



    public WebDriver initialize_driver(){
	
    	prop = initialize_properties();
	
    String browser = prop.getProperty("browser");
    String baseUrl = prop.getProperty("url");	
    String headless = prop.getProperty("headless");
    flash = prop.getProperty("elementflash");
	if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		
		if(headless.equals("yes")){
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		driver = new ChromeDriver(co);
			}else{
				
			}
		driver = new ChromeDriver();	
		
	}else if(browser.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		if(headless.equals("yes")){
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		driver = new FirefoxDriver();
		}else{
			driver = new FirefoxDriver();	
			
		}
	}
	else {
		System.out.println("Browser name " + browser + " is not found.");
	}

	//Driver options here
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	
	driver.get(baseUrl);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	return driver;
	

	
	
   }

   //initialize_properties  ./src/main/java/com/qa/orangehrm/config/config.properties

   public Properties initialize_properties(){
	   prop = new Properties();
	try {
		FileInputStream inputStream = new FileInputStream("C:\\Users\\muham\\eclipse-workspace\\MentorringWebPage\\src\\main\\java\\com\\mentoring\\config\\config.properties");
		prop.load(inputStream);
		
	} catch (FileNotFoundException e) {
		System.out.println("File Not Found");
	}
	catch (IOException e) {
		System.out.println("File Not Found");
	}
	return prop;
    }
   
   public void quitBrowser(){
	   
	  try {
		driver.quit();
	} catch (Exception e) {
		System.out.println("Some exceptions occured while quitting the browser");
	} 
	   
   }
   public void closeBrowser(){
 try {
	driver.close();
} catch (Exception e) {
	System.out.println("Some exceptions occured while closing the browser");
}	  
	   
	   
	   
	   
   }			









}
