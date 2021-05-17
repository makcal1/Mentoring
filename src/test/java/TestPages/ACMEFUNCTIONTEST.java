package TestPages;

import static org.testng.Assert.assertEquals;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.acme.base.BasePage;

import com.acme.util.Constants;
import com.acme.util.Credentials;
 //@Listeners(com.acme.listeners.ExtentReportListeners.class)

public class ACMEFUNCTIONTEST extends BasePage {
// fields, driver, properties, basepageObj, LoginpageObj, 
WebDriver driver;
BasePage basePage;
Properties properties;
//LoginPage loginPage;

Credentials credentials;



@BeforeTest
public void setUp() {
basePage = new BasePage();
//properties = basePage.initialize_properties();
//driver = basePage.initialize_driver();
//loginPage = new LoginPage(driver);

//credentials = new Credentials(properties.getProperty("username")
//		, properties.getProperty("password"));
	
System.out.println("The test cases are ready to be executed..");
}
@Test(description = "ESS user can Login")
public void test_01_() {
String actual = "Myinfo Page is visible";
String expected = "Instead of the Myinfo page, the dashboard is displayed after a successful login.";
SoftAssert softAssert = new SoftAssert();
softAssert.assertEquals(actual,expected);

}
@Test(description = "ESS user can view account details",priority =1 )
public void test_02() {
	String actual = "Invalid credentials";
	String expected = "Invalid credentials";
	Assert.assertEquals(actual, expected);	
	
}@Test(description = "ESS user can edit account details",priority =2)
public void test_03() {
	
	String actual = "My account page has been opened.";
	String expected = "My account page has been opened.";
	Assert.assertEquals(actual, expected);
	
}@Test(description = "ESS user can see \"go-back\" button.",priority =3)
public void test_04() {
	String actual = "The change was successfully saved.";
	String expected = "The change was successfully saved.";
	Assert.assertEquals(actual, expected);
	
}@Test(description = "ESS user can view Contact Details",priority =4)
public void test_05() {
	String actual = "The browser navigated to the HomePage.";
	String expected = "The browser navigated to the HomePage.";
	Assert.assertEquals(actual, expected);
	
}@Test(description = "ESS user can edit contact details",priority =5)
public void test_06() {
	
	String actual = "The contact Details Button is visible";
	String expected = "The contact Details Button is visible";
	Assert.assertEquals(actual, expected);
	
}@Test(description = "ESS user can see the coupon in the website",priority =6)
public void test_07() {
	String actual = "The user can see the coupon ";
	String expected = "The user can see the coupon ";
	Assert.assertEquals(actual, expected);	
	
}@Test(description = "ESS user can can click on the coupon ",priority =7)
public void test_08() {
	String actual = "The coupon box is opened.";
	String expected = "The coupon box is opened.";
	Assert.assertEquals(actual, expected);	
	
}@Test(description = "ESS user can add the coupon into the account",priority =8)
public void test_09() {
	String actual = "The coupon is visible in the account.";
	String expected = "The coupon is visible in the account.";
	Assert.assertEquals(actual, expected);	
	
}@Test(description = "ESS user can see the coupon barcode",priority =9)
public void test_10() {
	String actual = "The barcode is visible in the account.";
	String expected = "The barcode is visible in the account.";
	Assert.assertEquals(actual, expected);
	
}@Test(description = "ESS user can see \"The e-mail notification is sent\".",priority =10)
public void test_11() {
	String actual = "The email notification has been sent to the user's mail adress.";
	String expected = "The email notification has been sent to the user's mail adress.";
	Assert.assertEquals(actual, expected);
	
}@Test(description = "ESS user can see the unique code in the barcode.",priority =11)
public void test_12() {
	String actual = "The barcode code is visible in the mail-box.";
	String expected = "The barcode code is visible in the mail-box.";
	Assert.assertEquals(actual, expected);
	
}@Test(description = "ESS user can see the discount after entering the coupon code.",priority =12)
public void test_13() {
	String actual = "The discount is applicable in the system.";
	String expected = "The discount is applicable in the system.";
	Assert.assertEquals(actual, expected);
}

@Test(description = "ESS user can see \"The barcode number is valid\".",priority =13)
public void test_14() {
	String actual = "The barcode number is valid is written in the notifcation box.";
	String expected = "The barcode number is valid is written in the notifcation box.";
	Assert.assertEquals(actual, expected);

}
@AfterTest
public void tearDown() {
//	driver.close();
	System.out.println("The test progress is finished..");
}
	
	
}
