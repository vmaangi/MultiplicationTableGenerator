package day6;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) 
	
	
	{
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a number to print its multiplication table");
		
		
		int number = scanner.nextInt();
		
		System.out.println("Multiplication Table for "+number+ ":");
		
		for (int i=1; i<=10;i=i+1)
		
		{
			
			int result = number*i;
			//System.out.println(result);
			System.out.println(number + " x "+i+ "=" +result);
			
		}
		

	}

}
