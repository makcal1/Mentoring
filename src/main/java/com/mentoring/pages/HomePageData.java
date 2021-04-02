package com.mentoring.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mentoring.base.BasePage;
import com.mentoring.util.ElementUtil;

public class HomePageData extends BasePage {
	// Driver
				WebDriver driver;
				
				//ElementUtil
				ElementUtil elementUtil;
				
				// Locator
				By userBtn=By.xpath("//*[@id=\"primary-menu\"]/ul/li[5]/a/div/i");
				By upDateMyProfileBtn=By.xpath("//div[normalize-space()='Update My Profile']");
				By name=By.id("mentor_first_name");
				By lastName=By.id("mentor_last_name");
				By telNo=By.id("mentor_phone");
				By facultyName=By.id("mentor_faculty");
				By updateBtn=By.xpath("//span[normalize-space()='UPDATE']");
				By textVerification=By.xpath("//div[@class='sb-msg']");
				

				public HomePageData(WebDriver driver, ElementUtil elementUtil) {
					
					this.driver = driver;
					elementUtil = new ElementUtil(driver);
				
				}public void goToUpdateProfile() {
					
				//elementUtil.doClick(userBtn);
					
					driver.findElement(userBtn).click();
//				elementUtil.waitForElementPresentBy(upDateMyProfileBtn);
//				elementUtil.doClick(upDateMyProfileBtn);
//					
				
					
					
					
					
				}public void updateProfile(String firstname,String lastname,String telno,String faculty) {
					
					elementUtil.waitForElementPresentBy(name);
					driver.findElement(name).clear();
					elementUtil.doSendKeys(name, firstname);
					
					driver.findElement(lastName).clear();
					elementUtil.doSendKeys(lastName, lastname);
					
					driver.findElement(telNo).clear();
					elementUtil.doSendKeys(telNo, telno);
					
					driver.findElement(facultyName).clear();
					
					elementUtil.doSendKeys(facultyName, faculty);
			
				
}public boolean dataVerification() {
	
	
	elementUtil.doClick(updateBtn);	
	
	elementUtil.waitForElementPresentBy(textVerification);
	
	return elementUtil.isElementDsiplayed(textVerification);
	
}
}