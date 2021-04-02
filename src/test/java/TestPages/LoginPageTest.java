package TestPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.mentoring.base.BasePage;
import com.mentoring.pages.LoginPage;
import com.mentoring.util.Constants;
import com.mentoring.util.Credentials;
@Listeners(com.mentoring.listeners.ExtentReportListeners.class)

public class LoginPageTest extends BasePage {
// fields, driver, properties, basepageObj, LoginpageObj, 
WebDriver driver;
BasePage basePage;
Properties properties;
LoginPage loginPage;

Credentials credentials;



@BeforeTest
public void setUp() {
basePage = new BasePage();
properties = basePage.initialize_properties();
driver = basePage.initialize_driver();
loginPage = new LoginPage(driver);
loginPage.goToLoginPart();
credentials = new Credentials(properties.getProperty("username")
		, properties.getProperty("password"));
	
}@Test(priority = 1)
public void verifyTitle() {
String actualTitle =loginPage.getPageTitle();
String expectedTitle=Constants.LOGIN_PAGE_TITLE;

Assert.assertEquals(actualTitle, expectedTitle);
	
}@Test(priority = 2)
public void loginTest() {
	
loginPage.doLogin(credentials.getUsername(), credentials.getPassword());	

}

@AfterTest
public void tearDown() {
	driver.close();
}
	
	
}
