package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.MothValidationPage;
import util.BrowserFactory;

public class MonthValidationTest {

	
	WebDriver driver;
	
	@Test
	public void monthName() {
		
		driver = BrowserFactory.launchBrwser();
		
		MothValidationPage monthvalidation = PageFactory.initElements(driver, MothValidationPage.class);
		monthvalidation.monthDropdown();
		
	}
}

