package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.CheckBoxToggleValidationPage;
import util.BrowserFactory;

public class CheckBoxToggleValidateTest {


	WebDriver driver;
	
	@Test
	public void CheckBoxToggleValidate() {
		
		driver = BrowserFactory.launchBrwser();
		
		CheckBoxToggleValidationPage checkBoxToggleValidate = PageFactory.initElements(driver, CheckBoxToggleValidationPage.class);
		checkBoxToggleValidate.CheckBoxToggle();
	}
	
	
}
