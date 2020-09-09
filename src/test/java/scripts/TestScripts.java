package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.GenericUtils;
import pom.HomePage;


public class TestScripts extends BaseTest{
	
	@Test(enabled=false)
	public void testCreateEmployee() throws InterruptedException{
		HomePage p = new HomePage(driver);
		
		p.setUserName("Admin");
		p.setPwd("admin123");
		p.clickLoginBtn();
		BasePage.verifyTitles("ORANGEHRM");
		
		Thread.sleep(2000);
		p.clickPIM();
		Thread.sleep(2000);
		p.clickEmpList();
		
		
	}
	
	@Test(enabled=true)
	public void sortListBox() {
		
HomePage p = new HomePage(driver);
		
		p.setUserName("Admin");
		p.setPwd("admin123");
		p.clickLoginBtn();
		BasePage.verifyTitles("ORANGEHRM");
		
		
		p.clickPIM();
		
		p.clickEmpList();
		GenericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
		
			
		
		
		
	}
	
	

}
