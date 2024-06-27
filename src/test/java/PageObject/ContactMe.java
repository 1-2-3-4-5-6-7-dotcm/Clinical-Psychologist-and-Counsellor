package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactMe {
	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public  ContactMe(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	//identify webelements
	@FindBy(linkText = "Contact") 
	WebElement  ContactMe;
	
	//creating method to identify action on webelement
			public void clickOnContactMe() {
				ContactMe.click();
			}
	
     @FindBy(id="input_comp-ktbpvtji")
     WebElement Name;
     
     @FindBy(xpath ="//*[@id=\"input_comp-ktbpvtjt1\"]")
     WebElement email;
     
     @FindBy(id="input_comp-ktbpvtjx1")
     WebElement PhoneNo;
     
     @FindBy(id="textarea_comp-ktbpvtk1")
     WebElement Message;
     
    
     @FindBy(xpath="//*[@id=\"comp-ktbpvtkb\"]/button/span")//submit button path
     WebElement Submit;
     
     //@FindBy(linkText ="richTextElement")
     //WebElement Reply;
     
     @FindBy(id ="comp-ktbpvtkj")//Thanks for submitting 
     WebElement Reply;
     
    @FindBy(linkText ="recaptcha-checkbox-spinner")
     WebElement Capcha;
     
   //creating method to identify action on webelement
   
    public void clickOnCapcha() {
		Capcha.click();
	}
		public void clickOnSubmit() {
			Submit.click();
		}
		
		public void EnterName(String AddName) 
		{
			Name.sendKeys(AddName);
		}
		
		public void EnterEmail(String AddName) 
		{
			email.sendKeys(AddName);
		}
		public void EnterPhoneNo(String AddNumber) 
		{
			PhoneNo.sendKeys(AddNumber);
		}
		public void EnterMessage(String AddMessage) 
		{
			Message.sendKeys(AddMessage);
		}
		public void EnterReply(String AddMessage) 
		{
			Reply.sendKeys(AddMessage);
		}

}
