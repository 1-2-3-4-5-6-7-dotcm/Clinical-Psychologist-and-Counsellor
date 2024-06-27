package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurTeam {
	
	WebDriver ldriver;
	//constructor
		public  OurTeam (WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(id="comp-ktckvzwd1label")
		WebElement OurTeam;
		
		public void ClickOnOurTeam()
		 {
			OurTeam.click();
		 }

}
