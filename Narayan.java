package Pattern;

import java.util.Scanner;

public class Narayan {       // Pattern Name-inverted right angel trangel

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int m=sc.nextInt();
		
		sc.close();
		//System.out.println("Enter First Number : ");
		//int n=sc.nextInt();

		for(int i=1; i<=m; i++) 
		{
			for(int j=1; j<=m; j++)
				
			{
			   if(i==m||j==m ||i+j==6)
			   {
				   System.out.print("* ");
			   }
			   else
			   {
				   
				   System.out.print("  ");
			   }
			}
			System.out.println();
			}
	}

}
