package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCatagoryPage;
import util.BrowserFactory;

public class AddCatagoryTest {

	WebDriver driver;
	
	
	@Test

	public void addName() throws InterruptedException {

		driver = BrowserFactory.launchBrwser();
		
		AddCatagoryPage addcatagory = PageFactory.initElements(driver, AddCatagoryPage.class);
		
		addcatagory.addCatagory();
		addcatagory.addCatagoryButton();
		



	}

}
