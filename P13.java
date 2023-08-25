/* Program : 13Write a Java program to get the larger value between first and
last element of an array (length 3) of integers. Go to the editor
Sample Output*/ 

import java.util.Scanner;
public class P13
{
    public static void main(String args[])
    {
        Scanner inp = new Scanner(System.in);
        int[] n = new int[3];
        
        for(int i = 0;i<3;i++)
        {
            System.out.print("Enter Number " + i + ": ");
            n[i] = inp.nextInt();
        }
        int large=0;
        int small=n[0];
        for(int i=0;i<3;i++)
        {
            if(n[i]>large)
            {
                large=n[i];
            }
            if(n[i]<small)
            {
                small=n[i];
            }
        }
        System.out.println(large + "is maximum number");
        System.out.println(small + "is minimum number");
    }
}