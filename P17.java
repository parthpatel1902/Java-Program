// 17.Write a program to add two numbers using function overloading.

import java.util.Scanner;

class P17a
{
	Scanner inp = new Scanner(System.in);
	int n1,n2;
	int x,y;
	public void sum()
	{
		System.out.print("Enter Number 1: ");
		n1 = inp.nextInt();
		
		System.out.print("Enter Number 1: ");
		n2 = inp.nextInt();
	}
	
	public int sum(int a,int b)
	{
		x = a;
		y = b;
		return x+y;
	}
	
}

class P17
{
	public static void main(String args[])
	{
		P17a obj = new P17a();
		obj.sum();
		System.out.println(obj.sum(obj.n1,obj.n2));
	}
}