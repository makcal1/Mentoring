package com.acme.base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginUser {

	public static void main(String[] args) {
		
	
	
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.manage().deleteAllCookies();
	driver.manage().window().fullscreen();
	
	doLogin(driver, getuserMap(),"user1" );
	
	}public static Map<String, String>	getuserMap(){
		Map<String, String>	userMap = new HashMap<String, String>();
		userMap.put("admin", "admin");
		userMap.put("user1","I LOVE YOU MY DEAR _admin123");
		userMap.put("doctor", "admin123");
		return userMap;
		
		
	}public static void doLogin(WebDriver driver,Map<String, String>userMap,String userkey) {
		driver.findElement(By.id("txtUsername")).sendKeys(userMap.get("user1").split("_")[0]);
		driver.findElement(By.id("txtPassword")).sendKeys(userMap.get("user1").split("_")[1]);
		
	
		
		
	}
}
