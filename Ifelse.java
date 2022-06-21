package loop;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) 
	{
		int age;
		Scanner s= new Scanner (System.in);
		System.out.println("Enter age : ");
		age=s.nextInt();
		if(age >=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not eligible for vote");
		}
		
	
	}

}
