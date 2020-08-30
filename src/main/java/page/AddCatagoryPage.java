package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCatagoryPage extends BasePage{

	WebDriver driver;
	
	public AddCatagoryPage(WebDriver driver) {
		this.driver=driver;
		
		}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[1]")
	WebElement ADDCATAGORY_FIELd_LOCATOR;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
	WebElement ADDCATAGORY_BUTTON_FIELD_LOCATOR;
	
	//interacting method
	
	public void addCatagory() {
		ADDCATAGORY_FIELd_LOCATOR.sendKeys("Rumana Rubya Rumu");
	}
	
	public void addCatagoryButton() {
		ADDCATAGORY_BUTTON_FIELD_LOCATOR.click();
	}
	
	
	
		

	
}
