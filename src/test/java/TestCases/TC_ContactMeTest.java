package TestCases;

import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.AboutUs;
import PageObject.BestPsychologistInPune;
import PageObject.ContactMe;
import PageObject.OurTeam;
import PageObject.PrivacyPolicyFAQ;
import PageObject.ResidentialCare;
import PageObject.TherapyProcess;




public class TC_ContactMeTest extends Base_Class{
	//public String baseUrl ="https://www.shalmaleegadgil.com";
	//public String baseUrl = "https://www.shalmaleegadgil.com/contact-therapist";
	//public WebDriver driver ; 
	

/*	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SNEHA\\\\eclipse-workspace\\\\CPC_Project\\\\Driver\\\\chromedriver.exe");
		System.out.println("Before Test executed");
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
	
		//maximise windows
		driver.manage().window().maximize();

		//open url
		driver.get(baseUrl);
      
		//timer i kept as 60 you can keep 40
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //60 seconds
	
	}*/
	
	@Test(priority = 1, enabled=false)
	public void VerifyBestPsychologistInPune() throws InterruptedException
	{
		driver.get(url);
		logger.info(".......... Home Page...........");
		BestPsychologistInPune BestPsy =new BestPsychologistInPune(driver);
		BestPsy.clickOnBestpsycho();
		Thread.sleep(500);
		
		//Scroll down
      	JavascriptExecutor jse = (JavascriptExecutor) driver; 
		 jse.executeScript("window.scrollBy(0,1800)");
		  Thread.sleep(3000);
		  
	  
	/*	for (int i=0;i<9;i++)
		{
		BestPsy.clickOnFirstimg();
		Thread.sleep(2000);
		BestPsy.clickOnArrow();
		Thread.sleep(2000);
		
		}*/
		
	
	
		  List<WebElement> imgs=driver.findElements(By.xpath("//*[@id=\"pro-gallery-comp-kwadz833\"]/div/div[2]/div[2]/div/div"));
	        System.out.println("Total radio Buttons Text: " + imgs.size());
	        WebElement q;
	        for(int i=0;i<imgs.size();i++) {
	        q=imgs.get(i);
	        System.out.println(q.getTagName());
	        Thread.sleep(10000);
	        imgs.get(i).click();
	        }
	        
	    /*    String expResult ="div";
	        for(int j=0;j<imgs.size();j++) {
	        if(imgs.get(j).getText().equalsIgnoreCase(expResult)) {
	        	imgs.get(j).click();
	        	System.out.println(expResult + "Clicked");
	        		break;
	        }
	        }*/
	        
//............................................................................................................
	      //Search On Sevices 
	      	driver.findElement(By.xpath("//*[@id=\"comp-lssnxzsk\"]/h2/span/span"));
	      	System.out.println("..............Open SERVICES...................");
	      	Thread.sleep(3000);
	      	
	      	//Find FAMILY THERAPY
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth06xbc__item1\"]/h4"));
	      	System.out.println("FAMILY THERAPY");
	      	Thread.sleep(3000);
            
	      	//Click On Book Now
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth06xbl2__item1\"]/a/span")).click();
	      	System.out.println("Book Now");
	      	Thread.sleep(3000);
	        
	      	
	      //Find RELATIONSHIP/ COUPLE'S/MARRIAGE/COUNSELLING
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth06xbc__item2\"]/h4/span/span/span/span/span"));
	      	System.out.println("RELATIONSHIP/ COUPLE'S/MARRIAGE/COUNSELLING");
	      	Thread.sleep(3000);
            
	      	//Click On Book Now
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth06xbl2__item1\"]/a/span")).click();
	      	System.out.println("Book Now");
	      	Thread.sleep(3000);
	      	
	      	 //Find INDIVIDUAL THERAPY/GUIDANCE/COUNSELLING/LIFE-COACHING
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth06xbc__item3\"]/h4/span/span/span/span/span"));
	      	System.out.println("INDIVIDUAL THERAPY/GUIDANCE/COUNSELLING/LIFE-COACHING");
	      	Thread.sleep(3000);
            
	      	//Click On Book Now
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth06xbl2__item1\"]/a/span")).click();
	      	System.out.println("Book Now");
	      	Thread.sleep(3000);
	      	
	      	 //Find SUPPORT GROUP
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth090wg1__item1\"]/h4/span/span/span/span/span"));
	      	System.out.println("SUPPORT GROUP");
	      	Thread.sleep(3000);
            
	      	//Click On Book Now
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth06xbl2__item1\"]/a/span")).click();
	      	System.out.println("Book Now");
	      	Thread.sleep(3000);
	      	
	      	
	       //Find CLINICAL HYPNOTHERAPY
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth090wg1__item2\"]/h4/span"));
	      	System.out.println("CLINICAL HYPNOTHERAPY");
	      	Thread.sleep(3000);
            
	      	//Click On Book Now
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth06xbl2__item1\"]/a/span")).click();
	      	System.out.println("Book Now");
	      	Thread.sleep(3000);
	      	
	      	
	      	 //Find PSYCHOLOGICAL ASSESSMENT AND DIAGNOSIS
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth090wg1__item3\"]/h4/span"));
	      	System.out.println("PSYCHOLOGICAL ASSESSMENT AND DIAGNOSIS");
	      	Thread.sleep(3000);
            
	      	//Click On Book Now
	      	driver.findElement(By.xpath("//*[@id=\"comp-kth06xbl2__item1\"]/a/span")).click();
	      	System.out.println("Book Now");
	      	Thread.sleep(3000);
	      	
	      	//Click to view experience and review
	      	
	      	driver.findElement(By.xpath("//*[@id=\"comp-lmme3wp6\"]/a")).click();
	      	System.out.println("feedback recieve");
	      	
	    	//............................Contact form.........................................
		  
		   jse.executeScript("window.scrollBy(0,3000)");
	      	System.out.println("..................Contact Form.......................");
	      	driver.findElement(By.xpath("//*[@id=\"comp-ktbps8zv5\"]/h2/span/span"));
	      	System.out.println("Contact me");
	      	BestPsy.Name();
	      	BestPsy.Email();
	      	BestPsy.PhoneNo();
	      	BestPsy.Message();
	      	BestPsy.Submit();
	      	
	      	
	     	//.......................Click on Social Links..........................................
	      	
		  
		 
		  
	      	driver.findElement(By.xpath("//*[@id=\"img_0_comp-l9d3d8do\"]/img")).click();
	      	System.out.println("Open linkedIn");
	      	Thread.sleep(2000);
	      	
	      	driver.findElement(By.xpath("//*[@id=\"img_1_comp-l9d3d8do\"]/img")).click();
	      	System.out.println("Open instagram");
	      	Thread.sleep(3000);
	      	
	     	driver.findElement(By.xpath("//*[@id=\"comp-lte5j3am\"]/a/div")).click();
	      	System.out.println("Open MobileNo");
	      	Thread.sleep(3000);
	      	
	      	driver.findElement(By.xpath("//*[@id=\"comp-lte5j3b3\"]/a/div/svg")).click();
	      	System.out.println("Open Whats app");
	      	Thread.sleep(3000);
	      	
	      	driver.findElement(By.xpath("//*[@id=\"comp-lte5j3au\"]/a/div")).click();
	      	System.out.println("Open Mails");
	      	Thread.sleep(3000);
	      	
	      	
	        }
	        
	        	
	        
	
	@Test(priority = 2, enabled=false)
	public void VerifyOurTeam() throws InterruptedException 
		{  
		Thread.sleep(2000);
		   OurTeam OT =new OurTeam(driver);
		   OT.ClickOnOurTeam();
		   Thread.sleep(5000);
		   
		driver.findElement(By.xpath("//*[@id=\"comp-lte5j3ab\"]/a/span"));
		System.out.println("Book Appoinment");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"comp-ktbpr8491\"]/p/span/a/span/span/span"));
		System.out.println("Call on this number");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"img_0_comp-ktckvzmx\"]/img"));
		System.out.println("Instagram link");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"img_1_comp-ktckvzmx\"]/img"));
		System.out.println("LinkedIn link");
		Thread.sleep(3000);
		
		
		}
