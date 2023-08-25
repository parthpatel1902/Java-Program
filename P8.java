//8. Write a Java program to print the ascii value of a given character. 

import java.util.Scanner;

class P8
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter Character : ");
		String str = inp.nextLine();
		char p8 = str.charAt(0);	
		int num = p8;
		System.out.print("ASCII Value Of Given Character : " + num);
			
	}
}