package jay.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import jay.TestComponents.BaseTest;
import jay.pageobjects.BookingPage;
import jay.pageobjects.LoginPage;
import jay.pageobjects.MenuBarPages;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTestCases extends BaseTest {

	ExtentReports report;
	ExtentTest test;
	
	
	@BeforeClass
	public void report()
	{
		 report = new ExtentReports("user.dir"+ "jaysingh.html");
		 test= report.startTest("extendreport");  
	}

	@Test(enabled = true)
	public void loginOne() throws IOException {

		// testcase1
		// Login with incorrect username and correct password

		String username = "IncorrectUsername";
		String password = "ThisIsNotAPassword";
		String errorMessage = "Login failed! Please ensure the username and password are valid.";
		loginpage.loginWebsite(username, password);
		Assert.assertEquals(errorMessage, loginpage.getErrorMessage());
		test.log(LogStatus.FAIL, "Wrong Credientials!!!");
	}

	@Test(enabled = true)
	public void loginTwo() throws IOException {

		// Login with correct username and incorrect password

		String username = "John Doe";
		String password = "IncorrectPassword";
		String errorMessage = "Login failed! Please ensure the username and password are valid.";
		loginpage.loginWebsite(username, password);
		Assert.assertEquals(errorMessage, loginpage.getErrorMessage());
		test.log(LogStatus.FAIL, "Wrong Credientials correct username and wrong password!!!");
	}

	@Test(enabled = true)
	public void loginThree() throws IOException {
		// Login with incorrect username and incorrect password

		String username = "IncorrectUsername";
		String password = "IncorrectPassword";
		String errorMessage = "Login failed! Please ensure the username and password are valid.";
		loginpage.loginWebsite(username, password);
		Assert.assertEquals(errorMessage, loginpage.getErrorMessage());
		test.log(LogStatus.FAIL, "Wrong Credientials Login with incorrect username and incorrect password!!!");
	}

	@Test(enabled = true)
	public void loginFour() throws IOException {
		// Login without entering username or password

		String username = "";
		String password = "";
		String errorMessage = "Login failed! Please ensure the username and password are valid.";
		loginpage.loginWebsite(username, password);
		Assert.assertEquals(errorMessage, loginpage.getErrorMessage());
		test.log(LogStatus.INFO, "Balnk data");
	}

	@Test(enabled = true)
	public void loginFive() throws IOException, InterruptedException {
		// Login with correct username and correct password
		Thread.sleep(5000);
		String username = "John Doe";
		String password = "ThisIsNotAPassword";
		String bookingPageText = "Make Appointment";
		BookingPage bookingpage = loginpage.loginWebsite(username, password);
		Assert.assertEquals(bookingPageText, bookingpage.getBookingPageText());
		
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Login successfully !!!!!!");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
	@AfterClass
	public void reportflush()
	{
		report.endTest(test);
		report.flush();
	}
}
