package Test;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write the java program which is getting the integer from user and name it N. Creating the two by two array with the size of N*N.
		//integer from user
		//N
		//N*N array
		
		//INPUT
		System.out.println("Please put your N value ?");
		Scanner kb = new Scanner(System.in);
		double inputN = kb.nextDouble();
        int N = (int) Math.floor(inputN);
		
		int[][] array = new int[N][N];
		
		
		
//		Getting the values from user and filled the array.
		
		for(int i=0;i<array.length;i++) {
			for(int k=0; k<array.length; k++) {
				double index = kb.nextDouble();
				array[i][k] = (int) Math.floor(index);
				
			}
			
		}
		kb.close();
		System.out.println();
		
		reverseColumns(array);
		
	}		
		
//		Write the method to take the array as a parameter and reverse the columns.
	  public static void reverseColumns(int[][] array) {
	        for (int i = array.length - 1; i >= 0; i--) {
	            for (int j = 0; j < array.length; j++) {
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
			
			
			
			
		
		
		
		
//		The box below illustrates how your program should behave and appear. Text in green is user input.
	

}
