package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class addFile {


	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		driver.findElement(By.name("your-name")).sendKeys("om");
		driver.findElement(By.name("your-email")).sendKeys("om.@com");
		driver.findElement(By.name("telephone")).sendKeys("987654321");
		
		//driver.findElement(By.name("fax")).sendKeys("12");
		WebElement chosefile =	driver.findElement(By.name("profile-upload"));
		chosefile.sendKeys("C:\\Users\\Win-10\\Desktop\\UPLOAD\\Doc1.txt");
		
		WebElement e1 =	driver.findElement(By.id("select2-gender-07-container"));
		e1.sendKeys(Keys.ARROW_DOWN);
		e1.sendKeys(Keys.ENTER);

	}

}
