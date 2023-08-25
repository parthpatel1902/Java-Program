// 6. Reverse string
import java.util.Scanner;
class P6
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter String : ");
		String str = inp.nextLine();             // parth

		String sum = "";
		for(int i=0;i<str.length();i++)
		{
			char rev = str.charAt(i); //p a
			sum = rev + sum; // sum = p + "" // sum  = ap
			//System.out.println("Element : " + str.charAt(i));
		}
		System.out.print("Reverse string : " + sum);		
	}
}