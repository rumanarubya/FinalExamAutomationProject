package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.SingleCheckBoxRemovePage;
import util.BrowserFactory;

public class SingleCheckBoxRemoveTest {

	
	WebDriver driver ;
	
	@Test 
	public void checkBoxRemove() {
		 
		driver = BrowserFactory.launchBrwser();
		
SingleCheckBoxRemovePage checkboxremove = PageFactory.initElements(driver, SingleCheckBoxRemovePage.class);

        checkboxremove.singlecheckboxRemove();
        checkboxremove.removeButtonFiled();
		
	}
}
