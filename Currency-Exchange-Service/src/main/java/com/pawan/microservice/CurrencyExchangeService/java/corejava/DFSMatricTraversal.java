package corejava;

import java.util.Iterator;
import java.util.Scanner;

public class DFSMatricTraversal {

	public static void main(String[] args) {

		int[][] matrix = new int[4][5]; 
		
		Scanner sc = new Scanner(System.in);
		
		// insert value.
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j <5; j++) {
				
				System.out.println("Enter the value ::");
				
				matrix[i][j] = sc.nextInt();
				
			}
		}
		
		 System.out.println("Elements of the matrix are");
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 5; j++)
                 System.out.print(matrix[i][j] + " \t1 ");
             System.out.println();
         }
     }
		
		

	

}
