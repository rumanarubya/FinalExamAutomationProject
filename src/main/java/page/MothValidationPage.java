package page;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class MothValidationPage extends BasePage {

	WebDriver driver;

	public MothValidationPage(WebDriver driver) {
		this.driver = driver;

	}

	
	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement MONTH_OF_ALL_LIST;
	
	


	public void monthDropdown() {
	
		String[] monthfield = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		
		MONTH_OF_ALL_LIST.click();
		
		
		Select select = new Select(MONTH_OF_ALL_LIST);
		List <WebElement> options = select.getOptions();   //to get Mulitple list of elements need to apply get.Options method
		
		int count=0;
	
		for(String item:monthfield){             //list of my given month (which will show by forEachloop)
	
		for(int i=0;i<options.size();i++){                //Applied for loop to get techfios webside's 12 months
	
		if(options.get(i).getText().equalsIgnoreCase(item)){      //will compare my month with website month
			System.out.println(options.get(i).getText());
		    count++;
	      System.out.println(" matched");
	
		}
	
		}
	
		}
		
		System.out.println(count);
	
	}
	

}
	
	
//	String[] exp = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
//	WebElement monthfield = driver.findElement(By.xpath("//select[@name='due_month']"));
//	monthfield.click();
//	Select select = new Select(monthfield);
//
//	List<WebElement> options = select.getOptions();
//	
//	int count=0;
//
//	for(String item:exp){
//
//	for(int i=0;i<options.size();i++){
//
//	if(options.get(i).getText().equalsIgnoreCase(item)){
//		System.out.println(options.get(i).getText());
//	    count++;
//      System.out.println(" matched");
//}
//
//	}
//
//	}
//	
//	System.out.println(count);
//

