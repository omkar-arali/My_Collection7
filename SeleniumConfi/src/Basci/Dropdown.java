package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("searchDropdownBox")); 
		Select s1=new Select(e1);
		//s1.selectByVisibleText("Baby");
		s1.selectByVisibleText("Books");
		//e1.sendKeys(Keys.ENTER);
		e1.submit();
		
	}

}
