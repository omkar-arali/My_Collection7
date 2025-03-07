package basic_program;

import java.util.Arrays;

public class Exp_String {
	public static void main(String[] args) {
		String s1="Jayashree";
		//boolean b1 = s1.equalsIgnoreCase("jayashree");
		System.out.println(s1.equalsIgnoreCase(s1));
		
		//string is empty or not
		String s2="";
		System.out.println(s2.isEmpty());
		
		//end latter string
		String s3="manish";
		System.out.println(s3.endsWith("g"));
		
		String s4 = "my name is ram";
		String s5[]=s4.split(" ");
		System.out.println(Arrays.toString(s5));
		
		String s6[]=s4.split(" ",2);
		System.out.println(Arrays.toString(s6));
		
	
		System.out.println(s3.repeat(2));
		
		
		
		
		
	}
	
	

}
