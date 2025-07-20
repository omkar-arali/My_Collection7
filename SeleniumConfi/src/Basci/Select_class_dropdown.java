package Basci;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class_dropdown {
	
	//List of dropdown in element

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amezon.in/");
		driver.manage().window().maximize();
		WebElement e1 =	driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(e1);
		//s1.selectByValue("search-alias=stripbooks");
		
		List <WebElement> e4= s1.getOptions();
		System.out.println(e4.size());
		
		for(int i=0;i<=e4.size();i++)
		{
			WebElement e5 = e4.get(i);
			System.out.println(e5.getText());
		}

	}

}
