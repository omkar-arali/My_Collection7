package Basci;

import org.openqa.selenium.edge.EdgeDriver;

public class CopyPaste {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

}
