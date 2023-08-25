// P12.Write a Java program to reverse a word.
import java.util.Scanner;

class P12
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = inp.nextLine();
		int i;
		String newStr = "";
		String newStr1 = "";
		
		for(i = 0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			
			if(Character.isWhitespace(ch)){
				String[] strs = str.split(" ");
				String s1 = strs[0];
				String s2 = strs[1];
				
				for(i=0;i<s1.length();i++){
					char ch1 =s1.charAt(i);
					newStr = ch1 + newStr;
				}
				
				for(i=0;i<s2.length();i++){
					char ch2 =s2.charAt(i);
					newStr1 = ch2 + newStr1;
				}
			}
		}
		System.out.println("Reverse String : " + newStr + " " + newStr1);
	}
	
}