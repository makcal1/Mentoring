package com.mentoring.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mentoring.base.BasePage;
import com.mentoring.util.ElementUtil;

public class HomePage extends BasePage {
	// Driver
			WebDriver driver;
			
			//ElementUtil
			ElementUtil elementUtil;
			// Locator
			By userName=By.xpath("//div[normalize-space()='MUHAMMED AKCAL']");
			By myProfileBtn=By.xpath("//div[normalize-space()='My Profile']");
			By userInfo=By.xpath("//*[@id=\"content\"]/div/div/div/div[1]");
			By homeBtn=By.xpath("//div[normalize-space()='Home']");
			By flagImage=By.xpath("//section[@id='content']//a[1]//img[1]");
			By developerName=By.xpath("//*[@id=\"footer\"]/div/div/b/div[2]/a");
			By readMorebtn=By.xpath("//div[@class='row clearfix']//div[1]//div[1]//div[2]//div[1]//div[1]//a[1]");
			// Constructor
			public HomePage(WebDriver driver) {
				this.driver = driver;
			}public String getUserName() {
				
				return elementUtil.doGetText(userName);
				

				}public String getUserInformation() {
				elementUtil.waitForElementPresentBy(userName);	
				elementUtil.doClick(userName);	
				elementUtil.waitForElementPresentBy(myProfileBtn);
				elementUtil.doClick(myProfileBtn);
					
				
				String info=userMain();
				
				if(info.contains("MUHAMMED")) {
					
					System.out.println(info);
					
				}else {
					
					System.out.println("Wrong user " + info);
				}
				
				return info;
				
				
					
					
					
					
				}public String userMain(){
					
					
					
				return elementUtil.doGetText(userInfo);	
				
				}public boolean flagdisplay() {
					
				elementUtil.doClick(homeBtn);
				
				elementUtil.waitForElementPresentBy(flagImage);
				
				return elementUtil.isElementDsiplayed(flagImage);
					
				}public String developerName() {
					
				return driver.findElement(developerName).getText();	
					
				}public boolean readMoreBtnTest() {
					
					return elementUtil.isElementDsiplayed(readMorebtn);
				}public void gotoHomePage() {
					

					driver.findElement(homeBtn).click();
				}
}
