package qs;

import java.util.Scanner;

public class Iterateamatrix {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter total number of rows");
		
		int rows= sc.nextInt();
		
		System.out.println("Enter total number of cols");
		
		int cols=sc.nextInt();		
				
		int a[][]=  new int [rows][cols];
		
		System.out.println("please enter matrix data");
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
				a[i][j]= sc.nextInt();					
			}
		}

		System.out.println("Print the matrix");
		
          for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
				System.out.print(a[i][j]+"\t");				
			}
			
			System.out.println();
		}
	}

}
