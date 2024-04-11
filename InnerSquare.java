package Pattern;

import java.util.Scanner;

public class InnerSquare {
	
	static void square(int lr, int lc) {
		
		for(int r=1; r<=lr; r++) {
			
			for(int c=1; c<=lc; c++) {
				
				if(r==1 || c==1 || c==lc || r==lr || r==(lr/2)+1 && c<=(lc/2)+1 || c==(lc/2)+1 && r<=(lr/2)+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a First Number : ");
		int lr=sc.nextInt();
		System.out.println("Enter a Second Number : ");
	    int lc=sc.nextInt();

		square(lr,lc);
	}

}
