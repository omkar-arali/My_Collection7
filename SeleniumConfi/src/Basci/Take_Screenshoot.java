package Basci;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_Screenshoot {
	public static void main(String[] args) throws IOException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.hdfc.com/");
		driver.manage().window().maximize();
		EdgeDriver ts = driver;
		File source =	ts.getScreenshotAs(OutputType.FILE);
		File destinatuion=new File("C:\\Users\\Win-10\\Desktop\\UPLOAD\\SS"+ Math.random() +".png");
		//File destinatuion=new File("C:\\Users\\Win-10\\Desktop\\UPLOAD\\SS");
		FileHandler.copy(source, destinatuion); 
}
}
