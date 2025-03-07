package Inheritance_prog;

interface Amazon {
	void login_with_email_id();
	void login_with_mobile_no();
}

public class MyClass implements Amazon
{
	public void login_with_email_id()
	{
		System.out.println("keep the real logic");
		
	}

	
	public void login_with_mobile_no()
	{
		System.out.println("keep the logic 1");
		
	}
	public static void main(String[] args) 
	{
		
	}

	
	

}
