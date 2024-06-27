package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TherapyProcess {

	WebDriver ldriver;

	//constructor
	public  TherapyProcess(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Therapy Process")
	WebElement Therapy;
	
	public void ClickOnTherapy()
	 {
		Therapy.click();
	 }
}
