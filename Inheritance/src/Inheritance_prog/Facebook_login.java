package Inheritance_prog;
interface Email
{
	void email_as_an();
}
interface Mobile_no
{
	void Mobile_no_as_an();
}
public class Facebook_login implements Email,Mobile_no
{
	public void Mobile_no_as_an() 
	{
		System.out.println("login as mobile");
		
	}
	public void email_as_an()
	{
		System.out.println("login as email");
		
	}
	public static void main(String[] args) 
	{
		Facebook_login f1=new Facebook_login();
		f1.email_as_an();
		f1.Mobile_no_as_an();
		
	}
}
