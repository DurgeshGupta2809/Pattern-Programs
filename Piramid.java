package Pattern;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		for(int r=1; r<=n; r++)         //Rows
		{
			for(int s=1; s<=(n-r); s++)     //Spaces
			{
				System.out.print("  ");
			}
			for(int c=1; c<=((r*2)-1); c++)
			{
			System.out.print(r+" ");
			}
			System.out.println();
		}

	}

}
