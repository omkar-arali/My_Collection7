package Basci;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handover {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accountandlist =	driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		Actions a1 =new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		

	}

}