@Test(priority = 3, enabled=false)
	
	public void VerifyResidentialCare() throws InterruptedException
	{   
		 ResidentialCare RC = new  ResidentialCare(driver);
		 RC.clickOnResidentialCare();
		 Thread.sleep(2000);
		 RC.clickOnMore();
		 System.out.println("More Option clicked");
		 logger.info("testcase passed");
		 RC.clickOnAboutUS();
		 //RC.ClickOnHome();
		
		 
	}
	@Test(priority = 4, enabled=false)
	public void VerifyAboutUs() throws InterruptedException 
		{
		

		AboutUs US = new AboutUs(driver);
		//US.clickOnAboutUS();
	
		 Thread.sleep(2000);
		 US.ClickOnHome();
		 Thread.sleep(2000);
		 US.ClickOnSchizophrenia();
		 Thread.sleep(2000);
		 US.ClickOnApproach();
		 Thread.sleep(2000);
		 US.ClickonCS();
		 Thread.sleep(2000);
		 US.ClickOnOurTeam();
		 Thread.sleep(2000);
		 US.ClickOnTreatment();
		 Thread.sleep(2000);
		 US.ClickOnPatientCare();
		 Thread.sleep(2000);
		 US.ClickOnCourses();
		 Thread.sleep(2000);
		 US.ClickOnContact();
		 Thread.sleep(2000);
		 US.ClickOnBlog();
	}
	@Test(priority = 5, enabled=false)
	public void VerifyTherapyProcess() throws InterruptedException 
		{  Thread.sleep(2000);
		
		 TherapyProcess TP = new TherapyProcess(driver);
	     TP.ClickOnTherapy();
	     Thread.sleep(2000);
		}
	
	
	@Test(priority = 6, enabled=true)
	public void VerifyPrivacyPolicyFAQ() throws InterruptedException
	
	{ logger.info("..........VerifyPrivacyPolicyFAQ ...........");
	
		PrivacyPolicyFAQ PPF = new PrivacyPolicyFAQ(driver);
	    PPF.clickOnPrivacyPolicy();
	    Thread.sleep(2000);
	    //PPF.ClickONBookAnAppointment();//Option 1
	    //Thread.sleep(2000);
	   // PPF.ClickOnMobileNo();//Option 2
	    Thread.sleep(4000);
	    PPF.clickOnWhatsApp();
	   // PPF.clickOnContinuetoChat();//Option 3
	}
	

   @Test(priority = 7, enabled=false)
	public void VerifyContactMeTest() throws InterruptedException 
	
	{ 
	   logger.info("url opened");	
	   //System.out.println("Before Test executed");
		//driver.get(baseUrl);
		Thread.sleep(3000);
	logger.info("*************** TestCase Verify *****************"); 
    ContactMe contact = new ContactMe(driver);
  
    contact.clickOnContactMe();
	contact.EnterName("Shamali");
	contact.EnterEmail("abc@gmail.com");
	contact.EnterPhoneNo("123456789");
	contact.EnterMessage("Hello");
	Thread.sleep(3000);
    contact.clickOnSubmit();
    Thread.sleep(5000);
    
    // contact.clickOnCapcha();
    //contact.EnterReply("Thank you for submitting");
	System.out.println("Thank you for submitting!");
	
	driver.findElement(By.xpath("//*[@id=\"img_0_comp-l9d3d8do\"]/img")).click();
  	System.out.println("Open linkedIn");
  	Thread.sleep(2000);
  	
  	driver.findElement(By.xpath("//*[@id=\"img_1_comp-l9d3d8do\"]/img")).click();
  	System.out.println("Open instagram");
  	Thread.sleep(3000);
  	
 	driver.findElement(By.xpath("//*[@id=\"comp-lte5j3am\"]/a/div")).click();
  	System.out.println("Open MobileNo");
  	Thread.sleep(3000);
  	
  	driver.findElement(By.xpath("//*[@id=\\\"comp-lte5j3b3\\\"]/a")).click();
  	System.out.println("Open Whats app");
  	Thread.sleep(3000);
  	
  	driver.findElement(By.xpath("//*[@id=\"comp-lte5j3au\"]/a/div")).click();
  	System.out.println("Open Mails");
  	Thread.sleep(3000);
  	
  	driver.findElement(By.xpath("//*[@id=\"comp-lte5j3ab\"]/a/span"));
	System.out.println("Book Appoinment");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"comp-ktbpr8491\"]/p/span/a/span/span/span"));
	System.out.println("Call on this number");
	Thread.sleep(3000);
	}
	//logger.info("VerifyLogin - Passed");
   
	
	
	
	
	
	
}
