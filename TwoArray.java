package com.bridgelabz;
import java.util.Scanner;

public class TwoArray {

	
	    public static void main(String[] args) {
	        Scanner ar=new Scanner(System.in);
	        System.out.println("\nEnter the number of rows and columns:");
	        System.out.println("rows:");
	        int m =ar.nextInt();
	        System.out.println("column:");
	        int n =ar.nextInt();
	        int[][] arr=new int[m][n];
	        for(int i=0;i<m;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                System.out.println("Enter the value of "+i+" row , "+j+" column:");
	                arr[i][j]=ar.nextInt();
	            }
	        }
	        System.out.println("\nThe value in matrix is");
	        for(int i=0;i<m;i++)
	        {
	            for(int j=0;j<n;j++)
	            {
	                System.out.println("\narr["+i+"]["+j+"]: "+arr[i][j]);
	            }
	        }

	    }
	}