package basic_program;

import java.util.Scanner;

public class array_prg 
{
	public static void main(String[] args) 
	{
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = S1.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter " + size + " element");
		for(int i=0;i<size;i++)
		{
			array[i]=S1.nextInt();
		}
		System.out.println("array element are:");
		for(int num:array)
		{
			System.out.println(num + " ");
		}
		S1.close();
		
	}
}
