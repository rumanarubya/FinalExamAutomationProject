package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBoxToggleValidationPage {

	WebDriver driver;
	
	public CheckBoxToggleValidationPage(WebDriver driver) {
		this.driver=driver;
		
		}
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/input[3]")
	WebElement TOGGLE_FILED;
	
	public void CheckBoxToggle() {
		TOGGLE_FILED.click();
	}
	
	
}
