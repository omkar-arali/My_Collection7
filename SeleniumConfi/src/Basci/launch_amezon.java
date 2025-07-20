package Basci;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_amezon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin%26adgrpid%3D58746164597%26hvpone%3D%26hvptwo%3D%26hvadid%3D617721280249%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D8711652235092259652%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007789%26hvtargid%3Dkwd-298741529014%26hydadcr%3D5903_2362026%26mcid%3Dd1a83ba0cb4d35369c396cac55ec4ae4&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		/* using ID
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		Using X path 
		WebElement e1 = driver.findElement(By.xpath("(//input)[5]"));  
		e1.sendKeys("shoes");
		//e1.sendKeys(Keys.ENTER);
		
		WebElement e2 =driver.findElement(By.xpath("(//input)[6]"));
		e2.click();
		*/
		
		WebElement username = driver.findElement(By.xpath("(//input)[7]"));
		username.sendKeys("araliomkar007@gmail.com");
		
		WebElement conti =driver.findElement(By.xpath("(//input)[10]"));
		conti.click();
		
		WebElement pass = driver.findElement(By.xpath("(//input)[9]"));
		pass.sendKeys("@gmail123.com");
		
		WebElement sub =driver.findElement(By.xpath("(//input)[10]"));
		sub.click();
		
	}

}
