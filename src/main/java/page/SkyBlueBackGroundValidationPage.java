package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyBlueBackGroundValidationPage {

	WebDriver driver;

	public SkyBlueBackGroundValidationPage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SKYBLUEBACKGROUND_BUTTON;
	@FindBy(how = How.XPATH, using = "//html//body")
	WebElement BODY_FIELD;

	public void skyBlueBackGround() {
		
		SKYBLUEBACKGROUND_BUTTON.click();
		String expectedColor = "#87CEEB";

		//how to get actual color
		String backgroundColor = BODY_FIELD.getCssValue("background-color");
        String actualcolor = Color.fromString(backgroundColor).asHex();
		
        System.out.println(actualcolor);

		if (actualcolor.equalsIgnoreCase(expectedColor))
			System.out.println("verified");
	}
}