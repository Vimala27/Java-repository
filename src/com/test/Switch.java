package com.test;

import java.util.Scanner;

public class Switch {

	
		public static void main(String[] args) {
			Scanner ob=new Scanner(System.in);
			int a;
			System.out.println("enter any number between 1 to 7");
			a=ob.nextInt();
			
			switch(a)
			{
			case 1:System.out.println("it is sunday");
			break;
			case 2:System.out.println("it is monday");
			break;
			case 3:System.out.println("it is tuesday");
			break;
			case 4:System.out.println("it is wednesday");
			break;
			case 5:System.out.println("it is thuyday");
			break;
			case 6:System.out.println("it is friday");
			break;
			case 7:System.out.println("it is satday");
			break;
			default:System.out.println("wrng input !!");
			}
		
	}

}
