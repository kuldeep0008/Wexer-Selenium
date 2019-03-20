package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Bioscore {
	WebDriver driver;
	public void Details(WebDriver driver) {
		this.driver =driver;
	}
	
	@FindBy(how=How.XPATH, using ="/html/body/div[3]/div/div/div[1]/div/div/ul[2]/li[5]/a")
	WebElement BioscoreTab;
	@FindBy(how=How.XPATH, using ="/html/body/div[3]/div/div/div[2]/div/div/div/section/div/form/div[4]/div/div/a")
	WebElement ConductBioscoreButton;
	
	public Details ConductBioscore() throws InterruptedException {
		Thread.sleep(6000l);
		BioscoreTab.click();
		Thread.sleep(3000l);
		ConductBioscoreButton.click();
		return PageFactory.initElements(driver, Details.class );
		
	}

}
