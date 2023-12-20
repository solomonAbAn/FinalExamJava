package Test;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		//USER INPUT
		System.out.println("Enter 3 2-digit numbers: ");
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int n3 = kb.nextInt();
		kb.close();
		System.out.println();

		
		//THE SUM
		int sum = n1 + n2 + n3;

		
		//THE MAGIC NUMBER
System.out.print("Your magic number is ");
		if (sum % 3 == 0) {
			if (sum % 5 != 0) {//1. A multiple of 3 but not a multiple of 5 then the magic number is made up of the 1st digit of n2 followed by the sum of n1 and n3.

				System.out.println((n2 / 10) + "" + (n1 + n3));
			} else {//3. A multiple of 3 and a multiple of 5 then the magic number is n2 followed by n1 followed by the digit 1.		

				System.out.println(n2 + "" + n1 + "1");
			}
		} else if (sum % 5 == 0) {//2. Not a multiple of 3 but a multiple of 5 then the magic number is made up of the sum of n1 and n3 followed by the last digit of n2.

			System.out.println((n1 + n3) + "" + (n2 % 10)); 
		} else {//4. None of the above conditions then the magic number is n1 followed by n2 followed by n3.

			System.out.println(n1 + "" + n2 + "" + n3);
		}
	}
}
