package basic_program;

public class Rev_str {
	public static void main(String[] args) {
		String name = "india is my country";
		String input=name.toLowerCase();
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
		}
		System.out.print(reverse);
	}

}
