package Pattern;

import java.util.Scanner;

public class Ganga {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Row Number : ");
		int rn=sc.nextInt();
		
		System.out.println("Enter a Column Number : ");
		int cn=sc.nextInt();
		
		for(int r=1; r<=rn; r++)
		{
			for(int c=1; c<=cn; c++)
			{ 
				if(r==1||r==rn||c==1||c==cn)
				{
				System.out.print("# ");
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
