package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
public static WebDriver driver;
public BasePage(WebDriver driver){
	this.driver=driver;
	
}
	
	public static void verifyTitles(String etitle){
		
		try{
			WebDriverWait wait = new WebDriverWait(driver,20);
			wait.until(ExpectedConditions.titleIs(etitle))	;
			Reporter.log("titles is matching",true);
		}
		
		catch(Exception e){
			Reporter.log("titles is not matching", true);
		}
		
	}
	
	public  static void verifyelements(WebElement element){
		
	try{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is visible",true);
		
	}
		catch(Exception e){
			Reporter.log("element is not visible",true);
		}
			
	}
		
		
	}
	
	

