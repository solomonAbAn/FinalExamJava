package Exam;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//INPUT WORD
		System.out.print("Enter a string: ");
		Scanner kb = new Scanner(System.in);
		String word = kb.next();
		System.out.println();
		kb.close();

		//EXTRACTING EACH LETTER AND PRINTING
		
		//FIRST HALF
		for (int i = 1; i <= word.length(); i++) {
			for (int j = 0 ; j <= word.length() - i; j++) {
				char letter = word.charAt(j);
				System.out.print(letter + "		");
				
			}
			System.out.println();
		}
		
		//SECOND HALF
		for (int i = 2; i <= word.length(); i++) {
			for (int j = 0 ; j <= i-1; j++) {
				char letter = word.charAt(j);
				System.out.print(letter + "		");
				
			}
			System.out.println();
		}


	}

}
