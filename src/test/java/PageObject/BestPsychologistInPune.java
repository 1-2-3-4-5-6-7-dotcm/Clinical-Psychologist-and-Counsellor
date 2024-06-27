package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestPsychologistInPune {

	//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public  BestPsychologistInPune(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		
	    @FindBy(id="comp-ktckvzwd0label")
	     WebElement Bestpsycho;
		
	   
	  
	    @FindBy(xpath="//*[@id=\"d4ce714f-6219-4fd1-8194-a8c7a38465cf\"]")//img
	     WebElement Firstimg;
	    
	    @FindBy(xpath="//*[@id=\"pro-gallery-container-pro-gallery-fullscreen-wrapper\"]/button[2]/div/button")
	    //@FindBy(xpath="//*[@id=\"pro-gallery-container-pro-gallery-fullscreen-wrapper\"]/button/div/button")//img arrow button
	     WebElement Arrow;
	  
	    @FindBy(xpath="//*[@id=\"08b8f664-239d-43be-bf3e-d66b56e1d9c1\"]")//img
	     WebElement Img;
	    
	    @FindBy(id="input_comp-ktbpsdmh")
	    WebElement Name;
	   
	    @FindBy(id="input_comp-ktbpsdn0")
	    WebElement Emailid;
	   
	    @FindBy(id="input_comp-ktbpsdn3")
	    WebElement PhoneNo;
	    

	    @FindBy(id="textarea_comp-ktbpsdn8")
	    WebElement Message;
	    
	    @FindBy(xpath="//*[@id=\"comp-ktbpsdnm\"]/button/span")
	    WebElement Submit;
	   
	    
		 public void clickOnBestpsycho()
		 {
			 Bestpsycho.click();
		 }
		 public void clickOnFirstimg()
		 {
			 Firstimg.click();
		 }
		 public void clickOnArrow()
		 {
			 Arrow.click();
		 }
		 public void clickOnImg()
		 {
			 Img.click();
		 }
		 public void Name()
		 {
			 Name.sendKeys("Admin");
		 }
		 public void Email()
		 {
			 Emailid.sendKeys("abc@gmail.com");
		 }
		 public void PhoneNo()
		 {
			 PhoneNo.sendKeys("123456789");
		 }
		 public void Message()
		 {
			 Message.sendKeys("Book Appointment");
		 }
		 public void Submit()
		 {
			 Submit.click();
		 }
}
