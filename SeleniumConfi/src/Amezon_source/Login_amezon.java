package Amezon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_amezon {
	
	EdgeDriver driver;
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement Pass;
	
	@FindBy(id="signInSubmit")
	WebElement singin_button;
	
	//step2
	public void un() {
		username.sendKeys("araliomkar007@gmail.com");
	}
	
	public void cnt() {
		continue_button.click();
	}
	public void pwd() {
		Pass.sendKeys("7709919775");
	}
	public void sing_in() {
		singin_button.click();
	}
	
	public Login_amezon(EdgeDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
