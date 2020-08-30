package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.WhiteBackGroundValidationPage;
import util.BrowserFactory;

public class WhiteBackGroudValidationTest {

WebDriver driver;
	
	@Test
	public void whiteBackground() {

		driver = BrowserFactory.launchBrwser();
		
		WhiteBackGroundValidationPage whitebackground = PageFactory.initElements(driver, WhiteBackGroundValidationPage.class);
		whitebackground.whiteBackGround();
		
	}
	
}
