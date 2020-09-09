package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage {

	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

@FindBy(id="txtUsername")
	private WebElement usernametxtbox;
@FindBy(id="txtPassword")
private WebElement pwdtxtbox;

@FindBy(id="btnLogin")
private WebElement loginbtn;

@FindBy(id="menu_pim_viewPimModule")
private WebElement pim;

@FindBy(id="menu_pim_viewEmployeeList")
private WebElement emplist;



	
	
	
	public void setUserName(String un){
		usernametxtbox.sendKeys(un);
	}
	
	
	public void setPwd(String pwd){
		
			pwdtxtbox.sendKeys(pwd);
		}
	
	
	public void clickLoginBtn(){
	loginbtn.click();

	}
	
	public void clickPIM(){
		pim.click();
	}
	
	public void clickEmpList(){
		emplist.click();
	}
	
	
}
