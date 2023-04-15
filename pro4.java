// Online Java Compiler
// Use this editor to write, compile and run your Java code onlin
// Java Program to Count Positive and Negative Numbers in an Array
import java.util.Scanner;
 class pro4{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i;
		int  negativeCount = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please Enter Number of elements in an array : ");
		Size = sc.nextInt();	
		
		int [] a = new int[Size];
		
		System.out.print(" Please Enter " + Size + " elements of an Array  : ");
		for (i = 0; i < Size; i++)
		{
			a[i] = sc.nextInt();
		}   

		for(i = 0; i < Size; i++)
		{
			if(a[i] < 0)
			{
			
			 negativeCount++;
			}
		}		
	
		System.out.println("\n Total Number of Negative Numbers in this Array = " + negativeCount);
	}
}