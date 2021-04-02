package TestPages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.mentoring.base.BasePage;
import com.mentoring.pages.HomePage;
import com.mentoring.pages.LoginPage;
import com.mentoring.util.Credentials;



@Listeners(com.mentoring.listeners.ExtentReportListeners.class)
public class HomePageTest extends BasePage {
	Logger logger = Logger.getLogger(HomePageTest.class);
	WebDriver driver;
	BasePage basePage;
	Properties properties;
	LoginPage loginPage;
	HomePage homePage;
	Credentials credentials;
@BeforeTest
public void setUp() {
	
	basePage = new BasePage();
	properties = basePage.initialize_properties();
	driver = basePage.initialize_driver();
	loginPage = new LoginPage(driver);
	loginPage.goToLoginPart();
	homePage = loginPage.doLogin(properties.getProperty("username"),
			properties.getProperty("password"));
	

}@Test(priority = 1)
public void getUserName() {
String actual=loginPage.getUserName();
String expected="MUHAMMED AKCAL";
Assert.assertEquals(actual, expected);
}

@Test(priority = 2)
public void galeryInfo() {
homePage.gotoHomePage();


	
}@Test(priority  =3)

public void developerNameTest() {
	
String actual="YUNUS EMRE CAKMAK";
String expected=homePage.developerName();

Assert.assertEquals(actual,expected);
	
	
}
@AfterTest
public void tearDown() {
	driver.close();
}
	
}