package TestCases;



//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;

import org.testng.annotations.DataProvider;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageObject.ContactMe;
import utilities.ReadExcelFile;




public class TC_ContactMeTestDataDrivenTesting extends Base_Class{
	
   @Test(dataProvider="ContactMeDataProvider")
 
	public void VerifyContactMeTest( String userEmail,String Message,String expecteduserName) throws InterruptedException 
	
	{ 
	  
    ContactMe contact = new ContactMe(driver);
  
    contact.clickOnContactMe();
	contact.EnterName("expecteduserName");
	contact.EnterEmail("userEmail");
	contact.EnterPhoneNo("123456789");
	contact.EnterMessage("Message");
	Thread.sleep(3000);
    contact.clickOnSubmit();
    Thread.sleep(5000);
	}
    
 
   
   @DataProvider(name = "ContactMeDataProvider")
   public String[][] ContactMeDataProvider()
   
	{
		//System.out.println(System.getProperty("user.dir"));
		//String fileName = System.getProperty("user.dir") + "\\TestData\\MyStoreTestData.xlsx";
   	String fileName = System.getProperty("webdriver.chrome.driver","C:\\Users\\SNEHA\\eclipse-workspace\\CPC_Project\\TestData\\Shamali.xlsx");
       int ttlRows = ReadExcelFile.getRowCount(fileName,"Sheet1");
		int ttlColumns = ReadExcelFile.getColCount(fileName,"Sheet1");
	    String data[][]=new String[ttlRows-1][ttlColumns];
       for(int i=1;i<ttlRows;i++)//rows =1,2
		{
			for(int j=0;j<ttlColumns;j++)//col=0, 1,2
			{

				data[i-1][j]=ReadExcelFile.getCellValue(fileName,"Sheet1", i,j);
			}

		}
		return data;
	}
	
	
	
	
}
