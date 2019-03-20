package dd_core;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Excelreader.ExcelReader;
import PropertiesPackage.configuration;

 public class testcore {

	public static Properties config = new Properties();
	public static Properties object = new Properties();
	public static ExcelReader excel = null;
	public static WebDriver driver= null;
	public static FileInputStream fis =null;

	 	
	@BeforeSuite
	public static void init() throws IOException, InterruptedException{
		if(driver==null)
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\PropertiesPackage\\configuration.java");
			config.load(fis);//loading config property file
			
			fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\dd_properties\\object.properties");
		object.load(fis); //loading object property file
	
		excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\PropertiesPackage\\data.xlsx");
		/*app_log.debug("loading the excel files");*/
		
		if(configuration.browser.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
		
		}else if(configuration.browser.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
				
		}else if(configuration.browser.equals("ie"))
		{
			
			System.setProperty("webdriver.ie.driver", "IEDriverserver.exe");
			driver = new InternetExplorerDriver();
				
		} 
		/*driver.get(configuration.testsite);*/
		Thread.sleep(6000l);
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
		driver.manage().window().maximize();
		
		}
		
		      	
	        
	          
	
	
	@AfterSuite
	public static void afterSuite()
	{
		System.out.println("end");
	}
	}
