//7. Write a Java program to count the letters, spaces, numbers and
//other characters of an input string. 

import java.util.Scanner;

class P7
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = inp.nextLine();	

		int conum = 0;
		int colett = 0;
		int cospac = 0;
		int couther = 0;
	
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isAlphabetic(ch))
			{
				colett++;
			}
			else if(Character.isDigit(ch))
			{
				conum++;
			}
			else if(Character.isWhitespace(ch))
			{
				cospac++;
			}
			else
			{
				couther++;
			}

		}
		System.out.println("Number Is : " + conum);
		System.out.println("Letter Is : " + colett);
		System.out.println("Whitespace Is : " + cospac);
		System.out.println("Other char Is : " + couther);
	
	}
}