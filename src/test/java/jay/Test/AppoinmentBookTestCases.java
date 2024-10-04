package jay.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import jay.TestComponents.BaseTest;
import jay.pageobjects.BookingPage;
import jay.pageobjects.ConfirmPage;
import jay.pageobjects.LoginPage;


public class AppoinmentBookTestCases extends BaseTest {

	@Test
	public void bookingOne() {
        //comments
		// Happy Path Testing

		String username = "John Doe";
		String password = "ThisIsNotAPassword";
		String facilityName = "Tokyo CURA Healthcare Center";
		String hospitalReadmission = "Yes";
		String programName = "Medicare";
		String visitDate = "04/06/2024";
		String comment = "I want the assistance of Dr. J Sharma";
		String confirmationMessage = "Appointment Confirmation";
		
		
		BookingPage bookingpage = loginpage.loginWebsite(username, password);
		bookingpage.readmission();
		bookingpage.selectAppointmentDay(visitDate);
		bookingpage.writeComment(comment);
		
		
		ConfirmPage confirmationpage = bookingpage.bookAppointment();
		Assert.assertEquals(confirmationMessage, confirmationpage.getConfirmationMessage());
		Assert.assertEquals(facilityName, confirmationpage.verifyFacilityName());
		
		Assert.assertEquals(hospitalReadmission, confirmationpage.verifyHospitalReadmission());
		Assert.assertEquals(programName, confirmationpage.verifyProgramName());
		Assert.assertEquals(visitDate, confirmationpage.verifyVisitDate());
		Assert.assertEquals(comment, confirmationpage.verifyComment());
	}

}
