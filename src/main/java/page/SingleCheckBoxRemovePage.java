package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SingleCheckBoxRemovePage {
	
WebDriver driver;
	
	public SingleCheckBoxRemovePage(WebDriver driver) {
		this.driver=driver;
		
		}

	@FindBy(how = How.XPATH, using = "//*[@id=\"todos-content\"]/form/ul/li[3]/input")
	WebElement SINGLE_CHECKBOX_REMOVE_BUTTON;
	
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/input[1]")
	WebElement REMOVE_FIELD_BUTTON;
	
	public void singlecheckboxRemove() {
		SINGLE_CHECKBOX_REMOVE_BUTTON.click();
	}
	
	public void removeButtonFiled() {
		REMOVE_FIELD_BUTTON.click();
	}
}
