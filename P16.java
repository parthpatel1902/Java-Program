import java.util.Scanner;

class P16
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		
		int a[] = new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter Element : ");
			a[i] = inp.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				int temp = 0;
				if(a[j]>a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}