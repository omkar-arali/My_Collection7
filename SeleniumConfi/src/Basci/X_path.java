package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class X_path {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/x-path/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("omkar");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("arali");
		driver.findElement(By.xpath("//input[@id='MiddleName']")).sendKeys("s");
		driver.findElement(By.xpath("//input[@id='Work-Place-Address']")).sendKeys("pune , maharastra");
	}

}
