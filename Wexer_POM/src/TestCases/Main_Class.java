package TestCases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import PropertiesPackage.configuration;
import dd_core.testcore;




public class Main_Class{
	/*public static Properties obj= new Properties();*/
	public static WebDriver driver;
	
	
//	public Main_Class( WebDriver driver){
//		this.driver= driver;
//	}
	
	
	
//	
//	public static void main(String[] args) throws InterruptedException, IOException
//	{  
		/*FileInputStream fis = new FileInputStream("D:\\Selenium-Kuldeep\\CFL_POM\\src\\PropertiesPackage\\OR.properties");
		obj.load(fis);*/
		@Test
		public void setUp() throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium-Kuldeep\\CFL_POM\\geckodriver.exe");
//		WebDriver driver;	
		driver = new FirefoxDriver();
		driver.get(configuration.testsite);
		driver.manage().window().maximize();
		
		Log_In LI = PageFactory.initElements(driver, Log_In.class);
		MemberSearch MS	= 	LI.Log_In_Details("cfpro.admin@connectedfitnesslabs.com", "cfpr02017!");
		Workouts wrkts= MS.MemberSearch_Details("kuldeep");
		wrkts.WorkoutsList();
		Classes clss = wrkts.CreateWorkout();
		clss.ClassSection();
		Planner pln = clss.favoriteClass();
		Bioscore bs=pln.AddPlanner();
		Details dt = bs.ConductBioscore();
		dt.AboutYou();
		}
		
	//}
	
}
