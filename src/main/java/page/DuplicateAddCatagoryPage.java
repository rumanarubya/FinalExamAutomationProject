package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DuplicateAddCatagoryPage {
	
	WebDriver driver;
	
	public DuplicateAddCatagoryPage(WebDriver driver) {
		this.driver=driver;
		
		}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[1]") 
	WebElement ADD_CATAGORY_DATA;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")   
	WebElement ADDCATAGORY_BUTTON;
	@FindBy(how = How.XPATH, using = "/html/body")
	WebElement DUPLICATE_CATAGORY_NAME;
	
	public void addCatagoryData() {
		ADD_CATAGORY_DATA.sendKeys("Rumana Rubya");
	}
	public void addCatagoryButtonField() {
		ADDCATAGORY_BUTTON.click();
	}
	public void duplicateCatagoryName() {
		DUPLICATE_CATAGORY_NAME.click();
		


	}
		 
	}
	
	
	


