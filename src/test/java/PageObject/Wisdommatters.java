package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wisdommatters {

	WebDriver ldriver;

	//constructor
	public  Wisdommatters(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="x2ZfOv")
	WebElement AboutUs;
	
	
   @FindBy(xpath="//*[@id=\"comp-ixuihigg0label\"]")
	WebElement Home;
	
	@FindBy(linkText="VrZrC0")
	WebElement abc;
	
	
	@FindBy(linkText="Schizophrenia")
	WebElement Schizophrenia;
	
	
	@FindBy(linkText="Approach to Therapy")
	WebElement Approach;
	
	
	@FindBy(id="comp-ixuihigg3label")
	WebElement CS;
	
	@FindBy(id="comp-ixuihigg4label")
	WebElement  OurTeam;
	
	@FindBy(id="comp-ixuihigg5label")
	WebElement Treatment;
	
	//lists
	
	@FindBy(id="comp-ixuihiggmoreContainer")
	WebElement PatientCare;
	
	@FindBy(id="comp-ixuihigg6label")
	WebElement Courses ;
	
	@FindBy(id="comp-ixuihigg7label")
	WebElement  Contact;
	
	@FindBy(id="comp-ixuihigg8label")
	WebElement  Blog;
	
	
	
	
	public void clickOnAboutUS()
	 {
		AboutUs.click();
	 }
	
	public void ClickOnHome()
	 {
		 Home.click();
	 }
	public void ClickOnSchizophrenia()
	 {
		Schizophrenia.click();
	 }
	public void ClickOnApproach()
	 {
		Approach.click();
	 }
	public void ClickonCS()
	 {
		 CS.click();
	 }
	
	public void ClickOnOurTeam()
	 {
		 OurTeam.click();
	 }
	
	public void ClickOnTreatment()
	 {
		Treatment.click();
	 }
	
	public void ClickOnCourses()
	 {
		Courses.click();
	 }
	
	public void ClickOnContact()
	 {
		Contact.click();
	 }
	
	public void ClickOnBlog()
	 {
		Blog.click();
	 }
	public void ClickOnPatientCare()
	 {
		PatientCare.click();
	
	 }
	public void ClickOnabc()
	 {
		abc.click();
	 }
}
