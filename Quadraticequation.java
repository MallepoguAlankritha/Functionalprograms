package com.bridgelabz;
import java.util.Scanner;  
public class Quadraticequation 
{ 
	
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("To find the roots of (a*X*X + b*X + c)");
			System.out.println("Enter the value for a,b,c");
			System.out.println("a:");
			double a=sc.nextDouble();
			System.out.println("b:");
			double b=sc.nextDouble();
			System.out.println("c:");
			double c=sc.nextDouble();
			double delta= ( b * b )-( 4 * a * c);
			int root1=(int) ( -b + (int)(Math.sqrt((delta))/(2*a)));
			int root2= (int) (-b - (int)(Math.sqrt((delta))/(2*a)));
			System.out.println("The roots are (x"+root1+") (x"+root2+")");;
		}

	}

