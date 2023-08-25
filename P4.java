//4. Write a Java program and compute the sum of the digits of an
//integer. Go to the editor
//Input Data:
//Input an integer: 25
//Expected Output 

import java.util.Scanner;
class P4
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int n = inp.nextInt();
		
		int sum=0;
		int rem,rev;

		while(n>0)
		{
			rem = n % 10;
			rev = rem;
			sum+=rev;
			n = n / 10;
		};
		System.out.println("Sumation : " + sum);		
					
	}
}