package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many number you`ll go digit? ");
		int n = sc.nextInt();
		// create vector n
		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter whit a number: ");
			// Storing a value in the vector
			vect[i] = sc.nextInt();

		}
		System.out.print("Negatives number: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		sc.close();
	}

}
