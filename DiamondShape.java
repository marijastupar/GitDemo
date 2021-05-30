package petiProjekat;

import java.util.Scanner;

public class DiamondShape {

	public static void main(String[] args) {
		
		System.out.println("Unesite n:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			
			for(int j = n ; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<= i*2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i = n-1; i >0; i--) {
			
			for(int j = n-1 ; j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j<= i*2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
