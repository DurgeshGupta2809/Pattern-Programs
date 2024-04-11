package Pattern;

import java.util.Scanner;

public class Holoo {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a First Number : ");
		int m=sc.nextInt();
		System.out.println("Enter a Second Number : ");
		int n=sc.nextInt();
		
		 for(int r=1; r<=m; r++) {
			
			for(int c=1; c<=n; c++)
			{
				if(c==1 || c==m || r==c) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
			

	}
		

}
