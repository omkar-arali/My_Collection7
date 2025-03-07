package Program;

public class Prime_number {
	public static void main(String[] args) {
		int no=10;
		int temp=0;
		
		for(int i=2;i<no-i;i++)
		{
			if(no%2==0) 
			{
				temp=temp+i;
			}
		}
			if(temp==0) {
				System.out.println("given number is prime");
			}else {
				System.out.println("given number is not a prime");
			}
	}

}
