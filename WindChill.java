package com.bridgelabz;
import java.util.Scanner;
public class WindChill {

	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("\n\nNote: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3 (you may assume that the values you get are in that range).");
			System.out.println("\n\nEnter the temperature(t) in Fahrenheit and Wind spped(v) in miles per hour");
			System.out.println("Temperature(t):");
			double t = sc.nextDouble();
			System.out.println("Wind speed(v):");
			double v = sc.nextDouble();
			double W=35.74 + (0.6215 * t) +( ( (0.4275 * t ) -35.75) * (Math.pow(v,0.16)));
			System.out.println("\n\nThe value of wind chill is "+W);
		}


	}