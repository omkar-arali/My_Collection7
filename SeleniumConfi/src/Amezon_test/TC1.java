package Amezon_test;

import org.testng.annotations.Test;

import Amezon_source.Homepage;
import Amezon_source.Login_amezon;

public class TC1 extends LaunchQuit {
	
	@Test
	public void login_to_amezon()
	   {
		Homepage h1 = new Homepage(driver);
		h1.accountlist(driver);
		h1.signin();
		
		Login_amezon l1 = new Login_amezon(driver);
		l1.un();
		l1.cnt();
		l1.pwd();
		l1.sing_in();
			
		}
	}


