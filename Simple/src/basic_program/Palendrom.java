package basic_program;

public class Palendrom {
	public static void main(String[] args)
	{
		String name = "moa";
		String input=name.toLowerCase();
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		boolean result=name.equals(reverse);
		System.out.println(result);
	if(result==true)
	{
		System.out.println("string is palendrom");
	}
	else {
		System.out.println("string is not palendrom");
         }
}
}