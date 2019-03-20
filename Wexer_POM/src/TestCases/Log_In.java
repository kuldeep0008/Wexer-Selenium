package TestCases;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PropertiesPackage.configuration;
import dd_core.testcore;
import utilities.util;



public class Log_In extends Main_Class {
	
	
	
	
	public Log_In( WebDriver driver)
	{
	//	this.driver= driver;
	this.driver= driver;
			
	

			}
	@FindBy(xpath=configuration.email)
	WebElement email;
	
	@FindBy(xpath=configuration.password)
	WebElement password;
	
	@FindBy(xpath=configuration.countryDropdown)
	WebElement countryDropdown;
	
	@FindBy(xpath=configuration.countryName)
	WebElement countryName;
	
	@FindBy(xpath=configuration.Signup)
	WebElement Signup;
	
	@Test(dataProvider ="getData")
	public MemberSearch Log_In_Details(String email, String password) throws InterruptedException, IOException
	{
		
	this.email.sendKeys(email);
		Thread.sleep(3000l);
		/* util.CaptureScreenshot();*/
		 Thread.sleep(3000l);
		this.password.sendKeys(password);
		countryDropdown.click();
		countryName.click();
		Signup.click();
		return PageFactory.initElements(driver, MemberSearch.class);
		
	}

@DataProvider
public Object[][] getData(){
	return util.getData("Log_In");
}

}
	