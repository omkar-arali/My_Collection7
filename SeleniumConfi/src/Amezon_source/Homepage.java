package Amezon_source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	//step1
	EdgeDriver driver;
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement accountandlist;
	
	@FindBy(xpath="//span[.='Sign in'][1]")
	WebElement signinbutton;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_it;
	
	//step2
	public void accountlist(EdgeDriver driver) {
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	
	public void signin() {
		signinbutton.click();
	}
	public Homepage(EdgeDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void search_it() {
		search_it.sendKeys("shoe"+Keys.ENTER);
	}
}
