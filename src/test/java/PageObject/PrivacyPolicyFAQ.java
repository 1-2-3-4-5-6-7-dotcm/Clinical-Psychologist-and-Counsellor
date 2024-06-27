package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyPolicyFAQ {
	WebDriver ldriver;

	//constructor
	public  PrivacyPolicyFAQ(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="comp-ktckvzwd4label")
    WebElement PrivacyPolicy;
	
	@FindBy(linkText="Book An Appointment")
	WebElement BookAppo;
	
	@FindBy(linkText="wixui-rich-text__text")
	WebElement MobileNO;
	
	@FindBy(xpath = "//*[@id=\"comp-lte5j3b3\"]/a")
	//@FindBy(linkText="presentation")
	WebElement WhatsApp;
	
	@FindBy(linkText="Continue to Chat")
	WebElement Chat;
	
	public void clickOnPrivacyPolicy()
	 {
		PrivacyPolicy.click();
	 }
	
	public void ClickONBookAnAppointment()
	 {
		BookAppo.click();
	 }
	public void ClickOnMobileNo()
	 {
		MobileNO.click();
	 }
	
	public void clickOnWhatsApp()
	 {
		WhatsApp.click();
	 }
	public void clickOnContinuetoChat()
	 {

		Chat.click();
	 }
	
}
