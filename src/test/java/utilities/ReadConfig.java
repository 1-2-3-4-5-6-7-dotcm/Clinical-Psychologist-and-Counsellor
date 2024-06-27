package utilities;

import java.util.Properties;

import java.io.FileInputStream;

public class ReadConfig {
	Properties properties;
	String Path = "C:\\Users\\SNEHA\\eclipse-workspace\\CPC_Project\\Configuration\\config.properties";
	//String Path ="C:\\Users\\SNEHA\\eclipse-workspace\\Clinical_Psychotherapist_&_Counsellor\\bin\\com\\clinic\\repository\\config.properties";
	
	//constructor
	public ReadConfig() {
		try {
		properties = new Properties() ;
		
		FileInputStream fis = new FileInputStream(Path);
		properties.load(fis);
		
		}catch(Exception  e) {
			e.printStackTrace();
		}
		
	}
     public String getbaseUrl() 
     {
    	 String value = properties.getProperty("baseUrl");
    	 if (value != null)
    		 return value;
    	 else 
    		 throw new RuntimeException("url not specified in config file"); 
     }
     
     
     public String getBrowser() 
     {
    	 String value = properties.getProperty("browser");
    	 if (value != null)
    		 return value;
    	 else 
    		 throw new RuntimeException("url not specified in config file"); 
     }
}
