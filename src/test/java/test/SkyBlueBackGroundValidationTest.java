package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.SkyBlueBackGroundValidationPage;
import util.BrowserFactory;

public class SkyBlueBackGroundValidationTest {

	WebDriver driver;
	
	@Test
	public void skyBlueBackground() {

		driver = BrowserFactory.launchBrwser();
		
		SkyBlueBackGroundValidationPage skyblue = PageFactory.initElements(driver, SkyBlueBackGroundValidationPage.class);
		skyblue.skyBlueBackGround();
	}
}
