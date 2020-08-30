package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllListItemRemoveValidationPage {

WebDriver driver;
	
	public AllListItemRemoveValidationPage(WebDriver driver) {
		this.driver=driver;
		
		}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement TOGGLE_FILED;
	

	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]") // to delete all chekbox need to repeat the xpath of Toggle
	WebElement REMOVE_FIELD_BUTTON;
	
	
	
	public void CheckBoxToggle() {
		TOGGLE_FILED.click();
	}
	
	public void removeButtonFiled() {
		REMOVE_FIELD_BUTTON.click();
	}
}

