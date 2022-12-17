package qs;

import java.util.Scanner;

public class AdditonOfTwoMatrix {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("no of rows");
		
		int rows= sc.nextInt();
		
		System.out.println("no of cols");
		
	    int cols= sc.nextInt();
	    
	    System.out.println("first matrix");
	    
	    int fm [][]= new int [rows][cols];
	    
	    int sm [][]= new int [rows][cols];
	    
	    int rm [][]= new int [rows][cols];
	    
	    System.out.println("Enter elements of first matrix");
	    
	    for(int i=0; i<rows;i++) {
	    	
	    	for(int j=0;j<cols;j++) {
	    		
	    		fm[i][j]=sc.nextInt();	
	    	}	    	
	    }
	    
	    System.out.println("Print the first matrix");

        for(int i=0;i<rows;i++) {
	    	
	    	for(int j=0;j<cols;j++) {
	    		
	    		System.out.print(fm[i][j]+"\t");	   		
	    		}	
	    	
	    	System.out.println();
        }
	    	
	    System.out.println("Enter elements of second matrix");
	    
         for(int i=0; i<rows;i++) {
	    	
	    	for(int j=0;j<cols;j++) {
	    		
	    		sm[i][j]=sc.nextInt();	
	    	}	    	
	    }         
         System.out.println("Print the second matrix");

         for(int i=0;i<rows;i++) {
 	    	
 	    	for(int j=0;j<cols;j++) {
 	    		
 	    		System.out.print(sm[i][j]+"\t");	   		
 	    	}	              
	    	System.out.println();
	    }
	   
         //logic for addition of two matrices
         
         for(int i=0; i<rows;i++) {
 	    	
 	    	for(int j=0;j<cols;j++) {
 	    		
 	    		rm[i][j]= fm[i][j]-sm[i][j]; 	
 	    	}	    	
 	    } 
         
         System.out.println("Print the addition of matrix");

         for(int i=0;i<rows;i++) {
 	    	
 	    	for(int j=0;j<cols;j++) {
 	    		
 	    		System.out.print(rm[i][j]+"\t");	   		
 	    	}	              
	    	System.out.println();
	    }
	}

	}

