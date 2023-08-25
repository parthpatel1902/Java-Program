//11. Write a Java program to capitalize the first letter of each word in a sentence
class P11a
{
	public String capitalizeWord(String str)
	{  
		String words[]=str.split(" ");  
    	String capitalizeWord="";  
    	for(String w:words)
		{  
        	String first=w.substring(0,1);  
			System.out.println(first);
        	String afterfirst=w.substring(1);
			System.out.println(afterfirst);
        	capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
    	}  
   		return capitalizeWord.trim();  
	}  
}	
   
public class P11
{  
	public static void main(String[] args) 
	{  		
		P11a obj = new P11a();
    	System.out.println(obj.capitalizeWord("my name is xyz"));  
   	}  
}  