package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DuplicateAddCatagoryPage;
import util.BrowserFactory;

public class DuplicateAddCatagoryTest {
	
	WebDriver driver;
	
	@Test 
	public void duplicteAddCagory() throws InterruptedException {
		
		driver = BrowserFactory.launchBrwser();
		
		DuplicateAddCatagoryPage duplicateaddcatagory = PageFactory.initElements(driver, DuplicateAddCatagoryPage.class);
		
		duplicateaddcatagory.addCatagoryData();
		Thread.sleep(2000);
		duplicateaddcatagory.addCatagoryButtonField();
		Thread.sleep(2000);
		duplicateaddcatagory.duplicateCatagoryName();
		
		

	

}
}

