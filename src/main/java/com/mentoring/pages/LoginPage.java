package com.mentoring.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;
import com.mentoring.util.ElementUtil;





public class LoginPage {
	// fields : driver,locators
	WebDriver driver;
	ElementUtil elementUtil;
	By loginBtn= By.xpath("//div[normalize-space()='Login']");
	By userBtn = By.id("user_email");
	By passwordBtn=By.id("user_pass");
	By loginBtnElement=By.xpath("//span[text()='Login']");
	By userName=By.xpath("//div[normalize-space()='MUHAMMED AKCAL']");
	
	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
		
	}
	
	//Page Actions
	public String getPageTitle() {
		
	String title= driver.getTitle();
	return title;
	}public void goToLoginPart() {
		elementUtil.waitForElementPresentBy(loginBtn);
	elementUtil.doClick(loginBtn);
	
	}public HomePage doLogin(String username,String password) {
	elementUtil.waitForElementPresentBy(passwordBtn);
	elementUtil.doSendKeys(userBtn, username);
	elementUtil.doSendKeys(passwordBtn, password);
	elementUtil.doClick(loginBtnElement);
	return new HomePage(driver);
	
	}public String getUserName() {
		
	return elementUtil.doGetText(userName);
	

	}
		
	
	
	
}
