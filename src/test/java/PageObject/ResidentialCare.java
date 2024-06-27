package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResidentialCare {
	WebDriver ldriver;

	//constructor
	public ResidentialCare(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Residential Care")
	WebElement  ResidentialCare;
	
	@FindBy(xpath="//*[@id=\"comp-l02ddl1v__item-kdzpu26i\"]/a/div")
	WebElement  More;
	
	
	//Navigate to nextPage
	@FindBy(linkText="about")
	WebElement AboutUs;
	
	@FindBy(id="comp-ixuihigg0label")
	WebElement Home;
	
	//@FindBy(linkText="fjFkRP")
	
	public void clickOnResidentialCare()
	 {
		 ResidentialCare.click();
	 }
	
	public void clickOnMore()
	 {
		More.click();
	 }
	public void clickOnAboutUS()
	 {
		AboutUs.click();
	 }
	
	public void ClickOnHome()
	 {
		 Home.click();
	 }

}
