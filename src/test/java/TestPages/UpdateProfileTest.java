package TestPages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.mentoring.base.BasePage;
import com.mentoring.pages.HomePage;
import com.mentoring.pages.HomePageData;
import com.mentoring.pages.LoginPage;
import com.mentoring.util.Credentials;
import com.mentoring.util.ExcelUtil;

@Listeners(com.mentoring.listeners.ExtentReportListeners.class)
public class UpdateProfileTest extends BasePage {
	Logger logger = Logger.getLogger(UpdateProfileTest.class);
	WebDriver driver;
	BasePage basePage;
	Properties properties;
	LoginPage loginPage;
	HomePage homePage;
	Credentials credentials;
	HomePageData homepagedata;
@BeforeTest
public void setUp() {
	
	basePage = new BasePage();
	properties = basePage.initialize_properties();
	driver = basePage.initialize_driver();
	loginPage = new LoginPage(driver);
	loginPage.goToLoginPart();
	homePage = loginPage.doLogin(properties.getProperty("username"),
			properties.getProperty("password"));



}@Test
public void goToUpdataSection() {
	
	
homepagedata.goToUpdateProfile();


	
	
}	@DataProvider
public Object [][] updateProfile(){
	
Object[][]data=ExcelUtil.getTestData("Sayfa1");

return data;
	

}@Test(dataProvider = "updateProfile" )
public void ProfileUpdate(String firstname,String lastname,String telno,String faculty) {
	
homepagedata.updateProfile(firstname, lastname, telno, faculty);	
	
}@Test
public void updateVerification() {
	
	Assert.assertEquals(homepagedata.dataVerification(), true);
	
}
//@AfterTest
//public void tearDown() {
//	
//	
//driver.close();	
//}
}