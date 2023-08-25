// 1. Write a Java program to print the sum of two numbers.

import java.io.*;
class P1
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c;
		a = Integer.parseInt(inp.readLine());
		b = Integer.parseInt(inp.readLine());
		c = a + b;
		System.out.println("Sum of Two Number : " + c);	
	}
}