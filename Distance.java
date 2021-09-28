package com.bridgelabz;
import java.util.Scanner;

public class Distance {
            public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the X1 , Y1 value to calculate the euclidean distance Where as X2,Y2 is Origin");
			System.out.println("X2 :");
			int x2=sc.nextInt();
			System.out.println("y2 :");
			int y2=sc.nextInt();
			distance(x2,y2);
		}

		private static void distance(int x2, int y2) {
			int sqr1= (int) Math.pow(2, x2);
			int sqr2= (int) Math.pow(2, y2);
			double result = (Math.sqrt ( sqr1 + sqr2 ) );
			System.out.println("The Euclidean distance of the points is "+result);
		}
	}