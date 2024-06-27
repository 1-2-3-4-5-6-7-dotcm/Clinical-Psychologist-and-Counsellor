package TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;
//import org.testng.annotations.Test;


public class Base_Class {
	ReadConfig readConfig = new ReadConfig(); 
	String url = readConfig.getbaseUrl();
	String browser = readConfig.getBrowser();
	
	public static WebDriver driver ;
	public static Logger logger;

	
@BeforeClass
	public void setup() throws InterruptedException
	{	
	
   logger = LogManager.getLogger("CPC_Project");
     switch(browser.toLowerCase())
		{

		case "chrome":
			WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SNEHA\\eclipse-workspace\\CPC_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		break;
		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
	    case "firefox":
	    	WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
			break;
		default :	
			driver = null;
			break;
		}		
	System.out.println("Before Test executed");
		
     
	 //maximise windows
	
      	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		    
	//for logging
		 driver.get(url);
		  Thread.sleep(1000);
		logger.info("url opened");

	
	//PropertyConfigurator.configure("C:\\Users\\SNEHA\\eclipse-workspace\\CPC_Project\\Resources\\log4j.properties");
       
   
    
	
	}
	
	@AfterClass
	public void teardown()
	{
	driver.close();
	driver.quit();
	}
	
	
}
