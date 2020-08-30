package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AllListItemRemoveValidationPage;
import util.BrowserFactory;

public class AllListItemRemoveValidationTest {

	WebDriver driver;
	
	@Test
	public void allListItemRemove() throws InterruptedException {
		driver = BrowserFactory.launchBrwser();
		
		AllListItemRemoveValidationPage alllistitemremove = PageFactory.initElements(driver, AllListItemRemoveValidationPage.class);
		alllistitemremove.CheckBoxToggle();
		Thread.sleep(2000);
		alllistitemremove.removeButtonFiled();
	}
	
}
